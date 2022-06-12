package code.dts.hash_tables;

public class HashTableImpl {

  public static void main(String[] args) {
    MyHash myHash = new MyHash(50);
    myHash.set("grapes", 10000);
    myHash.get("grapes");
    myHash.set("apples", 9);
    myHash.get("apples");
    myHash.get("hhh");
    myHash.key();
  }
}
