package code.born2dev;

import java.util.Scanner;

public class Sorting {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] number = new int[5];
    // input data (length = 5)
    for (int i = 0; i < 5; i++) {
      number[i] = scan.nextInt();
    }
    // sorting
    // 0,1 1,2 2,3 3,4 => 5 round
    int temp;
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 4; j++) {
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
