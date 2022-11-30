# Hashtables

Features of Hashtable
It is similar to HashMap, but is synchronized.
Hashtable stores key/value pair in hash table.
In Hashtable we specify an object that is used as a key, and the value we want to associate to that key. The key is then hashed, and the resulting hash code is used as the index at which the value is stored within the table. The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.
HashMap doesn’t provide any Enumeration, while Hashtable provides not fail-fast Enumeration.

## Challenge

Implement a Hashtable Class with the following methods:

- set
  - Arguments: key, value
  - Returns: nothing
  This method should hash the key, and set the key and value pair in the table, handling collisions as needed.
  Should a given key already exist, replace its value from the value argument given to this method.
- get
  - Arguments: key
  - Returns: Value associated with that key in the table
- has
  - Arguments: key
   -Returns: Boolean, indicating if the key exists in the table already.
- keys
  - Returns: Collection of keys
- hash
  - Arguments: key
  - Returns: Index in the collection for that key

## Approach & Efficiency

The time complexity of hash table is O(1) since it is calculated in constant time.



