package code.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class MiniMaxSum {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    List<Integer> arr =
        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .toList();

    miniMaxSum(arr);
    bufferedReader.close();
  }

  private static void miniMaxSum(List<Integer> arr) {
    List<Long> result = new ArrayList<>();
    // sum data with condition
    for (int i = 0; i < arr.size(); i++) {
      long sum = 0;
      for (int j = 0; j < arr.size(); j++) {
        if (i != j) sum += arr.get(j);
      }
      result.add(sum);
    }
    // find max min in result list
    Long max = Collections.max(result);
    Long min = Collections.min(result);
    System.out.println(min + " " + max);
  }
}
