package code.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class LonelyInteger {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> a =
        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

    List<Integer> result = lonelyInteger(a);
    for (int r : result) {
      System.out.println(r);
    }
    bufferedReader.close();
  }

  static List<Integer> lonelyInteger(List<Integer> a) {
    List<Integer> result = new ArrayList<>();
    for (int i : a) {
      int counter = 0;
      for (int j : a) {
        if (i == j) counter++;
      }
      if (counter == 1) result.add(i);
    }
    return result;
  }
}
