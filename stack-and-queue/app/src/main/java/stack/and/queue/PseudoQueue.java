package stack.and.queue;

public class PseudoQueue<T> {
       public Stack<T> Stack1 = new Stack<>();
       public Stack<T> Stack2 = new Stack<>();

    public void enqueue(T data) {
        Stack1.push(data);
        }


        public T dequeue() {
            {
                while (!Stack1.isEmpty()){
                    Stack2.push(Stack1.pop());
                }
                T firstElementPushed= Stack2.pop();
                while (!Stack2.isEmpty()){
                    Stack1.push(Stack2.pop());
                }
                return firstElementPushed;
            }}


    @Override
    public String toString() {
        if (Stack1.isEmpty()){
            return "The list is empty";
        }
        return "Stack1= " + Stack1;
    }
}
