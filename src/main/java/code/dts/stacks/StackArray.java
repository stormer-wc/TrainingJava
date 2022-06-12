package code.dts.stacks;

import java.util.ArrayList;
import java.util.Arrays;

public class StackArray {

  ArrayList<String> stack;

  public static void main(String[] args) {
    StackArray stack = new StackArray();
    stack.push("google");
    stack.push("udemy");
    stack.push("discord");
    stack.peek();
    stack.pop();
    stack.peek();
    stack.push("discord");
    System.out.println("### print all ###");
    stack.printAll();
  }

  public StackArray() {
    this.stack = new ArrayList<>();
  }

  public void peek() {
    System.out.println("peek: " + stack.get(stack.size() - 1));
  } // view last item

  public void push(String value) {
    stack.add(value);
  } // add last item

  public void pop() {
    System.out.println("pop: " + stack.get(stack.size() - 1));
    stack.remove(stack.size() - 1);
  } // delete last item

  public void printAll() {
    System.out.println(Arrays.toString(stack.toArray()));
  }
}
