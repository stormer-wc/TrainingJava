package code.algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {

  public static void main(String[] args) {
    int[] arr = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
    SelectionSort.selectionSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  private static void selectionSort(int[] arr) {
    // outer loop
    for (int i = 0; i < arr.length; i++) {
      // initial min
      int minIndex = i;
      // inner loop
      for (int j = i + 1; j < arr.length; j++) {
        // pair other values if new < current-min then set new-min
        if (arr[j] < arr[minIndex]) {
          minIndex = j;
        }
      }
      // end of inner loop update values
      int temp = arr[minIndex];
      arr[minIndex] = arr[i];
      arr[i] = temp;
    }
  }
}
