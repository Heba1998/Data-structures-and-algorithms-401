package lab5;


public class LinkedList {

    Node head;
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
        } else {
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

    public Node zipLists(LinkedList list1, LinkedList list2) {

        if (list1.head == null && list2.head == null) return null;
        if (list1.head == null) return list2.head;
        if (list2.head == null) return list1.head;

        LinkedList newZippedList = new LinkedList();
        newZippedList.head = list1.head;

        Node current = list1.head;
        list1.head = list1.head.next;

        while (current != null && (list2.head != null || list1.head != null)) {
            if (list2.head != null) {
                current.next = list2.head;
                list2.head = list2.head.next;
                current = current.next;
            }
            if (list1.head != null) {
                current.next = list1.head;
                list1.head = list1.head.next;
                current = current.next;
            }
        }
        return newZippedList.head;
    }

// test for exam
    public boolean isPalindrome() {
        if (head == null)
            return true;
        Node current = head;
        Node prev = head;
        Node temp ;

        while (current.next != null) {
            temp = new Node(current.next.value);
            System.out.println(temp);
temp.next=prev;
            prev = temp;
            current = current.next;
        }

        Node p1 = head;
        Node p2 = prev;

        while (p1 != null) {
            if (p1.value != p2.value)
                return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }

}