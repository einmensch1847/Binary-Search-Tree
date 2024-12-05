# Binary Search Tree Implementation in Java

This project is a full implementation of a **Binary Search Tree (BST)** in Java. It includes all fundamental operations like insertion, search, deletion, and traversal.

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) 

---

## Project Structure

### 1. `Main.java`
- The entry point of the program.
- Demonstrates tree operations like:
  - Adding nodes.
  - Displaying tree elements in sorted order (in-order traversal).
  - Searching for elements.
  - Calculating tree properties like depth, length, and width.
  - Removing nodes from the tree.

### 2. `SearchTree.java`
- Implements the core logic of the binary search tree.
- Key Methods:
  - `insert(Object item)`: Adds a node while maintaining BST properties.
  - `Search(Object item)`: Checks if an element exists in the tree.
  - `Display()`: Traverses the tree in in-order and prints the nodes.
  - `GetDepth()`: Returns the maximum depth of the tree.
  - `GetLength()`: Calculates the total number of nodes.
  - `GetWidth()`: Finds the maximum width of the tree.
  - `Remove(Object item)`: Deletes a node and restructures the tree.

### 3. `TreeNode.java`
- Represents a node in the binary search tree.
- Stores:
  - `info`: The data value of the node.
  - `left`: Reference to the left child.
  - `right`: Reference to the right child.

---

## Features

- **Insertion**: Add new elements to the tree.
- **Deletion**: Remove nodes while maintaining BST properties.
- **Search**: Efficiently find elements in the tree.
- **Traversal**:
  - In-order (ascending order).
  - Pre-order, Post-order, Level-order (can be added later).
- **Tree Properties**:
  - Depth.
  - Total number of nodes (length).
  - Maximum width of the tree.

---

## How to Run

### Prerequisites
- Install **Java Development Kit (JDK)** (Version 8 or later).
- Use an IDE or terminal.

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/einmensch1847/Binary-Search-Tree.git
