package code.dts_algo.arrays;

import java.util.Scanner;

public class ReverseArray {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String message = scan.nextLine();
    checkInput(message);
    reverse(message);
    betterReverse(message);
  }

  static void reverse(String message) {

    StringBuilder sb = new StringBuilder();
    // put separate character to array
    for (int i = message.length() - 1; i >= 0; i--) {
      sb.append(message.charAt(i));
    }
    // print data
    System.out.println(sb);
  }

  static void betterReverse(String message) {
    StringBuilder sb = new StringBuilder(message);
    sb.reverse();
    System.out.println(sb);
  }

  static void checkInput(String message) {
    if (message.isEmpty() || message.isBlank()) {
      System.out.println("invalid input");
      System.exit(0);
    }
  } // check input
}
