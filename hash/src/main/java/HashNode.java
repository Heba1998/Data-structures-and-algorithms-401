public class HashNode <K,V>{
    public K key;
    public V value;
    public final int hashCode;
    public HashNode<K, V> next;

    public HashNode(K key, V value, int hashCode) {
        this.key = key;
        this.value = value;
        this.hashCode = hashCode;
    }
    @Override
    public String toString() {
        return "HashNode{" +
                "key=" + key +
                ", value=" + value +
                ", hashCode=" + hashCode +
                '}';
    }

}
