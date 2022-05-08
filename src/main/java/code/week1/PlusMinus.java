package code.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class PlusMinus {

  /*
   * Complete the 'plusMinus' function below.
   *
   * The function accepts INTEGER_ARRAY arr as parameter.
   */
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> arr =
        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

    plusMinus(arr);

    bufferedReader.close();
  }

  public static void plusMinus(List<Integer> arr) {
    // Write your code here
    int positive = 0;
    int negative = 0;
    int zero = 0;
    for (int num : arr) {
      if (num > 0) {
        positive++;
      } else if (num < 0) {
        negative++;
      } else {
        zero++;
      }
    }
    List<Double> result = new ArrayList<>();
    result.add(((double) positive / arr.size()));
    result.add(((double) negative / arr.size()));
    result.add(((double) zero / arr.size()));
    for (double r : result) {
      System.out.println(r);
    }
  }
}
