package code.born2dev;

import java.util.Scanner;

public class Password {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String password = scan.next();
    if (password.length() < 3 || password.length() > 20) {
      System.out.println("Invalid");
      return;
    }

    // initial variable
    char[] pw = new char[password.length()];
    int uppercase = 0;
    int lowercase = 0;
    int symbol = 0;
    int number = 0;

    // make string to array of char
    for (int i = 0; i < password.length(); i++) {
      pw[i] = password.charAt(i);
    }

    // loop find type of password
    for (char c : pw) {
      if (Character.isUpperCase(c)) {
        uppercase++;
      } else if (Character.isDigit(c)) {
        number++;
      } else if (c >= 33 && c <= 47 || c == 64) {
        symbol++;
      } else {
        lowercase++;
      }
    }

    // check valid
    if (uppercase > 0 && lowercase > 0 && number > 0 && symbol > 0) {
      System.out.println("Valid");
    } else {
      System.out.println("Invalid");
    }
  }
}
