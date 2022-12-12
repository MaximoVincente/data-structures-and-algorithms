package datastructures.graphs;



import java.util.*;

public class Graphs<T extends Comparable<? super T>> implements Comparable<Graphs<T>>
{
  public HashMap<Vertex<T>, LinkedList<Edge<T>>> adjacencyLists;
  private int numberOfVertices = 0;

  public Graphs(int maxNumberOfVertices)
  {
    adjacencyLists = new HashMap<>(maxNumberOfVertices);
  }

  public Vertex<T> addVertex(T value)  // addNode()
  {
    Vertex<T> vertex = new Vertex<>(value);
    adjacencyLists.put(vertex, new LinkedList<>());
    numberOfVertices++;
    return vertex;
  }

  public void addEdge(Vertex<T> start, Vertex<T> destination)
  {
    addEdge(start, destination, 0);
  }

  public void addEdge(Vertex<T> start, Vertex<T> destination, int weight)
  {
    adjacencyLists.get(start).add(new Edge<>(destination, weight));
  }

  public LinkedList<Vertex<T>> getVertices()  // getNodes()
  {
    return new LinkedList<>(adjacencyLists.keySet());
  }

  public LinkedList<Edge<T>> getNeighbors(Vertex<T> vertex)
  {
    return adjacencyLists.get(vertex);
  }

  public int size()
  {
    return numberOfVertices;
  }

  @Override
  public int compareTo(Graphs<T> o)
  {
    throw new UnsupportedOperationException("Graph does not implement compareTo()");
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    for (Vertex<T> vertex : adjacencyLists.keySet())
    {
      sb.append(vertex.value).append(" -> ");
      for (Edge<T> edge : adjacencyLists.get(vertex))
      {
        sb.append(edge.destination.value).append(" ");
      }
      sb.append(" ");
    }

    return sb.toString();
  }

}
