package code.dts_algo.hash_tables;

import java.util.*;

public class FirstRecurringCharacter {

  // Google Question
  // Given an array = [2,5,1,2,3,5,1,2,4]:
  // It should return 2

  // Given an array = [2,1,1,2,3,5,1,2,4]:
  // It should return 1

  // Given an array = [2,3,4,5]:
  // It should return undefined

  // Bonus... What if we had this:
  // [2,5,5,2,3,5,1,2,4]
  // return 5 because the pairs are before 2,2

  public static void main(String[] args) {
    int[] arr = {2, 5, 5, 2, 3, 5, 1, 2, 4};
    findDuplicate(arr);
  }

  static void findDuplicate(int[] arr) {

    HashMap<Integer, Integer> map = new HashMap<>();
    // add value form array to hash tables
    for (Integer n : arr) {
      // check duplicate before add, if duplicate show message and end process
      if (map.containsKey(n)) {
        System.out.println("contain: " + n);
        return;
      }
      map.put(n, 0);
    }
    // when all value not have duplicate
    System.out.println("undefined");
  }
}
