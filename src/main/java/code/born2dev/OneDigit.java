package code.born2dev;

import java.util.Scanner;

public class OneDigit {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String inputNumber = scan.next();
    int sum = 0;
    String[] number = new String[inputNumber.length()];
    // substring
    for (int i = 0; i < number.length; i++) {
      number[i] = inputNumber.substring(i, i + 1);
    }
    // sum number
    for (String s : number) {
      sum += Integer.parseInt(s);
      // when sum more than 1 digit
      while (String.valueOf(sum).length() > 1) {
        int num1 = Integer.parseInt(String.valueOf(sum).substring(0, 1));
        int num2 = Integer.parseInt(String.valueOf(sum).substring(1, 2));
        sum = num1 + num2;
      }
    }
    System.out.println(sum);
  }
}
