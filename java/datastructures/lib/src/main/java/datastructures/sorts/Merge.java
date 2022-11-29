package datastructures.sorts;

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
