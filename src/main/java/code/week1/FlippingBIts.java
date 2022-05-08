package code.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class FlippingBIts {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int q = Integer.parseInt(bufferedReader.readLine().trim());

    IntStream.range(0, q)
        .forEach(
            qItr -> {
              try {
                long n = Long.parseLong(bufferedReader.readLine().trim());

                long result = flippingBits(n);
                System.out.println(result);

              } catch (IOException ex) {
                throw new RuntimeException(ex);
              }
            });

    bufferedReader.close();
  }

  private static long flippingBits(long n) {
    String binary = Long.toBinaryString(n);
    String binary32 = String.format("%32s", binary).replaceAll(" ", "0");
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < binary32.length(); i++) {
      char c = binary32.charAt(i);
      if (c == '0') {
        c = '1';
      } else if (c == '1') {
        c = '0';
      }
      stringBuilder.append(c);
    }
    return Long.parseLong(stringBuilder.toString(), 2);
  }
}
