package code.week2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SalesMatch {
  public static void main(String[] args) {
    // get input data
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    List<Integer> ar = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      ar.add(scan.nextInt());
    }
    System.out.println(sockMerchant(ar));
  }

  private static int sockMerchant(List<Integer> ar) {
    int counter = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    // insert number into Hash Tables
    for (Integer num : ar) {
      // if contain then add counter
      if (map.containsKey(num)) {
        // delete key for pair next new
        map.remove(num);
        counter++;
      } else {
        // add key
        map.put(num, 0);
      }
    }
    return counter;
  }
}
