import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
    HashTable<String, Integer> StudentsGrade = new HashTable<>();
//        StudentsGrade.add("Heba", 100);
//        StudentsGrade.add("Khair", 99);
//        StudentsGrade.add("Nawal", 98);
//        StudentsGrade.add("Jamal", 97);
//        StudentsGrade.add("Jason", 96);
//        StudentsGrade.add("Mohammed", 100);
//        System.out.println(StudentsGrade);
//
//        System.out.println(StudentsGrade.containsHash("Heba"));
//        System.out.println("Jason's grade: "+ StudentsGrade.get("Jason"));
//        System.out.println("HashCode for Khair: "+StudentsGrade.hashCode("Khair"));
//        System.out.println("getBucketIndex "+ StudentsGrade.getBucketIndex("Khair"));

//        System.out.println("First repeated word is: " +"\""+StudentsGrade.RepeatedWord("Once upon Tree1 time, there was Tree1 brave princess who...")+"\"");


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


        TreeInsertion Challenge32 = new TreeInsertion();
//        System.out.println("common values in 2 binary trees are : "+Challenge32.treeInsertion(Tree1, Tree2));



        // --------------------------------- code challenge 33-------------------------------------------

        HashMap hashMap1 = new HashMap();
        hashMap1.put("fond", "enamored");
        hashMap1.put("wrath", "anger");
        hashMap1.put("diligent", "employed");
        hashMap1.put("outfit", "garb");
        hashMap1.put("guide", "usher");

        HashMap hashMap2 = new HashMap();

        hashMap2.put("fond", "averse");
        hashMap2.put("wrath", "delight");
        hashMap2.put("diligent", "idle");
        hashMap2.put("guide", "follow");
        hashMap2.put("flow", "jam");

        LeftJoin Challenge33 = new LeftJoin();
        System.out.println(Challenge33.leftJoin(hashMap1 , hashMap2));
       // ----------------------------------------------------------------------------

    }
}
