package code.born2dev;

import java.util.Scanner;

public class Capslock {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String message = scan.nextLine();
    String[] str = new String[message.length()];
    for (int i = 0; i < str.length; i++) {
      str[i] = String.valueOf(message.charAt(i));
    }
    for (int i = 0; i < str.length; i++) {
      if (Character.isUpperCase(str[i].charAt(0))) {
        String lowercase = str[i].toLowerCase();
        str[i] = lowercase;
      } else if (Character.isLowerCase(str[i].charAt(0))) {
        String uppercase = str[i].toUpperCase();
        str[i] = uppercase;
      }
      System.out.print(str[i]);
    }
  }
}
