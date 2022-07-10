public class GraphEx2 {

  private Map<GraphNode, List<GraphNode>> adjNodes; 

  void BFS(int key) {
    boolean visited[] = new boolean[adjNodes.size()];
    LinkedList<Integer> queue = new LinkedList<Integer>();

    visited[key]=true;
    queue.add(key);

    while (queue.size() != 0) {
      s = queue.poll();
      System.out.print(s+" ");

      List dataList = adjNodes.get(s);
      for (GraphNode n : dataList){
        if (!visited[n]) {
          visited[n.data] = true;
          queue.add(n.data);
        }
      }
    }

  }
}
