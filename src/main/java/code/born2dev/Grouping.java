package code.born2dev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grouping {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int n = scan.nextInt();
    scan.nextLine();
    List<Box> boxList = new ArrayList<>();
    // insert box to boxList
    for (int i = 0; i < n; i++) {
      String inputString = scan.nextLine();
      String[] s = inputString.split("\\s+");
      int f = Integer.parseInt(s[0]);
      int t = Integer.parseInt(s[1]);
      String name = s[2];
      Box box = new Box(f, t, name);
      boxList.add(box);
    }
    // find box to insert
    for (Box b : boxList) {
      if (x <= b.max && x >= b.min) {
        System.out.println(b.name);
      }
    }
  }
}

class Box {
  int min;
  int max;
  String name;

  public Box(int min, int max, String name) {
    this.min = min;
    this.max = max;
    this.name = name;
  }

  @Override
  public String toString() {
    return min + " " + max + " " + name;
  }
}
