package code.algorithms.sorting;

import java.util.Arrays;

public class QuickSort {

  public static void main(String[] args) {
    int[] arr = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
    int[] result = quickSort(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(result));
  }

  private static int[] quickSort(int[] arr, int left, int right) {
    int pivot;
    int partitionIndex;
    if (left < right) {
      pivot = right;
      partitionIndex = partition(arr, pivot, left, right);
      // sort left and right
      quickSort(arr, left, partitionIndex - 1);
      quickSort(arr, partitionIndex + 1, right);
    }
    return arr;
  }

  private static int partition(int[] arr, int pivot, int left, int right) {
    int pivotValue = arr[pivot];
    int partitionIndex = left;
    for (int i = left; i < right; i++) {
      if (arr[i] < pivotValue) {
        swap(arr, i, partitionIndex);
        partitionIndex++;
      }
    }
    swap(arr, right, partitionIndex);
    return partitionIndex;
  }

  private static void swap(int[] arr, int firstIndex, int secondIndex) {
    int temp = arr[firstIndex];
    arr[firstIndex] = arr[secondIndex];
    arr[secondIndex] = temp;
  }
}
