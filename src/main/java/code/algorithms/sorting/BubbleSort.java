package code.algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {

  public static void main(String[] args) {
    // test data
    int[] arr = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};

    // call bubble sort
    BubbleSort.bubbleSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  private static void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          // swap value
          int temp = arr[j];
          arr[j] = arr[i];
          arr[i] = temp;
        }
      }
    }
  } // bubble sort
}
