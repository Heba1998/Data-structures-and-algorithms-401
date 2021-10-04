package lab5;

public class App {

    public static void main(String[] args) {

        LinkedList myList = new LinkedList();
        myList.insert(1);
        myList.insert(2);

        // ---------------------Code Challenge: Class 06------------------------------
        myList.append(0);
        myList.append(4);
        myList.append(5);
        myList.insertAfter(5, 6);
        myList.insertAfter(6, 8);
        myList.insertBefore(8, 7);
        myList.insertBefore(4, 3);
        // ---------------------------------------------------

        Node current = myList.head;
        while (current != null) {
            current = current.next;
        }

        System.out.println(myList.includes(9));
        System.out.println(myList.includes(2));

        // challenge 7
        System.out.println(myList.kthFromEnd(1));
        System.out.println(myList.kthFromEnd(6));
        System.out.println(myList.kthFromEnd(10));

        System.out.println(myList.toString());
    }
}