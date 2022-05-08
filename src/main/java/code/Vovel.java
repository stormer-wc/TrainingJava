package code;

import java.util.Scanner;

public class Vovel {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    if (str.length() > 500) System.exit(0);
    str = str.replaceAll("[aeiouAEIOU]", "");
    System.out.println(str);
  }
}
