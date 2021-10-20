package trees;

public class Queue<T> {

    Node<T> front;
    Node<T> rear;

    public void enqueue(Node<T> node){
        if (front == null){
            front = node;
        } else {
            rear.nextdata = node;
        }
        rear = node;
    }

    public Node<T> dequeue() {
        try {
            Node<T> temp = front;
            front = front.nextdata;
            temp.nextdata = null;
            return temp;
        } catch (NullPointerException e) {
            e.printStackTrace();
                System.out.println("The queue is empty");
            return null;
        }
    }
    public boolean isEmpty(){
        if (front == null) return true;
        return false;
    }

}