package lab5;

public class App {

    public static void main(String[] args) {

        LinkedList myList1 = new LinkedList();
        LinkedList myList2 = new LinkedList();
        LinkedList myList3 = new LinkedList();

//        myList1.insert(1);
//        myList1.insert(8);

        // ---------------------Code Challenge: Class 06------------------------------
        myList1.insert(0);
        myList1.insert(4);
        myList1.insert(5);
        myList2.insert(7);
        myList2.insert(8);
        myList2.insert(9);

//        myList1.insertAfter(5, 6);
//        myList1.insertAfter(6, 8);
//        myList1.insertBefore(1, 7);
//        myList1.insertBefore(2, 3);
//        System.out.println(myList1);
//        System.out.println(myList1.reverse(myList1));
        System.out.println(myList3.zipLists(myList1,myList2));
//        System.out.println(myList1.sortList(myList1));
//        System.out.println(myList1);
//        System.out.println(LinkedList.middle(myList1));
//        System.out.println("before delete: \n"+myList1);
        // ---------------------------------------------------

//        Node current = myList1.head;
//        while (current != null) {
//            current = current.next;
//        }
//
//        System.out.println(myList1.includes(9));
//        System.out.println(myList1.includes(2));
//
//        // challenge 7
//        System.out.println(myList1.kthFromEnd(1));
//        System.out.println(myList1.kthFromEnd(6));
//        System.out.println(myList1.kthFromEnd(10));

        // challenge 8


//        LinkedList myList2 = new LinkedList();
//        myList2.append(7);
//        myList2.append(8);
//        myList2.append(9);
//        LinkedList newZippedList = new LinkedList();
//        newZippedList.head = myList1.zipLists(myList1,myList2);
////        System.out.println(newZippedList);
//
//
//        myList1.append(0);
//        myList1.append(4);
//        myList1.append(5);
//        myList1.append(5);
//        myList1.append(4);
//        myList1.append(1);
//
//        System.out.println(myList1);
//        System.out.println(myList1.isPalindrome());
//        myList1.deleteNode(2); // Delete node with data 1
//        System.out.println("after delete: \n"+myList1);
    }
}