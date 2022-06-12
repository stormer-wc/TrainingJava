package code.dts.graphs;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {

  int numberOfNodes;
  HashMap<Integer, ArrayList<Integer>> adjacentList;

  public Graph() {
    this.numberOfNodes = 0;
    this.adjacentList = new HashMap<>();
  }

  private void addVertex(int node) {
    adjacentList.put(node, new ArrayList<>());
    numberOfNodes++;
  }

  private void addEdge(int node1, int node2) {
    adjacentList.get(node1).add(node2);
    adjacentList.get(node2).add(node1);
  }

  private void showConnections() {
    Object[] keys = adjacentList.keySet().toArray();
    for (Object key : keys) {
      System.out.println(key + " ---> " + adjacentList.get(Integer.parseInt(key.toString())));
    }
  }

  public static void main(String[] args) {
    Graph myGraph = new Graph();
    myGraph.addVertex(0);
    myGraph.addVertex(1);
    myGraph.addVertex(2);
    myGraph.addVertex(3);
    myGraph.addVertex(4);
    myGraph.addVertex(5);
    myGraph.addVertex(6);
    myGraph.addEdge(3, 1);
    myGraph.addEdge(3, 4);
    myGraph.addEdge(4, 2);
    myGraph.addEdge(4, 5);
    myGraph.addEdge(1, 2);
    myGraph.addEdge(1, 0);
    myGraph.addEdge(0, 2);
    myGraph.addEdge(6, 5);
    myGraph.showConnections();
  }
}
