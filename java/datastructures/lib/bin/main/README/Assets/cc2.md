# Shift Array

## Problem Domain

My task is to write a function called insetShiftArray which takes in an array, and a value to be added, returning an array with the new value added at the middle index. Did I summarize that correctly?

## Visualization

![Visualization](./wb2.png)

Does this visualization describe the problem sufficiently?

## Algorithm

- Create a method called reverseArray
- Iterate through the array to start from the last element of the array
- Return array in reversed order.

Do you have any feedback before I start coding?

## Pseudocode

- Algorithm reverseArray()
- Set list of array by using the Integer class
- for the length of the array minus 1 is greater than 0, decrement by 1
- print  reverse array

## Code

``` Java

public class Main {

  public static void reverseArray() {
        Integer[] intArray = {10,20,30,40,50,60,70,80,90};

         for(int i=intArray.length-1; i>=0; i--)
         System.out.print(intArray[i] + "  ");
  }

    public static void main(String[] args) {
    reverseArray();
    }
}

```
