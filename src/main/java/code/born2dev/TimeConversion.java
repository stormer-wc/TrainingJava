package code.born2dev;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    System.out.println(convertTime(str));
  }

  private static String convertTime(String str) {
    DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
    DateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
    Date date;
    String output = null;
    try {
      date = df.parse(str);
      output = outputFormat.format(date);
    } catch (ParseException pe) {
      pe.printStackTrace();
    }
    return output;
  }
}
