package code.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class CountingSort {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> arr =
        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

    List<Integer> result = countingSort(arr, n);

    bufferedReader.close();
  }

  private static List<Integer> countingSort(List<Integer> arr, int n) {
    if (n < 100 || n > (Math.pow(10, 6))) return new ArrayList<>();
    List<Integer> result = new ArrayList<>();
    int max = Collections.max(arr);
    if (max > 100 || max < 0) return new ArrayList<>();
    int[] freqArray = new int[max + 1];
    // add frequency to array
    for (int num : arr) {
      freqArray[num]++;
    }
    // iterate array to resultList
    for (int num : freqArray) {
      result.add(num);
    }
    return result;
  }
}
