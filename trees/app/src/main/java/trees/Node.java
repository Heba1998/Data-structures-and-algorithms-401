package trees;


public class Node<T> {
    public T data;
    public Node nextdata;
    public Node<T> leftNode;
    public Node<T> rightNode;

    public Node(T data) {
        this.data = data;
    }

    public Node<T> getLeftNode() {
        return leftNode;
    }

    public Node<T> getRightNode() {
        return rightNode;
    }

    public T getData() {
        return data;
    }

    public void setLeftNode(Node<T> leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(Node<T> rightNode) {
        this.rightNode = rightNode;
    }

    public void setData(T data) {
        this.data = data;
    }
}
