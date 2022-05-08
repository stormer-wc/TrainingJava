package code.born2dev;

import java.util.Scanner;

public class SumHidden {

  public static void main(String[] args) {
    // input data
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();

    // make string to array of char
    char[] text = new char[str.length()];
    for (int i = 0; i < str.length(); i++) {
      text[i] = str.charAt(i);
    }

    // find digit
    StringBuilder numStr = new StringBuilder();
    int sum = 0;
    for (int i = 0; i < text.length; i++) {
      char c = text[i];
      if (Character.isDigit(c)) {
        numStr.append(c);
      } else if (!numStr.toString().isBlank()) {
        sum += Integer.parseInt(numStr.toString());
        numStr = new StringBuilder();
      }
      // if last round and value not sum all (case integer in last text)
      if (i == text.length - 1 && !numStr.isEmpty()) {
        sum += Integer.parseInt(numStr.toString());
      }
      // for old version
      //      if (i == text.length - 1 && !numStr.toString().equals("")) {
      //        sum += Integer.parseInt(numStr.toString());
      //      }
    }

    // if digit of sum < 4 add 0
    String sumStr = String.valueOf(sum);
    if (sumStr.length() < 4) {
      // fill "0" until equal 4 digit
      String result = "0".repeat(4 - sumStr.length()) + sumStr;
      System.out.println(result);
    } else {
      System.out.println(sum);
    }
  }
}
