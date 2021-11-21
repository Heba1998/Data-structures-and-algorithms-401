package trees;

public class QueueE {

    ExamNode front;
    ExamNode rear;

    public void enqueue(ExamNode node){
        if (front == null){
            front = node;
        } else {
            rear.nextcontent = node;
        }
        rear = node;
    }

    public ExamNode dequeue() {
        try {
            ExamNode temp = front;
            front = front.nextcontent;
            temp.nextcontent = null;
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
