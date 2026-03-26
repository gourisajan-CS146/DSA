public class PrimAlgorithm{

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
