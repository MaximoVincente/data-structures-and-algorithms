# Merge Sort Blog

## Pseudocode

```pseudocode

ALGORITHM Merge(left, right, arr, mid)
    DECLARE i
    DECLARE j
    DECLARE k

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1

        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left

```

## Full visualization

![merge sort visual](merge-sort.png)

## Trace

### Sample array

***[5, 6, 3, 2, 9]***

### Pass 1

![pass 1](ms1.jpeg)

### Pass 2

![Pass 2](ms2.jpeg)

### Pass 3

![pass 3](ms3.jpeg)

### Pass 4

![Pass 4](ms4-5.jpeg)

### Pass 5

![Pass 5](ms6.jpeg)

### Pass 6

![Pass 6](ms7.jpeg)

### Pass 7

![Pass 7](ms8.jpeg)

### Pass 8

![Pass 8](ms9.jpeg)

### Pass 9

![Pass 9](ms10-11.jpeg)

### Pass 10

![Pass 10](ms12.jpeg)

### Pass 11

![Pass 11](ms13.jpeg)

## Big O

- Time ***O(n log(n))*** Since merge sort uses divide and conquer, it always divides in halves its array
- Space ***O(n)***

## Code

```java

public class Merge {

  int[] sortedArray;

  public int[] merge(int[] arr, int left, int mid, int right) {

    int subArrL = mid - left + 1;
    int subArrR = right - mid;

    int Left[] = new int[subArrL];
    int Right[] = new int[subArrR];

    for (int i = 0; i < subArrL; ++i)
      Left[i] = arr[left + i];
    for (int j = 0; j < subArrR; ++j)
      Right[j] = arr[mid + 1 + j];

    int i = 0, j = 0;

    int k = left;
    while (i < subArrL && j < subArrR) {
      if (Left[i] <= Right[j]) {
        arr[k] = Left[i];
        i++;
      }
      else {
        arr[k] = Right[j];
        j++;
      }
      k++;
    }

    while (i < subArrL) {
      arr[k] = Left[i];
      i++;
      k++;
    }

    while (j < subArrR) {
      arr[k] = Right[j];
      j++;
      k++;
    }
    return arr;
  }

  public int[] sort(int arr[], int left, int right)
  {
    if (left < right) {
      int mid = left + (right - left) / 2;

      sort(arr, left, mid);
      sort(arr, mid + 1, right);

      merge(arr, left, mid, right);
    }
    return arr;
  }

}

```

## Test

```java

  @Test
  void testMergeSort() {
    Merge sut = new Merge();
    int[] arr = {5, 6, 3, 2, 9};
    int[] target = {2, 3, 5, 6, 9};
    sut.sort(arr, 0, arr.length - 1);
    assertArrayEquals(arr, target);
  }

```

## Link to Code

- [link to code](https://github.com/MaximoVincente/data-structures-and-algorithms/blob/main/java/datastructures/lib/src/main/java/datastructures/sorts/Merge.java)
