# Queue Data Structure using Linked List (Java)

## Overview
This repository contains Java implementations of the **Queue** data structure using a **Singly Linked List**. The programs demonstrate the fundamental operations of a queue while following the **FIFO (First In, First Out)** principle.

## Branch
**dev**

## Programs Included

### 1. Queue Enqueue and Display
This program demonstrates:
- Creating a queue using a linked list.
- Inserting elements using the `append()` (enqueue) operation.
- Displaying queue elements from front to rear using the `print()` method.

**Operations Covered**
- `append(int data)` (Enqueue)
- `print()`

### 2. Queue Operations
This program extends the basic implementation by supporting queue deletion.

**Operations Covered**
- `append(int data)` – Inserts an element at the rear of the queue.
- `dequeue()` – Removes the element from the front of the queue.
- `print()` – Displays all elements from front to rear.

## Data Structure Used
- Singly Linked List

## Queue Principle
**FIFO (First In, First Out)**

### Example

```
Enqueue: 56
Enqueue: 30
Enqueue: 70

Queue:
56 --> 30 --> 70

Dequeue

Queue:
30 --> 70

Enqueue: 80

Queue:
30 --> 70 --> 80
```

## Time Complexity

| Operation | Complexity |
|-----------|------------|
| Enqueue | O(1) |
| Dequeue | O(1) |
| Print | O(n) |

## Technologies Used
- Java
- Object-Oriented Programming (OOP)
- Linked List

## Learning Outcomes
- Understanding the Queue data structure.
- Implementing a Queue without using Java Collections.
- Working with linked lists.
- Understanding the FIFO concept.
- Practicing enqueue and dequeue operations.

## Future Enhancements
- Implement `peek()` to view the front element.
- Implement `size()` to return the number of elements.
- Handle queue underflow more gracefully.
- Improve edge case handling for an empty queue.

---
**Author:** Vaddi Nandini
