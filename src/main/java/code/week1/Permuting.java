package code.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Permuting {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int q = Integer.parseInt(bufferedReader.readLine().trim());

    IntStream.range(0, q)
        .forEach(
            qItr -> {
              try {
                String[] firstMultipleInput =
                    bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int k = Integer.parseInt(firstMultipleInput[1]);

                List<Integer> A =
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .toList();

                List<Integer> B =
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .toList();

                twoArrays(k, A, B);
              } catch (IOException ex) {
                throw new RuntimeException(ex);
              }
            });

    bufferedReader.close();
  }

  // for every A'[i] + B'[i] >= k
  // MaxValue(A) + MinValue(B) >= k
  private static void twoArrays(int k, List<Integer> a, List<Integer> b) {
    // sort or permuting first
    List<Integer> sortA = a.stream().sorted().toList();
    List<Integer> sortB = b.stream().sorted(Comparator.reverseOrder()).toList();
    // check condition
    for (int i = 0; i < sortA.size(); i++) {
      int numA = sortA.get(i);
      int numB = sortB.get(i);
      if (numA + numB < k) {
        System.out.println("NO");
        return;
      }
    }
    System.out.println("YES");
  }
}
