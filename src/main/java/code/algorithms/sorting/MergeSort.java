package code.algorithms.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0));
    MergeSort mergeSort = new MergeSort();
    ArrayList<Integer> result = mergeSort.mergeSort(arr);
    System.out.println("sorted");
    System.out.println(Arrays.toString(result.toArray()));
  }

  private ArrayList<Integer> mergeSort(ArrayList<Integer> arr) {
    // base case
    int size = arr.size();
    if (size == 1) {
      return arr;
    }
    // Split Array in into right and left
    ArrayList<Integer> left = new ArrayList<>(arr.subList(0, size / 2));
    ArrayList<Integer> right = new ArrayList<>(arr.subList(size / 2, size));
    // recursion
    return merge(mergeSort(left), mergeSort(right));
  }

  private ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right) {
    ArrayList<Integer> merged = new ArrayList<>();
    int leftCount = 0;
    int rightCount = 0;
    while (leftCount < left.size() && rightCount < right.size()) {
      // add lower value
      if (left.get(0) < right.get(0)) {
        merged.add(left.remove(0));
      } else {
        merged.add(right.remove(0));
      }
    }
    // add unsorted value
    List<Integer> leftRemaining = left.subList(leftCount, left.size());
    List<Integer> rightRemaining = right.subList(rightCount, right.size());
    merged.addAll(leftRemaining);
    merged.addAll(rightRemaining);
    // print sorted array
    System.out.println(Arrays.toString(merged.toArray()));
    return merged;
  } // combine two side
}
