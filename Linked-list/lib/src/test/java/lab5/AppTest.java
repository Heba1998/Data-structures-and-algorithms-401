package lab5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void emptyList() {
        LinkedList testList = new LinkedList();
        assertEquals( "" , testList.toString() );
        assertEquals( null , testList.head );
    }

    @Test void propertyList() {
        LinkedList testList = new LinkedList();
        testList.insert(3);
        testList.insert(2);
        testList.insert(1);
        String resultString = "{ 1 } -> { 2 } -> { 3 } -> NULL";

        assertEquals( resultString , testList.toString() );
        /* ----   OR    ---- */
        assertEquals( 2 , testList.head.next.value );
        assertEquals( 3 , testList.head.next.next.value );
        assertEquals( null , testList.head.next.next.next );
    }

    @Test void propertyHead() {
        LinkedList testList1 = new LinkedList();
        testList1.insert(0);
        testList1.insert(2);
        testList1.insert(4);
        LinkedList testList2 = new LinkedList();
        testList2.insert(3);
        testList2.insert(6);
        testList2.insert(9);
        LinkedList testList3 = new LinkedList();
        testList3.insert(1);
        testList3.insert(5);
        testList3.insert(10);

        assertEquals( 4 , testList1.head.value );
        assertEquals( 9 , testList2.head.value );
        assertEquals( 10 , testList3.head.value );
    }

    @Test void multipleNode() {
        LinkedList testList = new LinkedList();
        testList.insert(10);
        testList.insert(20);
        testList.insert(30);
        String resultString = "{ 30 } -> { 20 } -> { 10 } -> NULL";
        assertEquals( resultString , testList.toString() );
    }

    @Test void includesTest() {
        LinkedList testList = new LinkedList();
        testList.insert(1);
        assertEquals( true , testList.includes(1) );
        assertEquals( false , testList.includes(5) );
    }

    @Test void returnCollection () {
        LinkedList testList = new LinkedList();
        testList.insert(1);
        testList.insert(4);
        testList.insert(7);
        String resultString = "{ 7 } -> { 4 } -> { 1 } -> NULL";
        assertEquals( resultString , testList.toString() );
    }}