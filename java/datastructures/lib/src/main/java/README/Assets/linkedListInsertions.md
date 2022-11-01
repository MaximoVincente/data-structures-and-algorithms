# Linked List Insertion

## Problem Domain

My task is to:
   - Write an append method that takes in a new value as an argument, and adds a new node with the given value to the end of the list
   - Write an insertBefore method that takes in a value and a new value, and adds a new node with the given new value before the first that has the value specified
   - Write an insertAfter method that takes in a value and a new value, and adds a new node with the given new value after the first that has the value specified -

## Algorithm

### Append

- Add new node
- Add data to the new node
- Make sure next is null
- Since the list is empty, we need to set the new node as head.
- Make the new node.next null
- if the last next is not null, then next is the head and last node
- return the new node at the end

### Insert Before

- Create a new node
- make the new node.next head
- return the head
- else traverse to find previous value of a node (for loop)
- create a new node with new value
- set previous node to next
- return previous node

### Insert After

- check the value is null
- new Node with new value
- make the .next of the new node the next of new value
- make .next of new value as new node
