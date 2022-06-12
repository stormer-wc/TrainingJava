package code.dts.queues;

import java.util.ArrayList;
import java.util.Arrays;

public class MyQueue {

  Node first;
  Node last;
  int length;

  public static void main(String[] args) {
    MyQueue queue = new MyQueue();
    queue.enqueue("Oh Hi");
    queue.enqueue("Oh Welcome");
    queue.enqueue("FIRE");
    queue.printAll();
    queue.peek();
    queue.dequeue();
    queue.peek();
  }

  public MyQueue() {
    this.first = null;
    this.last = null;
    this.length = 0;
  }

  public void peek() {
    if (first != null) {
      System.out.println("peek: " + first.value);
    }
  } // view first in queue

  public void enqueue(String value) {
    Node newNode = new Node(value);
    if (length == 0) {
      first = newNode;
    } else {
      last.next = newNode;
    }
    last = newNode;
    length++;
  } // adding new at last queue

  public void dequeue() {
    if (first == last) {
      last = null;
      length--;
    }
    if (first != null) {
      first = first.next;
      length--;
    }
  } // remove first queue

  public void printAll() {
    ArrayList<String> list = new ArrayList<>();
    Node current = first;
    list.add(current.value);
    while (current.next != null) {
      current = current.next;
      list.add(current.value);
    }
    System.out.println(Arrays.toString(list.toArray()));
  }
}
