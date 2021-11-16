package graph;

import java.util.*;

public class Graph {
    public final Map<Node, List<Node>> AdjacentNode;
    public Map<String , Integer> weightList = new HashMap<>();


    public Graph() {
        this.AdjacentNode =  new HashMap<>();;
    }
    public Node addNode(String data) {
        Node NewNode = new Node(data);
        AdjacentNode.put(NewNode, new ArrayList<>());
        return NewNode;
    }
    public void addEdge(String Value1, String value2, int weight) {
        Node NewNode1 = new Node(Value1);
        Node NewNode2 = new Node(value2);

        AdjacentNode.get(NewNode1).add(NewNode2);
        AdjacentNode.get(NewNode2).add(NewNode1);
          weightList.put(Value1 +value2 , weight);
          weightList.put(value2 + Value1 , weight);
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


    public List<Node> breadthFirst(Node root){
        List<Node> list = new ArrayList<>();
        Set<Node> visited = new HashSet<>();
        List<Node> newList = new ArrayList<>();

        newList.add(root);
        visited.add(root);

        while(!newList.isEmpty()){
            Node front = newList.get(0);
            newList.remove(0);
            list.add(front);

            for (int i = 0; i < AdjacentNode.get(front).size(); i++) {
                if (! visited.contains(AdjacentNode.get(front).get(i))){
                    visited.add(AdjacentNode.get(front).get(i));
                    newList.add(AdjacentNode.get(front).get(i));
                }
            }

        }
        int i;
        for (i = 0; i < list.size()-1; i++) {
            System.out.print(list.get(i).data+", ");
        }
        System.out.print(list.get(i).data);
        return list;
    }


    public String businessTrip(String [] placeList) {
        int cost = 0;
        for (int i = 0; i < placeList.length -1; i++) {
            if (getNeighbors(placeList[i]).contains(new Node<>(placeList[i+1]))) {
                cost += weightList.get(placeList[i] +placeList[i+1]);
            } else {
                return "False,$0";
            }
        }
        return "True"+",$" + cost ;
    }


    public List<Node> DepthFirst(Node root) {
        if (root == null) return null;

        List<Node> vertices = new ArrayList<>();
        Stack depth = new Stack();
        Set<Node> visited = new HashSet<>();

        depth.push(root);

        while (!depth.isEmpty()) {
            Node top = (Node) depth.pop();
            if (!visited.contains(top)) {
                visited.add(top);
                vertices.add(top);
                for (Node neighbor : getNeighbors(top.data)) {
                    depth.push(neighbor);
                }
            }
        }
        return vertices;
    }



    @Override
    public String toString() {
        if (AdjacentNode.isEmpty()) return null;
        return "" + AdjacentNode;
    }



}