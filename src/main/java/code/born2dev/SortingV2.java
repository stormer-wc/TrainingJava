package code.born2dev;

import java.util.Scanner;

public class SortingV2 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int round = scan.nextInt();
    int[] number = new int[round];
    // input data (length = 5)
    for (int i = 0; i < round; i++) {
      number[i] = scan.nextInt();
    }
    // sorting
    int temp;
    for (int i = 0; i < number.length; i++) {
      for (int j = 0; j < number.length - 1; j++) {
        if (number[j] < number[j + 1]) {
          temp = number[j + 1];
          number[j + 1] = number[j];
          number[j] = temp;
        }
      }
    }
    // print
    for (int num : number) {
      System.out.println(num);
    }
  }
}
