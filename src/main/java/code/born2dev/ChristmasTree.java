package code.born2dev;

import java.util.Scanner;

public class ChristmasTree {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    // print tree
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i + 2; j++) {
        for (int k = 0; k < n - j; k++) {
          System.out.print(" ");
        }
        for (int k = 0; k < (2 * j + 1); k++) {
          System.out.print("*");
        }
        System.out.println();
      }
    }
    // print root
    for (int i = 0; i < 2; i++) {
      if (i == 0) {
        for (int j = 0; j < (2 * n); j++) {
          System.out.print(" ");
          if (j == 2 * n / 2 - 1) {
            System.out.print("|");
          }
        }
      } else {
        for (int j = 0; j < (2 * n); j++) {
          System.out.print("=");
          if (j == 2 * n / 2 - 1) {
            System.out.print("V");
          }
        }
      }
      System.out.println();
    }
  }
}
