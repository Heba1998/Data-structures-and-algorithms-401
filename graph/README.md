# Graphs
A graph is a non-linear data structure that can be looked at as a collection of vertices (or nodes) potentially connected by line segments named edges.

## Challenge
* *Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods*
    
    * **add node**

        * Arguments: value
        * Returns: The added node
        * Add a node to the graph

    * **add edge**

        * Arguments: 2 nodes to be connected by the edge, weight (optional)
        * Returns: nothing
        * Adds a new edge between two nodes in the graph
        * If specified, assign a weight to the edge
        * Both nodes should already be in the Graph

    * **get nodes**
        * Arguments: none
        * Returns all of the nodes in the graph as a collection (set, list, or similar)

    * **get neighbors**
        * Arguments: node
        * Returns a collection of edges connected to the given node
        * Include the weight of the connection in the returned collection

    * **size**
        * Arguments: none
        * Returns the total number of nodes in the graph



## Approach & Efficiency
* **add node** : time = O(1) because we didnt use loops, space = O(n) because we declared a new ArrayList.

* **add edge** : time = O(1) because we didnt use loops, space = O(1) because we didnt declare any arrays.

* **get nodes** : time = O(n) because we use loop , space = O(n) because we declared a HashSet.

* **get neighbors** : O(1) for both time and space complexity because there is no loops or arrays.

* **size** : O(1) for both time and space complexity.



## API
* **add node** : this method is to add a new node to the graph.

* **add edge** : this method is to add a new edge between two Nodes in the graph.

* **get nodes** : this method returns a HashSet which contains all the Nodes in the graph.

* **get neighbors** : this method return a list of all the Nodes that are connected to the Node we pass.

* **size** : this method returns the size of the graph HashSet.

## **breadth-first traversal on a graph**

# Challenge Summary
*write a function which traverse a graph by breadth first concept , and return a list of all the nodes traversed.*


## Whiteboard Process
![](image/breadth-first.png)

## Approach & Efficiency
time : O(n^2) `nested loop`

scape : O(n) `create new list and Set`

## Solution

* **code**

```java
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
```


* **Solution:**

![](image/out36.png)