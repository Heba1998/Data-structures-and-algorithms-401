/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.and.queue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

//________________________Slack test_________________________________--
@Test void pushEmptyStack() {
    Stack<Integer> stackList = new Stack<>();
    assertEquals("The List is empty",stackList.pop());
    assertEquals("The List is empty",stackList.peek());
    stackList.push(2);
    assertEquals( "Top = 2 -> Null" , stackList.toString());
}


@Test void pushStack() {
    Stack<String> List = new Stack<>();
    List.push("A");
    List.push("B");
    List.push("C");
    assertEquals( "Top = C -> B -> A -> Null" , List.toString());
}


    @Test void pop() {
        Stack<Integer> stackList = new Stack<>();
        stackList.push(1);
        stackList.push(2);
        stackList.push(3);
        assertEquals( 3 , stackList.pop() );
    }


    @Test void peek() {
        Stack<String> stackList = new Stack<>();
        stackList.push("A");
        stackList.push("B");
        stackList.push("C");
        stackList.pop();
        stackList.pop();
        assertEquals( "A" , stackList.peek());
    }

    @Test void emptyStack() {
        Stack<Integer> stackList = new Stack<>();
        stackList.push(1);
        stackList.push(2);
        stackList.push(3);
        stackList.pop();
        stackList.pop();
        stackList.pop();
        assertEquals( "null" , stackList.toString());
    }



    @Test void instantiateEmptyStack() {
        Stack<Integer> stackList = new Stack<>();
        assertEquals( "null" , stackList.toString());
    }

}