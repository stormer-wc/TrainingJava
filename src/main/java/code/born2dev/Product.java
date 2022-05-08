package code.born2dev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product {
  /*
      input
      1. number of all product
      2. n-1 loop for product code
      3. last n loop for searching code

      output
      1. position of product from searching code (if not => show "Not Found")

      condition
      1. (1 < n <100)
  */
  public static void main(String[] args) {
    // receive input from keyboard
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    if (n < 1 || n > 100) return;
    String[] products = new String[n];
    for (int i = 0; i < products.length; i++) {
      products[i] = scan.next();
    }
    String searchCode = scan.next();
    // iterate data to find product position
    List<Integer> position = new ArrayList<>();
    for (int i = 0; i < products.length; i++) {
      if (products[i].equals(searchCode)) {
        position.add(i + 1);
      }
    }
    // print position of product (if not found show message "Not Found")
    if (position.isEmpty()) {
      System.out.println("Not Found");
    } else {
      StringBuilder message = new StringBuilder("Position: ");
      for (Integer p : position) {
        message.append(p).append(",");
      }
      message.deleteCharAt(message.length() - 1);
      System.out.println(message);
    }
  }
}
