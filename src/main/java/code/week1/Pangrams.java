package code.week1;

import java.util.Scanner;

public class Pangrams {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    System.out.println(checkPangram(s));
  }

  static String checkPangram(String s) {
    s = s.toLowerCase();

    boolean allLetterPresent = true;
    for (char ch = 'a'; ch <= 'z'; ch++) {
      // Check if the string does not contain all the letters
      if (!s.contains(String.valueOf(ch))) {
        allLetterPresent = false;
        break;
      }
    }
    // Check if all letter present then
    return allLetterPresent ? "pangram" : "not pangram";
  }
}
