package code;

public class FindingDemo {

  public static void main(String[] args) {
    long startTime = System.nanoTime();
    String[] nemo = {"nemo"};
    String[] everyOne = new String[200000];
    for (int index = 0; index < everyOne.length; index++) {
      everyOne[index] = "person" + Math.random();
    }
    everyOne[everyOne.length - 1] = nemo[0];
    findNemo(everyOne);
    long endTime = System.nanoTime();
    long timeUse = endTime - startTime;
    System.out.println(timeUse);
  }

  public static void findNemo(String[] name) {
    for (String s : name) {
      if (s.equals("nemo")) {
        System.out.println("found nemo");
      }
    }
  }
}
