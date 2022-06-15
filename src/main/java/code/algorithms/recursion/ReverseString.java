package code.algorithms.recursion;

public class ReverseString {

  public static void main(String[] args) {
    String text = "yoyo mastery";
    reverseStringItr(text);
    System.out.println(reverseStringRecursive(text));
  }

  static void reverseStringItr(String str) {
    char[] c = new char[str.length()];
    int count = str.length() - 1;
    for (int i = 0; i < str.length(); i++) {
      c[count] = str.charAt(i);
      count--;
    }
    System.out.println(c);
  } // Iterable

  static String reverseStringRecursive(String str) {
    if (str.isBlank()) {
      return "";
    }
    return reverseStringRecursive(str.substring(1)) + str.charAt(0);
  } // Recursive
}
