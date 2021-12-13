import java.util.*;

public class BFS_Graph {
    private LinkedList<Integer> adj[];

    public BFS_Graph(int v) {
    }

    public void BFS_Graph(int v) {
        adj = new LinkedList[v];
        for(int i = 0;i<v;i++)
        {
            adj[i] = new LinkedList<>();
        }
    }
    public  void addEdge(int source, int destination) {
        adj[source].add(destination);
        adj[destination].add(source); //Undirected Graph
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        BFS_Graph g = new BFS_Graph(v);
        for(int i = 0;i<e;i++)
        {
            int source = sc.nextInt();
            int destination = sc.nextInt();
            g.addEdge(source,destination);
        }

    }
}
