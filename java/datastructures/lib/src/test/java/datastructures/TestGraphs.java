package datastructures;

import datastructures.graphs.Graphs;
import datastructures.graphs.Vertex;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGraphs {

  @Test
  public void testNodeAddedToGraph()
  {
    Graphs<Integer> graph = new Graphs<>(9);
    Vertex<Integer> vertex = graph.addVertex(47);
    assertEquals(47, vertex.value);
  }

  @Test
  public void testEdgeAddedToGraph()
  {
    Graphs<Character> graph = new Graphs<>(9);
    Vertex<Character> V1 = graph.addVertex(',');
    Vertex<Character> V2 = graph.addVertex('.');
    graph.addEdge(V1, V2);
    assertEquals(1, graph.getNeighbors(V1).size());
    assertEquals(0, graph.getNeighbors(V2).size());
  }

  @Test
  public void testWithWeightBetweenNodes()
  {
    Graphs<String> graph = new Graphs<>(9);
    Vertex<String> V1 = graph.addVertex("Vertex Here");
    Vertex<String> V2 = graph.addVertex("Vertex Again");
    graph.addEdge(V1, V2, 9);
    assertEquals(9, graph.getNeighbors(V1).get(0).weight);
  }

  @Test
  public void testNumberOfVertices()
  {
    Graphs<Double> graph = new Graphs<>(9);
    Vertex<Double> V1 = graph.addVertex(25.22);
    Vertex<Double> V2 = graph.addVertex(27.11);
    Vertex<Double> V3 = graph.addVertex(22.34);
    Vertex<Double> V4 = graph.addVertex(21.44);
    LinkedList<Vertex<Double>> vertices = graph.getVertices();

    assertEquals(4, vertices.size());
  }

  @Test
  public void testProperSize()
  {
    Graphs<String> graph = new Graphs<>(9);
    Vertex<String> V1 = graph.addVertex("V1");
    Vertex<String> V2 = graph.addVertex("V2");
    Vertex<String> V3 = graph.addVertex("V3");
    Vertex<String> V4 = graph.addVertex("V4");
    assertEquals(4, graph.size());
  }
}
