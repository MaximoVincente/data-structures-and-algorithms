package datastructures.sort;

import datastructures.sorts.Insertion;
import datastructures.sorts.Merge;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestSort {

  @Test
  void testSortInsertion() {
    Insertion sut = new Insertion();
    int[] arr = {6, 2, 20, 35, 17, 14};
    int[] target = {2, 6, 14, 17, 20, 35};
    sut.selectionSort(arr);
    assertArrayEquals(arr, target);
  }

  @Test
  void testMergeSort() {
    Merge sut = new Merge();
    int[] arr = {5, 6, 3, 2, 9};
    int[] target = {2, 3, 5, 6, 9};
    sut.sort(arr, 0, arr.length - 1);
    assertArrayEquals(arr, target);
  }
}
