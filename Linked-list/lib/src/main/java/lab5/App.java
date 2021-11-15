package lab5;

public class App {

    public static void main(String[] args) {

//        LinkedList myList1 = new LinkedList();
////        myList.insert(1);
////        myList.insert(2);
//
//        // ---------------------Code Challenge: Class 06------------------------------
//        myList1.append(0);
//        myList1.append(4);
//        myList1.append(5);
////        myList1.insertAfter(5, 6);
////        myList1.insertAfter(6, 8);
////        myList1.insertBefore(8, 7);
////        myList1.insertBefore(4, 3);
//        // ---------------------------------------------------
//
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
//
//        // challenge 8
//
//
//        LinkedList myList2 = new LinkedList();
//        myList2.append(7);
//        myList2.append(8);
//        myList2.append(9);
//        LinkedList newZippedList = new LinkedList();
//        newZippedList.head = myList1.zipLists(myList1,myList2);
//        System.out.println(newZippedList);
//
//
//
//
//
//
//





        LinkedList linkedList = new LinkedList();
        LinkedList linkedList1 = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        linkedList.append(1);
        linkedList.append(6);
        linkedList.append(3);
        linkedList.append(3);
        linkedList.append(7);
        linkedList.append(7);
        linkedList.append(4);
        linkedList.append(4);
   linkedList.append(5);
        linkedList.append(6);
        linkedList.append(6);
        linkedList.append(9);

//        linkedList1.append(4);
//        linkedList1.append(3);
//        linkedList1.append(2);
//        linkedList1.append(1);
//
//        linkedList2.append(2);
//        linkedList2.append(4);
//        linkedList2.append(7);
//        linkedList2.append(6);
//
//        linkedList3.append(2);
//        linkedList3.append(2);
//        linkedList3.append(3);
//        linkedList3.append(4);



        System.out.println("list: \n"+linkedList.deleteDublicated(linkedList));
//        System.out.println("list1: \n"+linkedList.sortedList11(linkedList1));
//        System.out.println("list2\n"+linkedList.sortedList11(linkedList2) );
//        System.out.println("list3\n"+ linkedList.sortedList11(linkedList3));
    }
}