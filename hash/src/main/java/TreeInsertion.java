import java.util.ArrayList;
import java.util.List;

public class TreeInsertion<K, T> {
    HashTable<K, T> hashTable = new HashTable<>();
    public void preOrder(Node root) {
        if (root != null) {
            hashTable.add((K) root.value, (T) root.value);
        }
        if (root.left != null) {
            preOrder(root.left);
        }
        if (root.right != null) {
            preOrder(root.right);
        }
    }
    public List treeInsertion(Node Tree1, Node Tree2) {
        if (Tree1.root == null || Tree2.root == null) {
            return null;
        }else{
            List Temp = new ArrayList();
            preOrder(Tree1.root);
            traverse(Tree2.root, Temp);
            return Temp;
        }
    }
    public void traverse(Node root, List Temp) {
        if (root != null) {
            if (hashTable.containsHash((K) root.value)) {
                Temp.add(root.value);
            }
            if (root.left != null) {
                traverse(root.left, Temp);
            }
            if (root.right != null) {
                traverse(root.right, Temp);
            }
        }
    }
}