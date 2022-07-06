import com.sun.tools.javac.util.List;
import com.sun.xml.internal.xsom.impl.scd.Iterators.Map;

public class GraphEx1 {
  public static class GraphNode {
    public int data;

    GraphNode(int data) {
      this.data = data;
    }
  }

  class GraphWithAdjacencyList {
    private Map<GraphNode, List<GraphNode>> adjNodes;

    void addNode(int key) {
      adjNodes.put(key, null); // or replace null with the list this node is connected with
      return;
    }

    void removeNode(int key) {
      if (adjNodes.containsKey(key)) {
        adjNodes.remove(key);
        return;
      }
      System.out.print("Node does not exist.");
      return;
    }

    void addEdge(int node1, int node2){
        if (adjNodes.containsKey(node1) & adjNodes.containsKey(node2)){
          List node1data = adjNodes.get(node1);
          adjNodes.put(node1, node1data.add(node2));
          List node2data = adjNodes.get(node2);
          adjNodes.put(node2, node1data.add(node1));
        }
        else if (adjNodes.containsKey(node1)){
          List node1data = adjNodes.get(node1);
          adjNodes.put(node1, node1data.add(node2));
          List node2data = new ArrayList<GraphNode>();
          adjNodes.put(node2, node2data.add(node1));
        }
        else {
          List node2data = adjNodes.get(node2);
          adjNodes.put(node2, node2data.add(node1));
          List node1data = new ArrayList<GraphNode>();
          adjNodes.put(node1, node1data.add(node1));
        }
      }

    void removeEdge(int node1, int node2){
      if (adjNodes.containsKey(node1) & adjNodes.containsKey(node2)){
        // List node1data = adjNodes.get(node1);
        // adjNodes.put(node1, node1data.add(node2));
        // List node2data = adjNodes.get(node2);
        // adjNodes.put(node2, node1data.add(node1));
      }
      return;
    }
  }

}

// Implement the following methods for the GraphWithAdjacencyList class:
// void addNode(int key) : Adds a new node to the graph.
// void removeNode(int key): Removes the node from the graph.
// void addEdge(int node1, int node2): Adds an edge between node1 and node2
// void removeEdge(int node1, int node2): Removes an edge between node1 and
// node2.
// List<GraphNode> getAdjNodes(int key): Get nodes that are connected to the
// node represented by ‘key’.
