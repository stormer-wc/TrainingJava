package code.week1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class DiagonalDifference {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    List<List<Integer>> arr = new ArrayList<>();

    IntStream.range(0, n)
        .forEach(
            i -> {
              try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList()));
              } catch (IOException ex) {
                throw new RuntimeException(ex);
              }
            });

    int result = diagonalDifference(arr);
    System.out.println(result);

    bufferedReader.close();
  }

  public static int diagonalDifference(List<List<Integer>> arr) {
    int left = 0;
    int right = 0;
    // left
    for (int i = 0; i < arr.size(); i++) {
      for (int j = 0; j < arr.size(); j++) {
        if (i == j) {
          left += arr.get(i).get(j);
        }
      }
    }
    // right
    for (int i = 0; i < arr.size(); i++) {
      for (int j = arr.size() - 1; j >= 0; j--) {
        if (j == arr.size() - (i + 1)) {
          right += arr.get(i).get(j);
        }
      }
    }
    return Math.abs(left - right);
  }
}
