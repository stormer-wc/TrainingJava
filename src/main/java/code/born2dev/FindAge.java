package code.born2dev;

import java.util.Scanner;

public class FindAge {

  /*
    y year ago: a = x+n-y, b = x-y
    in present: a = x+n, b = x
    assume a = m*b:
      x+n-y = m*(x-y)
      x+n-y = mx-my
      x-mx = -my+y-n
      x(1-m) = -my+y-n
      x = (-my+y-n)/(1-m)
    result: a = x+n, b = x
  */
  public static void main(String[] args) {
    // receive data n m y
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    int y = scan.nextInt();
    // find x
    if (m == 1) return;
    int x = (-(m * y) + y - n) / (1 - m);
    // print a, b
    System.out.println(x + n + " " + x);
  }
}
