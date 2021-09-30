# Singly Linked List

*A singly linked list is a type of linked list that is unidirectional, that is, it can be traversed in only one direction from head to the last node (tail).*

*Each element in a linked list is called a node. A single node contains data and a pointer to the next node*

## Challenge

* Create a LinkedList by:
    * Create a Node class
    * Create a LinkedList class.

* The methods I used:
    * Insert values to the LinkedList.
    * Check If the value exists in the LinkedList or not.
    * Print out the values of nodes following this format "{ a } -> { b } -> { c } -> NULL".

## Approach & Efficiency

    * insert method complexity : Insert in the front (O(1)), Random insert (O(N))
    * includes method complexity : time (O(n))
    * toString method complexity : time (O(n))


## API

* Insert()

```
 This method checks if the head is null will add the value and set it to the head, If not then it will iterate through the nodes until the one that points to null, then will set this pointer to indicate to the new node that holds the new value.
 ```

* Includes() 
```
This method checks whether the input value equals any of the nodes' values or not until reaching to the last node
```

* toString()
```
This method print out the values of nodes following this format "{ a } -> { b } -> { c } -> NULL".
 ```