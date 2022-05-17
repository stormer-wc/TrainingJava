package code.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

public class SubArrayDivision1 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> s =
        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .toList();

    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    int d = Integer.parseInt(firstMultipleInput[0]);

    int m = Integer.parseInt(firstMultipleInput[1]);

    //    if (!checkValue(s, d, m, n)) {
    //      return;
    //    }

    //    int result = birthdayOld(s, d, m);
    int result = birthday(s, d, m);
    System.out.println(result);

    bufferedReader.close();
  }

  /*
   * Complete the 'birthday' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER_ARRAY s
   *  2. INTEGER d
   *  3. INTEGER m
   */

  /*
    example:
      s[] = [2,2,1,3,2]
      d=4, m=2
      m for length, d for sum(max limit)
     result = 2 ( [2,2] and [1,3] )
  */

  private static int birthdayOld(List<Integer> s, int d, int m) {
    // initial value for operation -> sum, result, round
    int sum = 0;
    int result = 0;
    int round = 0;
    // loop all s[i]
    for (Integer segment : s) {
      // add round first before do something
      round++;
      // sum += s[i]
      sum += segment;
      // if sum == d -> result++, sum = 0, round = 0
      if (sum == d && round <= m) {
        result++;
        sum = 0;
        round = 0;
      }
      // sum > d -> sum -= s[i]
      else if (sum > d) {
        sum -= segment;
        round--;
      }
    }
    return result;
  }

  /*
   *   19
   *   2 5 1 3 4 4 3 5 1 1 2 1 4 1 3 3 4 2 1
   *   18 7
   *   result = [2, 1, 4, 1, 3, 3, 4], [1, 4, 1, 3, 3, 4, 2], [4, 1, 3, 3, 4, 2, 1]
   *
   *   13
   *   4 5 4 2 4 5 2 3 2 1 1 5 4
   *   15 4
   */
  private static int birthday(List<Integer> s, int d, int m) {
    int result = 0;
    // outer for loop
    for (int i = 0; i < s.size(); i++) {
      int sum = 0;
      if (s.size() - i >= m) {
        // inner for loop size = m
        for (int j = i; j < m + i; j++) {
          sum += s.get(j);
        }
      }
      // round: first j, last j
      // 0: 0, 2+0
      // 1: 1, 2+1
      // 2: 2, 2+2
      // check if sum = d -> result++
      if (sum == d) {
        result++;
      }
    }
    return result;
  }

  private static boolean checkValue(List<Integer> s, int d, int m, int n) {
    // check size of segment
    boolean check = n >= 1 && n <= 100;
    // check each value in segment
    for (Integer segment : s) {
      if (segment > 5 || segment < 1) {
        check = false;
        break;
      }
    }
    // check d (day)
    if (d < 1 || d > 31) check = false;
    // check m (month)
    if (m < 1 || m > 12) check = false;
    return check;
  }
}
