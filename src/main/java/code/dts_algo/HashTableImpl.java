package code.dts_algo;

public class HashTableImpl {

  public static void main(String[] args) {
    MyHash myHash = new MyHash(50);
    myHash.set("grapes", 10000);
    System.out.println(myHash.get("grapes"));
    myHash.set("apples", 9);
    System.out.println(myHash.get("apples"));
  }
}

class MyHash {

  private final int[] data;

  public MyHash(int size) {
    this.data = new int[size];
  }

  private int hash(String key) {
    int hash = 0;
    for (int i = 0; i < key.length(); i++) {
      hash = (hash + key.codePointAt(i) * i) % this.data.length;
    }
    return hash;
  }

  public int get(String key) {
    return data[hash(key)];
  }

  public void set(String key, int value) {
    data[hash(key)] = value;
  }
}
