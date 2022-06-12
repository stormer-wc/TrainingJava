package code.dts.trees.binary_tree;

public class BinarySearchTree {

  BTNode root;

  public static void main(String[] args) {
    BinarySearchTree bt = new BinarySearchTree();
    bt.insert(9);
    bt.insert(4);
    bt.insert(20);
    bt.insert(1);
    bt.insert(6);
    bt.insert(15);
    bt.insert(170);
    bt.lookup(6);
    bt.lookupSolution(6);
    bt.remove(170);
  }

  //     9
  //  4     20
  // 1  6  15  170

  public BinarySearchTree() {
    this.root = null;
  }

  private void insert(int value) {
    BTNode newNode = new BTNode(value);
    BTNode current = this.root;
    // first insert
    if (this.root == null) {
      this.root = newNode;
    }
    // second onwards
    else {
      // loop node in tree
      while (true) {
        // check value is more than right current node
        if (value > current.value) {
          // current node is null then can insert here
          if (current.right == null) {
            current.right = newNode;
            break;
          }
          // right node not null then can go deeper in next round
          current = current.right;
        }
        // if value is lower than right current node
        else {
          // current node is null then can insert here
          if (current.left == null) {
            current.left = newNode;
            break;
          }
          // left node not null then can go deeper in next round
          current = current.left;
        }
      }
    }
  } // insert method

  private void lookup(int value) {
    BTNode current = this.root;
    BTNode before = current;
    boolean isRight = false;
    int counter = 0;
    while (true) {
      if (value == current.value) {
        System.out.println("found: " + current.value + " in round " + counter);
        break;
      }
      if (!isRight) {
        // go left
        if (current.left != null) {
          before = current;
          current = current.left;
        } else {
          current = before;
          isRight = true;
        }
      } else {
        // go right
        if (current.right != null) {
          before = current;
          current = current.right;
        } else {
          current = root.right;
          isRight = false;
        }
      }
      counter++;
    }
  }

  private void lookupSolution(int value) {
    if (this.root == null) {
      return;
    }
    BTNode current = this.root;
    while (current != null) {
      if (value < current.value) {
        current = current.left;
      } else if (value > current.value) {
        current = current.right;
      } else {
        System.out.println(current.value + " founded");
        return;
      }
    }
  }

  private void remove(int value) {
    if (this.root == null) {
      return;
    }
    BTNode current = this.root;
    BTNode parent = null;
    while (current != null) {
      // go left
      if (value < current.value) {
        parent = current;
        current = current.left;
      }
      // go right
      else if (value > current.value) {
        parent = current;
        current = current.right;
      }
      // found match value
      else if (value == current.value) {
        // option 1: no right child
        if (current.right == null) {
          if (parent == null) {
            this.root = current.left;
          } else {
            // if parent > current value, make current left child a child of parent
            if (current.value < parent.value) {
              parent.left = current.left;
            }
            // if parent < current value, make left child a right child of parent
            else if (current.value > parent.value) {
              parent.right = current.left;
            }
          }
        }
        // option 2: Right child which doesn't have a left child
        else if (current.right.left == null) {
          current.right.left = current.left;
          if (parent == null) {
            this.root = current.right;
          } else {
            // if parent > current, make right child of the left the parent
            if (current.value < parent.value) {
              parent.left = current.right;
            }
            // if parent < current, make right child a right child of the parent
            else if (current.value > parent.value) {
              parent.right = current.right;
            }
          }
        }
        // option 3: Right child that has a left child
        else {
          // find the Right child's left most child
          BTNode leftmost = current.right.left;
          BTNode leftmostParent = current.right;
          while (leftmost.left != null) {
            leftmostParent = leftmost;
            leftmost = leftmost.left;
          }
          // Parent's left subtree is now left most's right subtree
          leftmostParent.left = leftmost.right;
          leftmost.left = current.left;
          leftmost.right = current.right;
          if (parent == null) {
            this.root = leftmost;
          } else {
            if (current.value < parent.value) {
              parent.left = leftmost;
            } else if (current.value > parent.value) {
              parent.right = leftmost;
            }
          }
        }
        return;
      }
    }
  }
}
