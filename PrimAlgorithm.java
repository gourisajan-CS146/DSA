public class PrimAlgorithm{
 static class GraphEdge {
        int destVertex,;
       int weight;

        GrapghEdge(int destVertex, int weight) {
            this.destVertex = destVertex;
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
public static void primMST(List<List<Edge>> adjList, int startVertex, char[] labels) {

    int numberOfVertices = adjList.size();

    // array to store minimum cost to connect vertex v to MST
    int[] minCostToConnect = new int[numberOfVertices];

    //  which vertex added v into MST
    int[] parentOfVertex = new int[numberOfVertices];

  // isInMST[v] = true if vertex v is already included in MST
    boolean[] isInMST = new boolean[numberOfVertices];

    // Step 1: Initialize all vertices
  for (int i = 0; i < numberOfVertices; i++) {
    minCostToConnect[i] = Integer.MAX_VALUE; // set all costs to infinity
    parentOfVertex[i] = -1;                  // no parent initially
    isInMST[i] = false;                     // not included in MST yet
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
