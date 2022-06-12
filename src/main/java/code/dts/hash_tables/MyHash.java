package code.dts.hash_tables;

import java.util.ArrayList;
import java.util.List;

class MyHash {

  private final ArrayList<KeyValue>[] data;

  private int currentLength;

  public MyHash(int size) {
    this.data = new ArrayList[size];
    currentLength = 0;
  }

  private int hash(String key) {
    int hash = 0;
    for (int i = 0; i < key.length(); i++) {
      hash = (hash + key.codePointAt(i) * i) % this.data.length;
    }
    return hash;
  }

  public void get(String key) {
    int address = hash(key);
    if (data[address] == null) {
      System.out.println("not found key: " + key);
      return;
    }
    for (KeyValue k : data[address]) {
      if (k.getKey().equals(key)) {
        System.out.println(k.getValue());
      }
    }
  }

  public void set(String key, int value) {
    int address = hash(key);
    if (data[address] == null) {
      ArrayList<KeyValue> arrayAtAddress = new ArrayList<>();
      data[address] = arrayAtAddress;
      currentLength++;
    }
    KeyValue pair = new KeyValue(key, value);
    data[address].add(pair);
  }

  public void key() {
    List<String> keyArray = new ArrayList<>();
    for (ArrayList<KeyValue> datum : data) {
      if (datum != null) {
        keyArray.add(datum.get(0).getKey());
      }
    }
    System.out.println("print all keys:");
    keyArray.forEach(System.out::println);
  }
}
