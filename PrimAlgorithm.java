import java.util.*;
public class PrimAlgorithm{
 static class GraphEdge {
        int destVertex,;
       int weight;

        GraphEdge(int destVertex, int weight) {
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


   // Step 2: Create a min-heap (priority queue)
    // This helps us always pick the vertex with smallest  as stored in ascending order so we get minimum element when polled
    PriorityQueue<Node> minHeap = new PriorityQueue<>();

    // Step 3: Start from given starting vertex
    minCostToConnect[startVertex] = 0;
    minHeap.add(new Node(startVertex, 0));
 // Step 4: Process vertices until heap is empty
    while (!minHeap.isEmpty()){
    Node currentNode =  minHeap.poll();
     int currentVertex = currentNode.vertex;
     // If this vertex is not yet in MST, include it
     if (!isInMST[currentVertex]) {
         isInMST[currentVertex] = true;
     } else {
         continue;
     }
 // Step 5: Check all neighbors
        for (GrapghEdge edge : adjList.get(currentVertex)) {

            int neighbor = edge.destVertex;
            int weight = edge.weight;

            // If neighbor not in MST and found smaller edge
            if (!inMST[neighbor] && weight < key[neighbor]) {

                key[neighbor] = weight;         // update cost
                parent[neighbor] = currentVertex; // update parent

                // add to heap
                minHeap.add(new Node(neighbor, weight));
            }
        }
    }

 // Step 6: Print MST
    int totalWeight = 0;
    System.out.println("Edges in MST:");

    for (int i = 0; i < numberOfVertices; i++) {
        if (parent[i] != -1) {
            System.out.println(labels[parent[i]] + " - " + labels[i] + " : " + key[i]);
            totalWeight += key[i];
        }
    }

    System.out.println("Total Weight = " + totalWeight);


    } 

// Method to add an edge in an undirected graph
public static void addEdge(List<List<GraphEdge>> adjList, int fromVertex, int destVertex, int weight) {

    // Add edge from fromVertex to destVertex
    adjList.get(fromVertex).add(new GraphEdge(destVertex, weight));

    // Since graph is undirected, also add reverse edge
    adjList.get(destVertex).add(new GraphEdge(fromVertex, weight));
}

  
}
