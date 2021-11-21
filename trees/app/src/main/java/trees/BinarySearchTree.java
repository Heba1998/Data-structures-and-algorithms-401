package trees;


import java.util.ArrayList;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree {
    public Node<T> root;



    public void Add(T data) {
        if (isEmpty()) {
            root = new Node<>(data);
        } else {
            AddRecursive(data, root);
        }
    }

    private void AddRecursive(T data, Node<T> root) {
        Node<T> binaryNode = new Node<>(data);
        if (data.compareTo(root.getData()) < 0) {
            if (root.getLeftNode() == null) {
                root.setLeftNode(binaryNode);
            } else {
                AddRecursive(data, root.getLeftNode());
            }
        } else if(data.compareTo(root.getData()) > 0) {
            if (root.getRightNode() == null) {
                root.setRightNode(binaryNode);
            } else {
                AddRecursive(data, root.getRightNode());
            }
        }
    }

    public boolean isEmpty() {
        return root == null;
    }

    public boolean contains(T data) {
        return containsRecursive(root, data);
    }
    private boolean containsRecursive(Node<T> current, T data) {
        if (current == null) {
            return false;
        }
        int comparisonResult = data.compareTo(current.getData());
        if (comparisonResult == 0) {
            return true;
        } else if (comparisonResult < 0) {
            return containsRecursive(current.getLeftNode(), data);
        } else {
            return containsRecursive(current.getRightNode(), data);
        }

    }


    public Node<T> getRoot() {
        return root;
    }


    public int MaxValue(Node current){
        if (isEmpty()) {
            return 0;
        } else {
            int left;
            int right;
            int max = (int) current.getData();

            if (current.getLeftNode() != null) {
                left = MaxValue(current.getLeftNode());
                max = Math.max(max, left);
            }

            if (current.getRightNode() != null) {
                right = MaxValue(current.getRightNode());
                max = Math.max(max, right);
            }
            return max;
        }
    }


    ArrayList <Object> BreadthFirstL=new ArrayList<>();
    public ArrayList BreadthFirst(Node root){
        if (root!=null){
            Queue<Node> breath=new Queue();
            breath.enqueue(root);
            while (!breath.isEmpty()){
                Node front=  breath.dequeue();
                BreadthFirstL.add(front.getData());
                if (front.getLeftNode() !=null)
                    breath.enqueue(front.getLeftNode());
                if (front.getRightNode() !=null)
                    breath.enqueue(front.getRightNode());
            }
            return BreadthFirstL;
        }
        else return null;
    }
}
