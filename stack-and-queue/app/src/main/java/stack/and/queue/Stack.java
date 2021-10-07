package stack.and.queue;

public class Stack<T> {

   Node<T> top;

    public Stack() {
    }
    public void push(T data) {
        if (isEmpty()) {
            Node<T> node = new Node<T>(data);
            top = node;
        } else {
            Node<T> node = new Node<T>(data);
            node.setNext(top);
            top = node;
        }
    }

    public T pop() {
        if (isEmpty()) {
            return (T) "The List is empty";
        } else {
            T data = top.getData();
            top = top.getNext();
            return (T) data;
        }
    }

    public T peek() {
        if (isEmpty()) {
            return (T) "The List is empty";
        } else {
            return (T) top.getData();
        }
    }

    public boolean isEmpty() {
        if (top == null) return true;
        return false;
    }


    @Override
    public String toString() {
        if (isEmpty()) {
            return "null";
        } else {
        String list = "Top = ";
        Node<T> node = top;
        while (node != null){
            list += node.getData()+ " -> ";
            node = node.getNext();
        }
        list += "Null";
        return list;
    }
    }
}
