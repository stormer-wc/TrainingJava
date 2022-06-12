package code.dts.linked_lists.double_linked_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyDoublyLinkedList {

  Node head;
  Node tail;
  int length;

  public MyDoublyLinkedList(int value) {
    this.head = new Node(value);
    this.tail = this.head;
    this.length = 1;
  }

  public static void main(String[] args) {
    MyDoublyLinkedList myDoublyLinkedList = new MyDoublyLinkedList(10);
    myDoublyLinkedList.append(5);
    myDoublyLinkedList.append(16);
    myDoublyLinkedList.prepend(22);
    myDoublyLinkedList.insert(3, 69);
    myDoublyLinkedList.printList();
    myDoublyLinkedList.lookup(3);
    myDoublyLinkedList.remove(2);
    myDoublyLinkedList.printList();
  }

  public void append(int value) {
    Node newNode = new Node(value);
    tail.next = newNode;
    newNode.prev = tail;
    tail = newNode;
    length++;
  }

  public void prepend(int value) {
    Node newNode = new Node(value);
    newNode.next = this.head;
    this.head.prev = newNode;
    this.head = newNode;
    length++;
  }

  public void insert(int index, int value) {
    if (index < 0 || index > length) {
      System.err.println("Index Out Of Bounds For Length " + length);
    } else if (index == 0) {
      prepend(value);
    } else if (index == length) {
      append(value);
    } else {
      Node newNode = new Node(value);
      Node leader = traverseToIndex(index - 1);
      Node follower = leader.next;
      leader.next = newNode;
      newNode.prev = leader;
      newNode.next = follower;
      length++;
    }
  }

  public void remove(int index) {
    // check params
    if (index < 0 || index > length) {
      System.out.println("error index: remove failed");
      return;
    }
    Node start = traverseToIndex(index - 1);
    Node end = traverseToIndex(index + 1);
    start.next = end;
    end.prev = start;
    length--;
  }

  public Node traverseToIndex(int index) {
    int counter = 0;
    Node currentNode = this.head;
    while (counter != index) {
      currentNode = currentNode.next;
      counter++;
    }
    return currentNode;
  }

  public void printList() {
    List<Integer> list = new ArrayList<>();
    Node currentNode = this.head;
    while (currentNode != null) {
      list.add(currentNode.value);
      currentNode = currentNode.next;
    }
    System.out.println(Arrays.toString(list.toArray()));
  }

  public void lookup(int index) {
    Node node = traverseToIndex(index);
    System.out.println("value of index " + index + " is " + node.value);
  }
}
