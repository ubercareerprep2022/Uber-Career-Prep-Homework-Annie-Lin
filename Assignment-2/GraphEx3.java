public class GraphEx3 {

  private Map<GraphNode, List<GraphNode>> adjNodes; 

  void DFSHelper(int key, boolean visited[]){
    visited[key] = true;
    System.out.print(node + " ");

    List dataList = adjNodes.get(key);
    for (GraphNode n : dataList){
      if (!visited[n.data]) DFSHelper(n.data, visited);
    }
  }

  void DFS(int key){
    boolean visited[] = new boolean[adjNodes.size()];
    DFSHelper(key, visited);
  }
}
