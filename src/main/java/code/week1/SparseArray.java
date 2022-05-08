package code.week1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class SparseArray {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter =
        new BufferedWriter(
            new FileWriter(
                "/Users/stormer/IdeaProjects/Java/interview_train/src/main/resources/output/SparseArray.txt"));

    int stringsCount = Integer.parseInt(bufferedReader.readLine().trim());

    List<String> strings =
        IntStream.range(0, stringsCount)
            .mapToObj(
                i -> {
                  try {
                    return bufferedReader.readLine();
                  } catch (IOException ex) {
                    throw new RuntimeException(ex);
                  }
                })
            .collect(toList());

    int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

    List<String> queries =
        IntStream.range(0, queriesCount)
            .mapToObj(
                i -> {
                  try {
                    return bufferedReader.readLine();
                  } catch (IOException ex) {
                    throw new RuntimeException(ex);
                  }
                })
            .collect(toList());

    List<Integer> res = matchingStrings(strings, queries);

    bufferedWriter.write(res.stream().map(Object::toString).collect(joining("\n")) + "\n");

    bufferedReader.close();
    bufferedWriter.close();
  }

  public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
    int[] counter = new int[queries.size()];
    int index = 0;
    for (String q : queries) {
      for (String string : strings) {
        if (q.equals(string)) {
          counter[index]++;
        }
      }
      index++;
    }
    // print all data
    for (int c : counter) {
      System.out.println(c);
    }
    // add array to result list
    List<Integer> result = new ArrayList<>();
    for (int c : counter) {
      result.add(c);
    }
    return result;
  }
}
