import java.util.*;
public class My_Graph_Directed {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        ArrayList<ArrayList> adj = new ArrayList<>();
        for(int i=0;i<V;i++)
            adj.add(new ArrayList<>());
        for(int i = 0;i<E;i++)
        {
            int u = sc.nextInt();
            int v = sc.nextInt();
            addEdge(adj,u,v);
        }
        for(int i = 0;i<V;i++)
        {
            System.out.println("Adjacent nodes of vertex = "+i);
            for(int j = 0;j<adj.get(i).size();j++)
            {
                System.out.println(adj.get(i).get(j));
            }
        }
        BFS_Traversal(adj,V,2);
    }
    public static void addEdge(ArrayList<ArrayList> adj, int u, int v)
    {
        adj.get(u).add(v);  //Directed graph
    }
    public static void BFS_Traversal(ArrayList<ArrayList> adj  , int V, int s)
    {
        System.out.println("BFS Traversal of graph: \n");
        boolean visited[] = new boolean[V];
        Arrays.fill(visited,false);
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(s);
        visited[s] = true;
        while(queue.size() != 0)
        {
            s = queue.poll();
            System.out.println(s);
            for(int i = 0;i<adj.get(s).size();i++)
            {
                int a = (int) adj.get(s).get(i);
                if(!visited[a]) {
                    queue.add(a);
                    visited[a] = true;
                }
            }
        }
    }
}
