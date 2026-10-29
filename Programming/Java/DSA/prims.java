
import java.util.Scanner;

public class prims {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();

        int[][] graph = new int[V][V];

        System.out.println("Enter adjacency matrix:");

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter source vertex: ");
        int S = sc.nextInt();

        boolean[] visited = new boolean[V];
        int[] parent = new int[V];
        int totalCost = 0;

        visited[S] = true;
        parent[S] = -1;

        System.out.println("Edges in Minimum Spanning Tree:");

        for (int count = 0; count < V - 1; count++) {

            int min = Integer.MAX_VALUE;
            int u = -1;
            int v = -1;

            for (int i = 0; i < V; i++) {
                if (visited[i]) {
                    for (int j = 0; j < V; j++) {
                        if (!visited[j] && graph[i][j] != 0
                                && graph[i][j] < min) {
                            min = graph[i][j];
                            u = i;
                            v = j;
                        }
                    }
                }
            }

            if (u == -1) {
                System.out.println("Graph is disconnected!");
                return;
            }

            visited[v] = true;
            parent[v] = u;
            totalCost += min;

            System.out.println(u + " - " + v + " : " + min);
        }

        System.out.println("Total cost of MST: " + totalCost);

        sc.close();
    }
}
