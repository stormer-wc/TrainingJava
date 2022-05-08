package code.born2dev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SommaiV3 {
  // TODO:debug this
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int length = scan.nextInt();
    //    scan.nextLine();
    List<Customer> customers = new ArrayList<>();

    for (int i = 0; i < length; i++) {

      String name = scan.nextLine();
      int year = scan.nextInt();
      String gender = scan.next();
      scan.nextLine();

      Customer customer = new Customer(name, year, gender);
      customers.add(customer);
    }
    scan.close();
    printData(customers);
  }

  public static void printData(List<Customer> customers) {
    System.out.println("--Customer Information--");
    for (Customer customer : customers) {
      System.out.println(customer.name + " (age :" + (2017 - customer.year) + " )");
    }
  }
}

class Customer {
  String name;
  int year;
  String gender;

  public Customer(String name, int year, String gender) {
    this.name = name;
    this.year = year;
    this.gender = gender;
  }
}
