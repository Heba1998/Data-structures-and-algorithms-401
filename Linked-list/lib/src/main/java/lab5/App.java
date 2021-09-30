package lab5;

public class App {

    public static void main(String[] args) {

        LinkedList myList = new LinkedList();
        myList.insert(1);
        myList.insert(2);
        myList.insert(3);
        Node current = myList.head;

        while (current != null) {
            current = current.next;
        }

        System.out.println(myList.includes(9));
        System.out.println(myList.includes(2));
        System.out.println(myList.includes(1));


        System.out.println(myList.toString());
    }
}
