package stack.and.queue;

public class Min {
    private Stack<Integer> s;
    private Stack<Integer> aux;

    public Min() {
        s = new Stack<>();
        aux = new Stack<>();
    }

    public void push(int x) {
        s.push(x);
        if (aux.isEmpty()) {
            aux.push(x);
        }
        else {
            if (aux.peek() >= x) {
                aux.push(x);
            }
        }
    }
    public int pop()
    {if (empty()) {
            System.out.println("Stack underflow!!");
            return -1;
        }
        int top = s.pop();
        if (top == aux.peek()) {
            aux.pop();
        }

        return top;
    }

    public int peek() {
        return s.peek();
    }
    public boolean empty() {
        return s.isEmpty();
    }
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