package code.week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubArrayDivision1Solved {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    // input data
    int n = in.nextInt();
    int[] squares = new int[n];
    for (int squares_i = 0; squares_i < n; squares_i++) {
      squares[squares_i] = in.nextInt();
    }
    int d = in.nextInt();
    int m = in.nextInt();

    // initial variable
    int result = 0;

    // loop array
    for (int i = 0; i < n - m + 1; i++) {
      int tmpSum = 0;
      List<Integer> log = new ArrayList<>();
      // inner loop
      for (int j = i; j < i + m; j++) {
        tmpSum += squares[j];
        log.add(squares[j]);
      }
      if (tmpSum == d) {
        result++;
        System.out.println(log);
      }
    }
    // show result
    System.out.println(result);
  }
}
