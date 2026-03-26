public class PrimAlgorithm{
 static class GraphEdge {
        int destVetex,;
       int weight;

        GrapghEdge(int destVetex, int weight) {
            this.destVetex = destVetex;
            this.weight = weight;
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
