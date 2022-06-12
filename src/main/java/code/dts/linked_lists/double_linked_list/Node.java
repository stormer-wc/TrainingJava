package code.dts.linked_lists.double_linked_list;

public class Node {

  int value;
  Node next;
  Node prev;

  public Node(int value) {
    this.value = value;
    this.next = null;
    this.prev = null;
  }
}
