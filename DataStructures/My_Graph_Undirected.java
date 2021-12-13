import java.util.*;
public class My_Graph_Undirected {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        ArrayList<ArrayList> G = new ArrayList<>();
        for(int i = 0;i<V;i++)
        {
            G.add(new ArrayList<Integer>());
        }
        int E = sc.nextInt();
        for(int i = 0;i<E;i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            addEdge(G,u,v);
        }
        for(int i = 0;i<V;i++)
        {
            System.out.println("Adjacent nodes of Vertex = "+i);
            for(int j = 0;j<G.get(i).size();j++)
            {
                System.out.println(G.get(i).get(j));
            }
        }
DFS_Traversal(G,V,0);
        BFS_Traversal(G,V,0);
    }
    public static void addEdge(ArrayList<ArrayList> G, int u, int v)
    {
        G.get(u).add(v);
        G.get(v).add(u); //Unidrected Graph
    }

    public static void DFS_Traversal(ArrayList<ArrayList> G, int V, int s)
    {
        boolean visited[] = new boolean[V];
        Arrays.fill(visited, false);
        Stack<Integer> st = new Stack<>();
        st.push(s);
        System.out.println();
        while(!st.isEmpty())
        {
            s = st.peek();
            st.pop();
            if(visited[s] == false)
            {
                System.out.println(s+" ");
                visited[s] = true;
            }
            for(int i = 0;i<G.get(s).size();i++)
            {
                int a = (int) G.get(s).get(i);
                if(!visited[a])
                {
                    st.push(a);
                }
            }
        }
    }

















    public static void BFS_Traversal(ArrayList<ArrayList> adj, int V, int s) {
        System.out.println("BFS Traversal of graph: \n");
        boolean[] visited = new boolean[V];
        Arrays.fill(visited, false);
        LinkedList<Integer> queue = new LinkedList();
        queue.add(s);
        visited[s] = true;

        while(queue.size() != 0) {
            s = (Integer)queue.poll();
            System.out.println(s);

            for(int i = 0; i < ((ArrayList)adj.get(s)).size(); ++i) {
                int a = (Integer)((ArrayList)adj.get(s)).get(i);
                if (!visited[a]) {
                    queue.add(a);
                    visited[a] = true;
                }
            }
        }

    }
}
