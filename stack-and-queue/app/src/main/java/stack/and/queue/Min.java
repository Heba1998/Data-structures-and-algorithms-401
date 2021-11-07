package stack.and.queue;

public class Min {
    private Stack<Integer> s;       // main stack to store elements
    private Stack<Integer> aux;     // auxiliary stack to store minimum elements

    // Constructor
    public Min()
    {
        s = new Stack<>();
        aux = new Stack<>();
    }

    // Inserts a given element on top of the stack
    public void push(int x)
    {
        // push the given element into the main stack
        s.push(x);

        // if the auxiliary stack is empty, push the given element into it
        if (aux.isEmpty()) {
            aux.push(x);
        }
        else {
            // push the given element into the auxiliary stack
            // if it is less than or equal to the current minimum
            if (aux.peek() >= x) {
                aux.push(x);
            }
        }
    }

    // Removes the top element from the stack and returns it
    public int pop()
    {
        if (empty())
        {
            System.out.println("Stack underflow!!");
            return -1;
        }

        // remove the top element from the main stack
        int top = s.pop();

        // remove the top element from the auxiliary stack
        // only if it is minimum
        if (top == aux.peek()) {
            aux.pop();
        }

        // return the removed element
        return top;
    }

    // Returns the top element of the stack
    public int peek() {
        return s.peek();
    }

    // Returns the total number of elements in the stack

    // Returns the true if the stack is empty; false otherwise
    public boolean empty() {
        return s.isEmpty();
    }

    // Returns the minimum element from the stack in constant time
    public int min()
    {
        if (aux.isEmpty())
        {
            System.out.print("Stack underflow!! ");
            return -1;
        }

        return aux.peek();
    }
}