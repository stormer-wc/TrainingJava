package code.dts_algo.arrays;

import java.util.Arrays;

public class MergeSortArray {

  public static void main(String[] args) {
    int[] arr1 = {0, 3, 4, 31};
    int[] arr2 = {30, 21, 2, 31, 22, 33};
    int[] result = solution(arr1, arr2);
    System.out.println(Arrays.toString(result));

    int[] arr = margeTwoSortedArray(new int[] {0, 3, 4, 31}, new int[] {30, 21, 2, 31, 22, 33});
    System.out.println(Arrays.toString(arr));
  }

  static int[] solution(int[] arr1, int[] arr2) {
    // check input
    if (arr1.length == 0) {
      System.out.println("arr1 is empty");
      return arr2;
    }
    if (arr2.length == 0) {
      System.out.println("arr2 is empty");
      return arr1;
    }

    // sort both array first
    Arrays.sort(arr1);
    Arrays.sort(arr2);

    // create new array for store sorted data
    int[] result = new int[arr1.length + arr2.length];

    // create counter arr1, arr2
    int index = 0;
    int i = 0;
    int j = 0;

    // use for loop to sort all data in both  array
    while (i < arr1.length && j < arr2.length) {
      // condition add min to result, increase index and counter
      if (arr1[i] < arr2[j]) {
        result[index] = arr1[i];
        i++;
      } else {
        result[index] = arr2[j];
        j++;
      }
      index++;
    }

    // check item which not read
    while (i < arr1.length) {
      result[index] = arr1[i];
      index++;
      i++;
    }
    while (j < arr2.length) {
      result[index] = arr2[j];
      index++;
      j++;
    }

    return result;
  }

  public static int[] margeTwoSortedArray(int[] array1, int[] array2) {
    final int[] mergedArray = new int[array1.length + array2.length];
    int j = 0;
    int k = 0;
    for (int i = 0; i < mergedArray.length; i++) {
      if (j != array1.length && (k == array2.length || array1[j] < array2[k])) {
        mergedArray[i] = array1[j];
        j++;
      } else {
        mergedArray[i] = array2[k];
        k++;
      }
    }
    return mergedArray;
  }
} // mergeSortedArray
