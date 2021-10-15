package trees;


public class BinaryTree<T> {
    public Node<T> root;
    String InOrderList = "";
    String preOrderList = "";
    String postOrderList = "";

    public BinaryTree() {
    }

    public String inOrder(Node<T> node) {

        if (node.leftNode != null) {
            inOrder(node.leftNode);
        }
        InOrderList += node.getData() + " => ";
        if (node.rightNode != null) {
            inOrder(node.rightNode);
        }
        return InOrderList;
    }

    public String preOrder(Node<T> node) {

        preOrderList += node.getData() + " => ";
        if (node.getLeftNode() != null) {
            preOrder(node.getLeftNode());
        }
        if (node.getRightNode() != null) {
            preOrder(node.getRightNode());
        }
        return preOrderList;

    }


    public String postOrder(Node<T> node) {
        if (node.leftNode != null) {
            postOrder(node.leftNode);
        }
        if (node.rightNode != null) {
            postOrder(node.rightNode);
        }
        postOrderList += node.getData() + " => ";
        return postOrderList;
    }
}
