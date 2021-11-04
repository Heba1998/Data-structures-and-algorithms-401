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

}
