# Trees

*A tree is a non linier data structure that is like a list but that uses nodes starting at a root then point to more than one “next” node.*
*General trees consist of the nodes having any number of child nodes. But in case of binary trees every node can have at the most two child nodes and There is a unique node called root in trees.*

## Challenge

* `Node class` Node class has properties for the value stored in the node, the left child node, and the right child node.
* `Binary Tree class` BinaryTree class Define a method for each of the depth first traversals.
* `Binary Search Tree class` Binary Search Tree that is a sub class of the Binary tree with two more methods (Add and contains)

## Approach & Efficiency

* `Binary Tree class`
  * `pre order` O(n) for the time and the space
  * `in order` O(n) for the time and the space
  * `post order` O(n) for the time and the space


* `Binary Search Tree class`
  * `Add` O(n) for the time and the space
  * `Contains` O(n) for the time and the space


## API

* `Binary Tree class`
  * `pre order` traverse over the tree (Root,Left,Right)
  * `in order` traverse over the tree (Left,Root,Right)
  * `post order` traverse over the tree (Left,Right,Root)



* `Binary Search Tree class`
  * `Add` to add a node hold the accepted value to the proper position inside the tree
  * `Contains` that checks if the tree has the node with accepted value
