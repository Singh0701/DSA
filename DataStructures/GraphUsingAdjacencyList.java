/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author singh
 */
public class GraphUsingAdjacencyList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer> > adj = new ArrayList<>(n);        
        for(int i = 0;i<n;i++)
            adj.add(new ArrayList<>());
        int edge = sc.nextInt();
        for(int i = 0;i<edge;i++)
        {
            addEdge(adj,sc.nextInt(),sc.nextInt());
        }
//        addEdge(adj, 0, 1);
//addEdge(adj, 0, 4);
//		addEdge(adj, 1, 2);
//		addEdge(adj, 1, 3);
//		addEdge(adj, 1, 4);
//		addEdge(adj, 2, 3);
//		addEdge(adj, 3, 4);
        for(int i = 0;i<adj.size();i++)
        {
            for(int j = 0;j<adj.get(i).size();j++)
            {
                System.out.print(adj.get(i).get(j));
            }
            System.out.println();
        }
    }
    
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int i,int j)
    {
        adj.get(i).add(j);
        adj.get(j).add(i);
    }
}