package code.dts_algo.linked_lists.linked_list_implement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyLinkedList {

  Node head;
  Node tail;
  int length;

  public MyLinkedList(int value) {
    this.head = new Node(value);
    this.tail = this.head;
    this.length = 1;
  }

  public static void main(String[] args) {
    MyLinkedList myLinkedList = new MyLinkedList(10);
    myLinkedList.append(5);
    myLinkedList.append(16);
    myLinkedList.prepend(22);
    myLinkedList.insert(3, 69);
    myLinkedList.printList();
    myLinkedList.lookup(3);
    myLinkedList.remove(2);
    myLinkedList.printList();
  }

  public void append(int value) {
    Node newNode = new Node(value);
    // add pointer in current tail to point latest tail
    tail.next = newNode;
    // change current tail to new node
    tail = newNode;
    length++;
  }

  public void prepend(int value) {
    Node newNode = new Node(value);
    // add pointer on new head
    newNode.next = this.head;
    // make current head = new head
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
      Node holdingPointer = leader.next;
      // change pointer to point new node
      leader.next = newNode;
      // point adding node to old node
      newNode.next = holdingPointer;
      length++;
    }
  }

  public void remove(int index) {
    // check params
    if (index < 0 || index > length) {
      System.out.println("error index: remove failed");
      return;
    }
    // before unwanted node to change pointer
    Node start = traverseToIndex(index - 1);
    // skip unwanted node by change pointer
    start.next = traverseToIndex(index + 1);
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
