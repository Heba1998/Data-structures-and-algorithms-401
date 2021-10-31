package trees;

public class FizzBuzzTree {
    KNode root = null;

    public void preorder(KNode node) {
        if (node == null) return;
        else {
            if ((node.data % 15) == 0) {
                System.out.print("FizzBuzz" + " ");
            } else if ((node.data % 5) == 0) {
                System.out.print("Buzz" + " ");
            } else if ((node.data % 3) == 0) {
                System.out.print("Fizz" + " ");
            } else {
                System.out.print(node.data + " ");
            }
            preorder(node.left);
            preorder(node.right);
        }

    }

    void printPreorderA(KNode node)
    {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        printPreorderA(node.left);
        printPreorderA(node.right);
    }

    @Override
    public String toString() {
        return "FizzBuzzTree{" +
                "root=" + root +
                '}';
    }
}
