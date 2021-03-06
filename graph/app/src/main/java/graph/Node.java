package graph;

import java.util.Objects;

public class Node<T> {

    public String data;
    public int weight ;

    public Node(String data) {
        this.data = data;
    }

    public Node(String data, int weight) {
        this.data = data;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return  data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node vertex = (Node) o;
        return Objects.equals(data, vertex.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

}
