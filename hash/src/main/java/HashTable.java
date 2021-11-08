import java.util.ArrayList;
import java.util.Objects;

public class HashTable <K, V>{
    private ArrayList<HashNode<K, V>> bucketArray;
    private int numOfBuckets;
    private int size;

    public HashTable() {
        bucketArray = new ArrayList<>();
        numOfBuckets = 10;
        size = 0;
        for (int i = 0; i < numOfBuckets; i++) {
            bucketArray.add(null);
        }
    }

    public int hashCode(K key) {
        return Objects.hashCode(key);
    }
    public int getBucketIndex(K key) {
        int hashCode = hashCode(key);


        int index = hashCode % numOfBuckets;
        index = index < 0 ? index * -1 : index;

        return index;
    }
    public int getSize() {
        return size;
    }

    public void add(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);
        HashNode<K, V> head = bucketArray.get(bucketIndex);

        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;
        head = bucketArray.get(bucketIndex);
        HashNode<K, V> newNode = new HashNode<>(key, value, hashCode);
        newNode.next = head;
        bucketArray.set(bucketIndex, newNode);

        if ((1.0 * size) / numOfBuckets >= 0.7) {
            ArrayList<HashNode<K, V>> temp = bucketArray;
            bucketArray = new ArrayList<>();
            numOfBuckets = 2 * numOfBuckets;
            size = 0;

            for (int index = 0; index < numOfBuckets; index++) {
                bucketArray.add(null);
            }


            for (HashNode<K, V> headNode : temp) {
                while (headNode != null) {
                    add(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }
    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

        HashNode<K, V> head = bucketArray.get(bucketIndex);

        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode) {
                return head.value;
            }

            head = head.next;
        }

        return null;
    }


    public boolean containsHash(K key){
        if (key == null){
            return false;
        }else {
            return get(key)!=null;
        }
    }


    public static String RepeatedWord(String string) {
        HashTable<String, String> Words = new HashTable<>();
        String[] Arr = string.split(" ");
        for (String word : Arr) {
            word =word.replaceAll("[^a-zA-Z]", "").toLowerCase();
            if (Words.containsHash(word)) {
                return word;
            } else {
                Words.add(word,word);
            }
        }
        return "Ooops 🤯 There's no repeated 🎉";
    }

    @Override
    public String toString() {
        return "HashTable{" +
                "bucketArray=" + bucketArray +
                ", numOfBuckets=" + numOfBuckets +
                ", size=" + size +
                '}';
    }
}
