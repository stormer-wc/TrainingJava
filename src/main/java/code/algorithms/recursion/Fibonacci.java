package code.algorithms.recursion;

import java.util.ArrayList;

public class Fibonacci {

  // Given a number N return the index value of the Fibonacci sequence, where the sequence is:

  // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 ...
  // the pattern of the sequence is that each value is the sum of the 2 previous values, that means
  // that for N=5 → 2+3

  // For example: fibonacciRecursive(6) should return 8

  public static void main(String[] args) {
    Fibonacci fc = new Fibonacci();
    int num = fc.fibonacciIterative(5);
    System.out.println(num);
    num = fc.fibonacciRecursive(5);
    System.out.println(num);
  }

  private int fibonacciIterative(int n) {
    if (n == 1) {
      return 1;
    }
    ArrayList<Integer> num = new ArrayList<>();
    num.add(0);
    num.add(1);
    for (int i = 2; i <= n; i++) {
      num.add(num.get(i - 1) + num.get(i - 2));
    }
    return num.get(num.size() - 1);
  } // O(n) faster than recursive.

  private int fibonacciRecursive(int n) {
    if (n < 2) {
      return n;
    }
    return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
  } // O(n^2), readable but slower.
}
