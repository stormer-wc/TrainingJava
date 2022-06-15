package code.algorithms.recursion;

public class Fibonacci {

  // Given a number N return the index value of the Fibonacci sequence, where the sequence is:

  // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 ...
  // the pattern of the sequence is that each value is the sum of the 2 previous values, that means
  // that for N=5 → 2+3

  // For example: fibonacciRecursive(6) should return 8

  public static void main(String[] args) {
    Fibonacci fc = new Fibonacci();
    // n must more than 2
    int num = fc.fibonacciIterative(5);
    System.out.println(num);
    num = fc.fibonacciRecursive(5);
    System.out.println(num);
  }

  // n=3 -> 1+2
  private int fibonacciIterative(int n) {
    if (n == 1) {
      return 1;
    }
    int first = 0;
    int second = 1;
    int result = 0;
    for (int i = 2; i <= n; i++) {
      result = first + second;
      first = second;
      second = result;
    }
    return result;
  }

  private int fibonacciRecursive(int n) {
    if (n <= 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }
    return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
  }
}
