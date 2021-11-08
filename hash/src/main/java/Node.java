public class Node<T> {
    public Node root;
    public Node<T> right;
    public Node<T> left;
    T value;

    public Node(T value) {
        this.value = value;
    }

    public Node(Node<T> right, Node<T> left, T value) {
        this.right = right;
        this.left = left;
        this.value = value;
    }

    public Node() {
        root = null;
    }
}
