package code.born2dev;

import java.util.Scanner;

public class Pyramid3 {

  /*
  n = 4
    | ---*---
    | --***--
    | -*****-
    | *******
    | -*****-
    | --***--
    | ---*---
    all line = (2*n)-1 = 8-1 = 7
    pattern (space, star, space):
      3, 1, 3 = 7
      2, 3, 2 = 7
      1, 5, 1 = 7
      0, 7, 0 = 7
      1, 5, 1 = 7
      2, 3 ,2 = 7
      3, 1, 3 = 7
   */
  public static void main(String[] args) {
    // receive n
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int halfN = (2 * n - 1) / 2;
    // upper half
    for (int i = halfN; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < (2 * n - 1) - (2 * i); j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    // lower half
    for (int i = 0; i < halfN + 1; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (int j = (2 * n - 1) - (2 * i); j > 0; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
    // 5 : (2*n-1)-(2*(i+1)) = 7-2 =5
    // 3 : 7-4 = 3
  }
}
