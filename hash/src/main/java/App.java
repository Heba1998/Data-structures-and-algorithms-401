import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
    HashTable<String, Integer> StudentsGrade = new HashTable<>();
        StudentsGrade.add("Heba", 100);
        StudentsGrade.add("Khair", 99);
        StudentsGrade.add("Nawal", 98);
        StudentsGrade.add("Jamal", 97);
        StudentsGrade.add("Jason", 96);
        StudentsGrade.add("Mohammed", 100);
        System.out.println(StudentsGrade);

        System.out.println(StudentsGrade.containsHash("Heba"));
        System.out.println("Jason's grade: "+ StudentsGrade.get("Jason"));
        System.out.println("HashCode for Khair: "+StudentsGrade.hashCode("Khair"));
        System.out.println("getBucketIndex "+ StudentsGrade.getBucketIndex("Khair"));
}
}
