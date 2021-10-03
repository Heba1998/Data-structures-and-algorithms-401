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
        assertEquals( 2 , testList.head.next.value );
        assertEquals( 3 , testList.head.next.next.value );
        assertEquals( null , testList.head.next.next.next );
    }

    @Test void propertyHead() {
        LinkedList testList1 = new LinkedList();
        testList1.insert(0);
        testList1.insert(2);
        testList1.insert(4);

        assertEquals( 4 , testList1.head.value );
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
    }


    @Test void appendTest () {
        LinkedList testList = new LinkedList();
        testList.insert(0);
        testList.insert(1);
        testList.append(6);
        String resultString = "{ 1 } -> { 0 } -> { 6 } -> NULL";
        assertEquals( resultString , testList.toString() );
    }

    @Test void appendMultiTest () {
        LinkedList testList = new LinkedList();
        testList.insert(0);
        testList.insert(1);
        testList.append(6);
        testList.append(7);
        String resultString = "{ 1 } -> { 0 } -> { 6 } -> { 7 } -> NULL";
        assertEquals( resultString , testList.toString() );
    }

    @Test void beforeMiddleTest () {
        LinkedList testList = new LinkedList();
        testList.append(5);
        testList.append(7);
        testList.append(8);
        testList.insertBefore(7,6);
        String resultString = "{ 5 } -> { 6 } -> { 7 } -> { 8 } -> NULL";
        assertEquals( resultString , testList.toString() );
    }

    @Test void beforeFirstTest () {
        LinkedList testList = new LinkedList();
        testList.append(6);
        testList.append(7);
        testList.append(8);
        testList.insertBefore(6,5);
        String resultString = "{ 5 } -> { 6 } -> { 7 } -> { 8 } -> NULL";
        assertEquals( resultString , testList.toString() );
    }

    @Test void afterMiddleTest () {
        LinkedList testList = new LinkedList();
        testList.append(6);
        testList.append(7);
        testList.append(9);
        testList.insertAfter(7,8);
        String resultString = "{ 6 } -> { 7 } -> { 8 } -> { 9 } -> NULL";
        assertEquals( resultString , testList.toString() );
    }

    @Test void afterLastTest () {
        LinkedList testList = new LinkedList();
        testList.append(6);
        testList.append(7);
        testList.append(8);
        testList.insertAfter(8,9);
        String resultString = "{ 6 } -> { 7 } -> { 8 } -> { 9 } -> NULL";
        assertEquals( resultString , testList.toString() );
    }


}