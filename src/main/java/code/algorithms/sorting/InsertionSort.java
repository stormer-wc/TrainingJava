package code.algorithms.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {

  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0));
    InsertionSort.insertionSort(arr);
    System.out.println(Arrays.toString(arr.toArray()));
  }

  private static void insertionSort(ArrayList<Integer> arr) {
    for (int i = 0; i < arr.size(); i++) {
      if (arr.get(i) <= arr.get(0)) {
        // move number to the first position
        arr.add(0, arr.remove(i));
      } else {
        // only sort number smaller than number on the left of it. This is the part of insertion
        // sort that makes it fast if the array is almost sorted.
        if (arr.get(i) < arr.get(i - 1)) {
          // find where number should go
          for (int j = 1; j < i; j++) {
            if (arr.get(i) >= arr.get(j - 1) && arr.get(i) < arr.get(j)) {
              // move number to the right spot
              arr.add(j, arr.remove(i));
              break;
            }
          }
        }
      }
    }
  }
}
