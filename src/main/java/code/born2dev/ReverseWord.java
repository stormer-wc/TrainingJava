package code.born2dev;

import java.util.Scanner;

public class ReverseWord {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String stringInput = sc.nextLine();
    char[] text = new char[stringInput.length()];
    for (int i = 0; i < stringInput.length(); i++) {
      text[i] = stringInput.charAt(i);
    }
    for (int i = String.valueOf(text).length()-1; i >= 0; i--) {
      System.out.print(text[i]);
    }
  }
}
