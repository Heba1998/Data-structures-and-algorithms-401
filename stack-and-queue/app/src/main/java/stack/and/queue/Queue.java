package stack.and.queue;

public class Queue<T> {

     Node<T> front;
    Node<T> rear;

    public Queue() {
    }

    public void enqueue(T data) {
        if (isEmpty()) {
            Node<T> node = new Node<T>(data);
            front = node;
            rear = node;
        } else {
            Node<T> node = new Node<T>(data);
            rear.setNext(node);
            rear = node;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            return (T) "The List is empty";
        } else {
            T data = front.getData();
            front = front.getNext();
            return (T) data;
        }
    }

    public T peek() {
        return (T) front.getData();
    }

    public boolean isEmpty() {
        if (front == null) return true;
        return false;
    }


    @Override
    public String toString() {
        if (isEmpty()) {
            return "null";
        } else {
            String list = "Front = ";
            Node<T> node = front;
            while (node != null){
                list += node.getData()+ " -> ";
                node = node.getNext();
            }
            list += "Null";
            return list;
        }
    }
}