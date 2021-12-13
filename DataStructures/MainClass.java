/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

import DataStructures.GraphUsingAdjacencyList.node;
import java.util.Scanner;

/**
 *
 * @author singh
 */
public class MainClass {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        GraphUsingAdjacencyList gp = new GraphUsingAdjacencyList();
        for(int i = 0;i<n;i++)
        {
            gp.addEdge(i, i);
        }
//        LinkedList<Integer> l = new LinkedList<Integer>();
//        for(int i=0;i<100;i++)
//        {
//            i++;
//            l.Insert(i);
//        }
//        
////        l.printReverse();
//        l.print();
//        l.printReverse();
        
//        BinaryTree t = new BinaryTree();
//        
//
//        int a = 1;
//        for(int i = 1;i<11;i++)
//        {
//            t.insert(i);
//           t.insert(i);
//
//        }
//        
////        
//        t.print();
//        
        
//        long start = System.currentTimeMillis();
//        for(int i = 559;i>0;i--)
//            t.find(i);
//        long end = System.currentTimeMillis();
//        t.print();
//        System.out.println(end-start);
    }
}
