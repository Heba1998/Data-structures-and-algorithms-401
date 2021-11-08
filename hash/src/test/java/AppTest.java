import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


public class AppTest {

@Test void Tast1(){
    HashTable<String, Integer> StudentsGrade = new HashTable<>();
    StudentsGrade.add("Heba", 99);
    StudentsGrade.add("Mohammed", 100);
    int size = StudentsGrade.getSize();
    assertEquals(size, StudentsGrade.getSize());

}
    @Test void Test2(){
        HashTable<String, Integer> StudentsGrade = new HashTable<>();
        StudentsGrade.add("Nawal", 99);
        StudentsGrade.add("Khair", 98);
        int value = StudentsGrade.get("Khair");
        assertEquals(value,StudentsGrade.get("Khair") );
    }

    @Test void Test3(){
        HashTable<String, Integer> StudentsGrade = new HashTable<>();
        StudentsGrade.add("Heba", 95);
        StudentsGrade.add("Tala", 100);
        boolean contain = StudentsGrade.containsHash("Heba");
        assertEquals(contain,StudentsGrade.containsHash("Heba"));
    }

    @Test void Test4(){
        HashTable<String, Integer> StudentsGrade = new HashTable<>();
        StudentsGrade.add("Ahmad", 99);
        StudentsGrade.add("Hammam", 100);
        int index = StudentsGrade.getBucketIndex("Ahmad");
        assertEquals(index, StudentsGrade.getBucketIndex("Ahmad"));
    }

    @Test void Test5(){
        HashTable<String, Integer> StudentsGrade = new HashTable<>();
        StudentsGrade.add("Abood", 100);
        StudentsGrade.add("Yahia", 99);
        assertNull(StudentsGrade.get("handle"));
    }
    @Test void Test6(){
        HashTable<String, Integer> StudentsGrade = new HashTable<>();
        StudentsGrade.add("Hussam", 94);
        StudentsGrade.add("Abood", 95);
        StudentsGrade.add("Abd", 100);
        StudentsGrade.add("Heba", 100);
        int size = StudentsGrade.getSize();
        assertEquals(size, StudentsGrade.getSize());

    }

    @Test void getFromCollision(){
        HashTable<String, Integer> StudentsGrade = new HashTable<>();
        StudentsGrade.add("Heba", 97);
        StudentsGrade.add("Emran", 99);
        StudentsGrade.add("Jason", 100);
        StudentsGrade.add("Jason", 100);
        StudentsGrade.add("Emran", 100);
        int value = StudentsGrade.get("Jason");
        assertEquals(value,StudentsGrade.get("Jason"));
    }


    @Test void RepeatedWordTest() {
        HashTable repeatedWordTest = new HashTable();
        String test1="Once upon a time, there was a brave princess who...";
        String test4="Once upon a time, there was A brave princess who...";
        String test2 = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        String test3 = "";
        assertEquals("a",repeatedWordTest.RepeatedWord(test1));
        assertEquals("a",repeatedWordTest.RepeatedWord(test4));
        assertEquals("it",repeatedWordTest.RepeatedWord(test2));
        assertEquals("Ooops 🤯 There's no repeated 🎉",repeatedWordTest.RepeatedWord(test3));

    }


    @Test void intersectionTreeTest1() {
        TreeInsertion intersectionTree = new TreeInsertion();
        Node Tree1 = new Node();
        Tree1.root = new Node(150);
        Tree1.root.left = new Node(100);
        Tree1.root.left.left = new Node(75);
        Tree1.root.left.right = new Node(160);
        Tree1.root.left.right.left = new Node(125);
        Tree1.root.left.right.right = new Node(175);
        Tree1.root.right = new Node(250);
        Tree1.root.right.left = new Node(200);
        Tree1.root.right.right = new Node(350);
        Tree1.root.right.right.left = new Node(300);
        Tree1.root.right.right.right = new Node(500);

        Node Tree2 = new Node();
        Tree2.root = new Node(42);
        Tree2.root.left = new Node(100);
        Tree2.root.left.left = new Node(15);
        Tree2.root.left.right = new Node(160);
        Tree2.root.left.right.left = new Node(125);
        Tree2.root.left.right.right = new Node(175);
        Tree2.root.right = new Node(600);
        Tree2.root.right.left = new Node(200);
        Tree2.root.right.right = new Node(350);
        Tree2.root.right.right.left = new Node(4);
        Tree2.root.right.right.right = new Node(500);

        assertEquals("[100, 160, 125, 175, 200, 350, 500]",intersectionTree.treeInsertion(Tree1, Tree2).toString());


    }


    @Test void intersectionTreeTest2() {
        TreeInsertion intersectionTree = new TreeInsertion();
        Node Tree1 = new Node();
        Tree1.root = new Node(150);


        Node Tree2 = new Node();
        Tree2.root = new Node(42);
        Tree2.root.left = new Node(100);
        Tree2.root.left.left = new Node(15);
        Tree2.root.left.right = new Node(160);
        Tree2.root.left.right.left = new Node(125);
        Tree2.root.left.right.right = new Node(175);
        Tree2.root.right = new Node(600);
        Tree2.root.right.left = new Node(200);
        Tree2.root.right.right = new Node(350);
        Tree2.root.right.right.left = new Node(4);
        Tree2.root.right.right.right = new Node(500);

        assertEquals("[]",intersectionTree.treeInsertion(Tree1, Tree2).toString());
    }


}
