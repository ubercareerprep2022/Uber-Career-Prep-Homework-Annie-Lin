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
      GraphNode node = new GraphNode(key);
      adjNodes.put(node, null); // or replace null with the list this node is connected with
      return;
    }
  
    void removeNode(int key) {
      GraphNode node = new GraphNode(key);
      if (adjNodes.containsKey(node)) {
        adjNodes.remove(node);
        return;
      }
      System.out.print("Node does not exist.");
      return;
    }
  
    void addEdge(int node1, int node2){
      GraphNode gNode1 = new GraphNode(node1);
      GraphNode gNode2 = new GraphNode(node2);

      if (adjNodes.containsKey(gNode1) & adjNodes.containsKey(gNode2)){
        List node1data = adjNodes.get(gNode1);
        adjNodes.put(gNode1, node1data.add(gNode2));
        List node2data = adjNodes.get(gNode2);
        adjNodes.put(gNode2, node1data.add(gNode1));
      }
      else if (adjNodes.containsKey(gNode1)){
        List node1data = adjNodes.get(gNode1);
        adjNodes.put(gNode1, node1data.add(gNode2));
        List node2data = new ArrayList<GraphNode>();
        adjNodes.put(gNode2, node2data.add(gNode1));
      }
      else {
        List node2data = adjNodes.get(gNode2);
        adjNodes.put(gNode2, node2data.add(gNode1));
        List node1data = new ArrayList<GraphNode>();
        adjNodes.put(gNode1, node1data.add(node1));
      }
      }
  
    void removeEdge(int node1, int node2){
      GraphNode gNode1 = new GraphNode(node1);
      GraphNode gNode2 = new GraphNode(node2);

      if (adjNodes.containsKey(gNode1) & adjNodes.containsKey(gNode2)){
        List node1data = adjNodes.get(gNode1);
        for (GraphNode n : node1data){
          if (n.data == gNode2.data){
            Integer val = n.data; 
            // reference: https://ourtechroom.com/tech/insert-vertical-line-vs-code/
            node1data.remove(val); 
            // is list.remove used correctly?
            // how can we deal with the situation if there is another node that 
            // contains the same value
          }
        }
      }
      return;
    }

    // Get nodes that are connected to the node represented by ‘key’.
    List<GraphNode> getAdjNodes(int key){
      GraphNode node = new GraphNode(key);
      if (adjNodes.containsKey(node.data)){
        return adjNodes.get(node.data);
      }
      return null;
    } 
  }
  
}
