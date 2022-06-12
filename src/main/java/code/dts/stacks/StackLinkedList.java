package code.dts.stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StackLinkedList {

  Node top;
  Node bottom;
  int length = 0;

  public static void main(String[] args) {
    StackLinkedList stack = new StackLinkedList();
    stack.push("google");
    stack.push("udemy");
    stack.push("discord");
    stack.peek();
    stack.pop();
    stack.peek();
    System.out.println("### print all ###");
    stack.printAll();
  }

  public void peek() {
    System.out.println("peek: " + this.top.value);
  } // view last item

  public void push(String value) {
    Node newNode = new Node(value);
    // check is empty stack
    if (length == 0) {
      this.top = newNode;
      this.bottom = newNode;
    } else {
      Node holdingPointer = this.top;
      top = newNode;
      top.next = holdingPointer;
    }
    length++;
    System.out.println("push: " + newNode.value);
  } // add last item

  public void pop() {
    if (this.top == null) {
      return;
    }
    if (this.top == this.bottom) {
      this.bottom = null;
    }
    //    Node holding = this.top;
    this.top = this.top.next;
    this.length--;
    System.out.println("pop: " + top.value);
  } // delete last item

  public void printAll() {
    List<String> list = new ArrayList<>();
    Node currentNode = this.top;
    while (currentNode != null) {
      list.add(currentNode.value);
      currentNode = currentNode.next;
    }
    System.out.println(Arrays.toString(list.toArray()));
  }

  // checkIsEmpty
}
