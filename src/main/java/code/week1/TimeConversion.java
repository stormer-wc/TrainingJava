package code.week1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    String converted = convertTime(str);
    System.out.println(converted);
  }

  static String convertTime(String str) {
    // Format of the date defined in the input String
    DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
    // Desired format: 24-hour format: Change the pattern as per the need
    DateFormat outputFormat = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
    Date date;
    String output = null;
    try {
      // Converting the input String to Date
      date = df.parse(str);
      // Changing the format of date and storing it in String
      output = outputFormat.format(date);
    } catch (ParseException pe) {
      pe.printStackTrace();
    }
    return output;
  }
}
