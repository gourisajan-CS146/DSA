public class PrimAlgorithm{
 static class GraphEdge {
        int destVetex,;
       int weight;

        GrapghEdge(int destVetex, int weight) {
            this.destVetex = destVetex;
            this.weight = weight;
        }
    }

 static class Node implements Comparable<Node> {
        int vertex, cost;

        Node(int vertex, int cost) {
            this.vertex = vertex;
            this.cost = cost;
        }

        public int compareTo(Node other) {
            return this.cost - other.cost;
        }
    }

static final int V = 9;//no of vertices 
  public static findMinimumWeightedEdge(int[] key,boolean[] inMST){
    int min = Integer.MAX_VALUE;
    int minIndex = -1;
    for (int i = 0; i < V; i++) {
            if (!inMST[i] && key[i] < min) {
                min = key[i];
                minIndex = i;
            }
        }
        return minIndex;
  }

  
}
