/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    // Can successfully instantiate an empty tree
    @Test
    void InstantiateAnEmptyTree() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        assertNotNull(binarySearchTree);
    }

    // Can successfully instantiate a tree with a single root node
    @Test
    void InstantiateTreeWithSingleRoot() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.Add(50);
        assertEquals(50, binarySearchTree.root.getData());
    }


    // Can successfully add a left child and right child to a single root node
    @Test
    void LeftAndRightChildToSingleRoot() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.Add(30);
        binarySearchTree.Add(40);
        binarySearchTree.Add(20);
        assertEquals(30, binarySearchTree.root.getData());
        assertEquals(20, binarySearchTree.root.getLeftNode().getData());
        assertEquals(40, binarySearchTree.root.getRightNode().getData());
    }

    // Can successfully return a collection from a preorder traversal
    @Test
    void preorder() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.Add(50);
        binarySearchTree.Add(10);
        binarySearchTree.Add(60);
        binarySearchTree.Add(30);
        binarySearchTree.Add(90);
        binarySearchTree.Add(80);

        assertEquals("50 => 10 => 30 => 60 => 90 => 80 => ", binarySearchTree.preOrder(binarySearchTree.root));

    }

    // Can successfully return a collection from an inorder traversal
    @Test
    void inorder() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.Add(50);
        binarySearchTree.Add(10);
        binarySearchTree.Add(60);
        binarySearchTree.Add(30);
        binarySearchTree.Add(90);
        binarySearchTree.Add(80);

        assertEquals("10 => 30 => 50 => 60 => 80 => 90 => ", binarySearchTree.inOrder(binarySearchTree.root));

    }


    // Can successfully return a collection from a postorder traversal
    @Test
    void postorder() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.Add(50);
        binarySearchTree.Add(10);
        binarySearchTree.Add(60);
        binarySearchTree.Add(30);
        binarySearchTree.Add(90);
        binarySearchTree.Add(80);

        assertEquals("30 => 10 => 80 => 90 => 60 => 50 => ", binarySearchTree.postOrder(binarySearchTree.root));

    }

    // Contains test
    @Test
    void contains(){
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.Add(50);
        binarySearchTree.Add(10);
        binarySearchTree.Add(60);
        binarySearchTree.Add(30);
        binarySearchTree.Add(90);
        binarySearchTree.Add(80);


        assertTrue(binarySearchTree.contains(90));
        assertFalse(binarySearchTree.contains(100));
        assertTrue(binarySearchTree.contains(50));
    }

// Max value
    @Test
    void Maxvalue(){
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        assertEquals(0, binarySearchTree.MaxValue(binarySearchTree.root));
        binarySearchTree.Add(50);
        binarySearchTree.Add(10);
        binarySearchTree.Add(60);
        binarySearchTree.Add(30);
        binarySearchTree.Add(90);
        binarySearchTree.Add(80);
        assertEquals(90, binarySearchTree.MaxValue(binarySearchTree.root));
    }


    // Breadth FirstL
    @Test
    void BreadthFirstL(){
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        assertEquals(null , binarySearchTree.BreadthFirst(binarySearchTree.root));
        binarySearchTree.Add(50);
        binarySearchTree.Add(10);
        binarySearchTree.Add(60);
        binarySearchTree.Add(30);
        binarySearchTree.Add(90);
        binarySearchTree.Add(80);
        assertEquals("[50, 10, 60, 30, 90, 80]" , binarySearchTree.BreadthFirst(binarySearchTree.root).toString());
    }

// FizzBuzz
    @Test
    void FizzBuzz(){
        FizzBuzzTree tree = new FizzBuzzTree();
        tree.root = new KNode(1);
        tree.root.left = new KNode(3);
        tree.root.right = new KNode(2);
        tree.root.left.left = new KNode(5);
        tree.root.left.right = new KNode(88);
        tree.root.right.left = new KNode(15);
        tree.root.right.right = new KNode(50);
    }
}
