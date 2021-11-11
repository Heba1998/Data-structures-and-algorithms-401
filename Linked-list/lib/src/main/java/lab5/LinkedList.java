package lab5;


public class LinkedList {
    private static Node head;
    public int length;
//    Node head;
    private boolean value;
    private LinkedList next;

    public void insert(int value)  {
        Node newInsertNode = new Node(value);
        if (head != null) {
            newInsertNode.next = head;
        }
        head = newInsertNode;
    }

    public boolean includes(int value){
        Node current = head;
        while (current != null) {
            if (value == current.value)return true;
            current = current.next;
        }
        return false;
    }

    public String toString(){
        String result = "";
        Node current = head;
        while (current != null) {
            result = result + "{ "+ current.value + " } -> ";
            if (current.next == null) {
                result = result + "NULL";
                return result;
            }
            current = current.next;
        }
        return result;
    }

// ---------------------Code Challenge: Class 06------------------------------

// Append
    public void append(int value)  {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

// Insert Before
    public void insertBefore(int value, int newValue) {
        Node insertNodeBefore = new Node(newValue);
        if (head == null) {
            head = insertNodeBefore;
        } else if (head.value == value) {
            insert(newValue);
        }else {
            Node current = head;
            while (current.next != null) {
                if (current.next.value == value) {
                    insertNodeBefore.next = current.next;
                    current.next = insertNodeBefore;
                    break;
                }
                current = current.next;
            }
        }
    }

    // Insert After
    public void insertAfter(int value, int newValue) {
        Node insertNodeAfter = new Node(newValue);
        if (head == null) {
            head = insertNodeAfter;
        } else {
            Node current = head;
            while (current != null) {
                if (current.value == value) {
                    insertNodeAfter.next = current.next;
                    current.next = insertNodeAfter;
                }
                current = current.next;
            }
        }
    }

// challenge 7

    public String kthFromEnd(int k) {
        if (head == null) return "Exception";
        Node current = head;
        int counter = 0;
        while (current.next != null) {
            current = current.next;
            counter++;
        }
        if (k > counter || k < 0) {
            return "Exception";
        } else {
            current = head;
            for (int i = 0; i <= counter-k; i++) {
                if (i == counter-k) {
                    System.out.printf(k +"th node from the last is: ");
                    return "{"+current.value+"}";
                }
                current = current.next;
            }
        }
        return "Exception";
    }



    //  challenge 8

//    public Node zipLists(LinkedList list1, LinkedList list2) {
//
//        if (list1.head == null && list2.head == null) return null;
//        if (list1.head == null) return list2.head;
//        if (list2.head == null) return list1.head;
//        LinkedList newZippedList = new LinkedList();
//        newZippedList.head = list1.head;
//
//        Node current = list1.head;
//        list1.head = list1.head.next;
//
//        while (current != null && (list2.head != null || list1.head != null)) {
//            if (list2.head != null) {
//                current.next = list2.head;
//                list2.head = list2.head.next;
//                current = current.next;
//            }
//            if (list1.head != null) {
//                current.next = list1.head;
//                list1.head = list1.head.next;
//                current = current.next;
//            }
//        }
//        return newZippedList.head;
//    }


    public  String zipLists(LinkedList linkedList , LinkedList linkedList1){

        Node list1Node = linkedList.head;
        Node list2Node = linkedList1.head;
//        System.out.println(list2Node);
        LinkedList mergedList = new LinkedList();
        int lenthSizeBig = linkedList.length + linkedList1.length;

        while (lenthSizeBig > 0) {
            if (list1Node != null){
                mergedList.insert(list1Node.value);
                list1Node = list1Node.next;
            }
            if (list2Node != null){
                mergedList.insert(list2Node.value);
                list2Node = list2Node.next;
            }
            lenthSizeBig--;
        }
        return mergedList.toString();
    }


    public boolean isPalindrome() {
        if (head == null){
            return true;
        }
        Node current = head;
        Node prev = head;

        while (current.next != null) {
            Node temp = new Node(current.next.value);
            temp.next = prev;
            prev = temp;
            current = current.next;
        }
        Node p1 = head;
        Node p2 = prev;

        while (p1 != null) {
            if (p1.value != p2.value){
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }

    public static int middle(LinkedList ll){
        int mid = (ll.length/2);
        int counter =0;
        Node current = head;
        while (counter != mid){
            current = current.next;
            counter++;
        }
        return Integer.parseInt(String.valueOf(current.value));
    }
//    public java.util.LinkedList reverse(java.util.LinkedList linkedList2) {
//        LinkedList prev = null;
//        Node current = head;
//
//        LinkedList next = null;
//        while (current != null) {
//
//            next = current.next;
//            current.next=prev;
//            prev = current;
//            current = next;
//
//        }
//        head = prev;
//        return linkedList2;
//    }


    void deleteNode(int key) {
        Node temp = head, prev = null;
        if (temp != null && temp.value == key) {
            head = temp.next;
            return;}
        while (temp != null && temp.value != key) {
            prev = temp;
            temp = temp.next;}
        prev.next = temp.next;
    }





    public LinkedList sortList(LinkedList a)
    {
        Node current = head, index = null;
        int temp;
        if (head == null) {
            return null;
        }
        else {
            while (current != null) {
                index = current.next;
                while (index != null){
                    if (current.value < index.value) {
                        temp = current.value;
                        current.value = index.value;
                        index.value = temp;
                    }

                index = index.next;
            }
            current = current.next;
        }
        return a;
    }}



    public LinkedList reverse(LinkedList linkedList)
    {Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return linkedList;
    }




}

