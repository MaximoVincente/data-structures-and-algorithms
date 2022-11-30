package datastructures.hashmap;

import datastructures.linkedlist.Node;
import datastructures.linkedlist.LinkedList;

import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.List;

// NOTE: Does NOT preserve insertion order!
// WARNING: Don't make K an Object or Character!
public class HashMap<K, V>
{
  ArrayList<LinkedList<HashMapPair<K, V>>> bucketArrayList;  // using ArrayList instead of array so we can instantiate with a parameterized type
  int size;

  public HashMap(int size)
  {
    if (size < 1)
    {
      throw new IllegalArgumentException("HashMap size must be 1 or greater!");
    }

    this.size = size;
    this.bucketArrayList = new ArrayList<>(size);

    // Next part is not required, and is a little inefficient, but it makes writing HashMap operations easier
    for (int i = 0; i < this.size; i++)
    {
      bucketArrayList.add(i, new LinkedList<>());
    }
  }

  // Make sure to replace if the key is a dupe!
  public void set(K key, V value) {
    int index = hash(key);
    HashMapPair<K, V> hashPair = new HashMapPair<>(key, value);
    if (bucketArrayList.get(index) != null) {
      LinkedList<HashMapPair<K, V>> list = bucketArrayList.get(index);
      Node<HashMapPair<K, V>> current;
      current = list.head;
      while (current != null && !current.value.getKey().equals(key)) {
        current = current.next;
      }
      if (current != null && !current.value.equals(value)) {
        current.value.setValue(value);
        return;
      }
    }
    LinkedList<HashMapPair<K, V>> list = bucketArrayList.get(index);
    list.append(hashPair);
    bucketArrayList.set(index, list);
  }

  public V get(K key) {
    int index = hash(key);
    if (bucketArrayList.get(index) != null) {
      LinkedList<HashMapPair<K, V>> list = bucketArrayList.get(index);
      Node<HashMapPair<K, V>> current;
      current = list.head;
      while (current != null && !current.value.getKey().equals(key)) {
        current = current.next;
      }
      if (current != null) {
        return current.value.getValue();
      }
    }
    return null;
  }

  public boolean contains(K key) {
    int index = hash(key);
    if (bucketArrayList.get(index) != null) {
      LinkedList<HashMapPair<K, V>> list = bucketArrayList.get(index);
      Node<HashMapPair<K, V>> current;
      current = list.head;
      while (current != null && !current.value.getKey().equals(key)) {
        current = current.next;
      }
      return current != null;
    }
    return false;
  }

  public List<K> keys() {
    List<K> output = new ArrayList<>();
    for (LinkedList<HashMapPair<K, V>> list : bucketArrayList) {
      if (list != null) {
        Node<HashMapPair<K, V>> current;
        current = list.head;
        while (current != null) {
          output.add(current.value.getKey());
          current = current.next;
        }
      }
    }
    return output;
  }

  // Sometimes hashCode in Java can be negative! So we need to do absolute value
  // If you really want to hash things yourself, look at https://stackoverflow.com/a/113600/16889809
  // Don't use Character! Don't use Object! Don't use any object you have not overridden equals() and hashCode() on!
  // If you do this, things that should collide, won't, because Object.hashCode() is not good
  // Protip: Testing collisions is easy with Integer, because Integer hashes to its own value
  public int hash(K key)
  {
    return Math.abs(key.hashCode()) % size;
  }
}
