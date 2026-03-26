import java.util.*;
public class PrimAlgorithm{
 static class GraphEdge {
   int destVertex;
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
public static void executeAndPrintPrimMST(List<List<GraphEdge>> adjList, int startVertex, char[] labels) {

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
        for (GraphEdge edge : adjList.get(currentVertex)) {

            int neighbor = edge.destVertex;
            int weight = edge.weight;

            // If neighbor not in MST and found smaller edge
            if (!isInMST[neighbor] && weight < minCostToConnect[neighbor]) {

                minCostToConnect[neighbor] = weight;         // update cost
                parentOfVertex[neighbor] = currentVertex; // update parent

                // add to heap
                minHeap.add(new Node(neighbor, weight));
            }
        }
    }

 // Step 6: Print MST
    int totalWeight = 0;
    System.out.println("Edges in MST:");

    for (int i = 0; i < numberOfVertices; i++) {
        if (parentOfVertex[i] != -1) {
            System.out.println(labels[parentOfVertex[i]] + " - " + labels[i] + " : " + minCostToConnect[i]);
            totalWeight += minCostToConnect[i];
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
public static void main(String[] args) {

    int numberOfVertices = 9;

    // Labels for printing vertex names
    char[] graphLabels = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};

    
   // Create sample graph
    List<List<GraphEdge>> adjacencyList = createSampleGraph(numberOfVertices);

    // Run Prim's Algorithm starting from vertex 0 (a)
    executeAndPrintPrimMST(adjacencyList, 0, graphLabels);
}
  // Helper method to create and returns the sample graph
public static List<List<GraphEdge>> createSampleGraph(int numberOfVertices) {

    // Create adjacency list
    List<List<GraphEdge>> adjacencyList = new ArrayList<>();

    // Initialize an empty list for each vertex
    for (int i = 0; i < numberOfVertices; i++) {
        adjacencyList.add(new ArrayList<>());
    }

    // Add edges from the sample graph
    addEdge(adjacencyList, 0, 1, 4);   // a - b
    addEdge(adjacencyList, 0, 7, 8);   // a - h
    addEdge(adjacencyList, 1, 2, 8);   // b - c
    addEdge(adjacencyList, 1, 7, 11);  // b - h
    addEdge(adjacencyList, 2, 3, 7);   // c - d
    addEdge(adjacencyList, 2, 5, 4);   // c - f
    addEdge(adjacencyList, 2, 8, 2);   // c - i
    addEdge(adjacencyList, 3, 4, 9);   // d - e
    addEdge(adjacencyList, 3, 5, 14);  // d - f
    addEdge(adjacencyList, 4, 5, 10);  // e - f
    addEdge(adjacencyList, 5, 6, 2);   // f - g
    addEdge(adjacencyList, 6, 7, 1);   // g - h
    addEdge(adjacencyList, 6, 8, 6);   // g - i
    addEdge(adjacencyList, 7, 8, 7);   // h - i

    return adjacencyList;
}
}
