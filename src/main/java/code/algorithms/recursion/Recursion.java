package code.algorithms.recursion;

public class Recursion {

  public static void main(String[] args) {
    Recursion recursion = new Recursion();
    int fac = recursion.findFactorialRecursive(5);
    System.out.println(fac);
    int facItr = recursion.findFactorialIterative(5);
    System.out.println(facItr);
  }

  private int findFactorialRecursive(int number) {
    // base case
    if (number == 2) {
      return 2;
    }
    int fac = number;
    // recursive case
    fac *= findFactorialRecursive(number - 1);
    return fac;
  }
  // 5 * 4 * 3 * 2 * 1
  // 5*4! 4*3! 3*2! 2*1! 1*0!

  private int findFactorialIterative(int number) {
    int fac = 1;
    if (number == 2) {
      return 2;
    }
    for (int i = 2; i <= number; i++) {
      fac *= i;
    }
    return fac;
  }
}
