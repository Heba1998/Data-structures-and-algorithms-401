package trees;

import java.util.ArrayList;

public class Exam {
    public ExamNode root;
    String preOrderList="";
    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int data) {
        if (isEmpty()) {
            ExamNode tNode = new ExamNode(data);
            root = tNode;
        } else {
            insertHelper(data, root);
        }
    }

    private void insertHelper(int data, ExamNode root) {
        ExamNode tNode = new ExamNode(data);
        if (data < root.getContent()) {
            if (root.getLeft() == null) {
                root.setLeft(tNode);
            } else insertHelper(data, root.getLeft());
        }
        if (data > root.getContent()) {
            if (root.getRight() == null) {
                root.setRight(tNode);
            } else {
                insertHelper(data, root.getRight());
            }
        }
    }


    public String preOrder(ExamNode node) {

        preOrderList += node.getContent() + " => ";
        if (node.getLeft() != null) {
            preOrder(node.getLeft());
        }
        if (node.getRight() != null) {
            preOrder(node.getRight());
        }
        return preOrderList;

    }


    public boolean contain(int data) {
        ExamNode current = root;
        while (current != null) {
            if (data < current.getContent()) {
                current = current.getLeft();
            } else if (data > current.getContent()) {
                current = current.getRight();
            } else {
                return true;
            }

        }
        return false;
    }


    public int MaxValue(ExamNode current){
        if (isEmpty()) {
            return 0;
        } else {
            int left;
            int right;
            int max =current.getContent();
            if (current.getLeft() != null) {
                left = MaxValue(current.getLeft());
                max = Math.max(max, left);
            }
            if (current.getRight() != null) {
                right = MaxValue(current.getRight());
                max = Math.max(max, right);
            }
            return max;
        }
    }

    public int MaxBst() {
        if (isEmpty()) {
            return -1;
        }
        ExamNode current = root;
        while (current.getRight() != null) {
            current = current.getRight();
        }
        return current.getContent();
    }


    public void breadthFirstBT(QueueE queue) {
        if (!queue.isEmpty()) {
            ExamNode node = queue.dequeue();
            System.out.println(node.getContent() + " -> ");
            if (node.getLeft() != null) {
                queue.enqueue(node.getLeft());
            }
            if (node.getRight() != null) {
                queue.enqueue(node.getRight());
            }
            breadthFirstBT(queue);
        }
    }

    ArrayList BreadthFirstLBST=new ArrayList();
    public ArrayList BreadthFirstBST(ExamNode root){
        if (root!=null){
            QueueE breadth=new QueueE();
            breadth.enqueue(root);
            while (!breadth.isEmpty()){
                ExamNode front=  breadth.dequeue();
                BreadthFirstLBST.add(front.getContent());
                if (front.getLeft() !=null)
                    breadth.enqueue(front.getLeft());
                if (front.getRight() !=null)
                    breadth.enqueue(front.getRight());
            }
            return BreadthFirstLBST;
        }
        else return null;
    }



    static String YearToRoman(int n) {
        String[] roman = { "M",  "CM", "D", "CD", "C", "XC", "L",  "X", "IX", "V", "I" };
        int[] Nums = {  1000, 900, 500,  400 , 100,  90,  50,   10,    9,   5,   1 };
        String finalNum = "";
        for (int i = 0; i < Nums.length; i ++) {
            int currentNum = n /Nums[i];
            if (currentNum==0) {
                continue;
            }
            for (int j = 0; j < currentNum; j++) {
                finalNum +=roman[i];
            }
            n = n%Nums[i];
        }
        return finalNum;
    }
}


















