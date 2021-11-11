package graph;

import java.util.*;

public class Graph {
    public final Map<Node, List<Node>> AdjacentNode;

    public Graph() {
        this.AdjacentNode =  new HashMap<>();;
    }
    public void addNode(String data) {
        Node NewNode = new Node(data);
        AdjacentNode.put(NewNode, new ArrayList<>());
    }
    public void addEdge(String Value1, String value2) {
        Node NewNode1 = new Node(Value1);
        Node NewNode2 = new Node(value2);

        AdjacentNode.get(NewNode1).add(NewNode2);
        AdjacentNode.get(NewNode2).add(NewNode1);

    }

    public Set<Node> getNodes(){
        return AdjacentNode.keySet();
    }

    public List<Node> getNeighbors(String data) {
        return AdjacentNode.get(new Node(data));
    }

    public int size() {
        return AdjacentNode.size();
    }


    @Override
    public String toString() {
        if (AdjacentNode.isEmpty()) return null;
        return "" + AdjacentNode;
    }


}