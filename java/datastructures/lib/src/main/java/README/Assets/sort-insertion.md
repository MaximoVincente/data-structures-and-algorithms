# Selection Sort Blog

## Pseudocode

```pseudocode

SelectionSort(int[] arr)
    DECLARE n <-- arr.Length;
    FOR i = 0; i to n - 1
        DECLARE min <-- i;
        FOR j = i + 1 to n
            if (arr[j] < arr[min])
                min <-- j;

        DECLARE temp <-- arr[min];
        arr[min] <-- arr[i];
        arr[i] <-- temp;

```

## Trace

- Sample Array
![img_2.png](s1.jpg)

### Pass 1
Visualization:

![img.png](s2.jpg)

In pass 1 we evaluate the smallest number in the array which is 2 with index zero (8), and switch with index 0.

### Pass 2

- Visualization

![img_1.png](s3.jpg)

In pass 2  we look for a smaller number in the current position i (8), and 8 is the second smallest, so there is no switch.

### Pass 3

- Visualization

![img_3.png](s4.jpg)

In pass 3 we start at position 2, and the next smallest number is 14 and is swapped with current position 2.

### Pass 4

- Visualization

![img_4.png](s5.jpg)

In pass 4 we start at position 3, and the next smallest number is 17 and is swapped with current position 3(35).

### Pass 5

- Visualization

![img_5.png](s6.jpg)

In pass 5 we start at position 4, and the next smallest number is 20 and is swapped with current position 4(35).

### Pass 6

- Visualization

![img_6.png](s7.jpg)

In pass 6 which is the final iteration (iteration 5), it will evaluate with itself and stay at its current position.
At the next iteration (6) the loop will end, and out array will be sorted.

## Big O

- Time: O(n^2)
- Space O(1)

## Code

``` java

public class Insertion {

int[] sortedArray;

public int[] selectionSort(int[] arr) {

    for (int i = 1; i < arr.length; i++) {
      int temp = arr[i];
      int j = i - 1;

      while (j >= 0 && arr[j] > temp){
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = temp;
    }
    return arr;
}
}

```

## Test

``` java

  @Test
  void testSortInsertion() {
    Insertion sut = new Insertion();
    int[] arr = {6, 2, 20, 35, 17, 14};
    int[] target = {2, 6, 14, 17, 20, 35};
    sut.selectionSort(arr);
    assertArrayEquals(arr, target);
  }

```

## Link to Code 

- [Link to Code](https://github.com/MaximoVincente/data-structures-and-algorithms/blob/main/java/datastructures/lib/src/main/java/datastructures/sorts/Insertion.java)
