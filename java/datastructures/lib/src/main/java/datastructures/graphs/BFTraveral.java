package datastructures.graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class BFTraveral {

  private int V;
  private LinkedList<Integer> adj[];

  public BFTraveral(int numOfVertices) {
    V = numOfVertices;
    adj = new LinkedList[numOfVertices];
    for (int i=0; i<numOfVertices; ++i)
      adj[i] = new LinkedList();
  }

  public void addEdge(int vert, int weig)
  {
    adj[vert].add(weig);
  }

 public void BFS(int s) {

    boolean visited[] = new boolean[V];

    LinkedList<Integer> queue = new LinkedList<Integer>();

    visited[s] = true;
    queue.add(s);

    while (queue.size() != 0) {
      s = queue.poll();

      Iterator<Integer> i = adj[s].listIterator();
      while (i.hasNext()) {
        int n = i.next();
        if (!visited[n]) {
          visited[n] = true;
          queue.add(n);
        }
      }
    }
  }
}
