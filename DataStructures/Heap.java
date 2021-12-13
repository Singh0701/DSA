/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;
import java.util.*;

/**
 *
 * @author singh
 */
public class Heap {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    size++;
    int[] arr = new int[size];
    for(int i=1;i<size;i++)
    arr[i] = sc.nextInt();
    System.out.println("############--------------MAX HEAP------------##############");
    for(int i = size/2-1;i>0;i--)
    {
              Maxheapify(arr,i,size);
    }
    for(int i = 1;i<size;i++)
    {
        System.out.println("Arr["+i+"]"+arr[i]);
    }
    System.out.println("\n\n\n\n############---------MIN HEAP----------##############");
    for(int i = size/2-1;i>0;i--)
    {
              Minheapify(arr,i,size);
    }
    for(int i = 1;i<size;i++)
    {
        System.out.println("Arr["+i+"]"+arr[i]);
    }
  }
    public static void Maxheapify(int[] arr, int root,int len)
    {
        int il = root*2;
        int ir = root*2+1;
        if(ir>len)
        {
            if(arr[il]>arr[root])
            {
                int temp = arr[il];
                arr[il] = arr[root];
                arr[root] = temp;
            }
        }
        else
        {
            if(arr[il]>arr[root])
            {
                int temp = arr[il];
                arr[il] = arr[root];
                arr[root] = temp;
            }
            if(arr[ir]>arr[root])
            {
                int temp = arr[ir];
                arr[ir] = arr[root];
                arr[root] = temp;
            }
        }
    }
    
    public static void Minheapify(int[] arr, int root,int len)
    {
        int il = root*2;
        int ir = root*2+1;
        if(ir>len)
        {
            if(arr[il]<arr[root])
            {
                int temp = arr[il];
                arr[il] = arr[root];
                arr[root] = temp;
            }
        }
        else
        {
            if(arr[il]<arr[root])
            {
                int temp = arr[il];
                arr[il] = arr[root];
                arr[root] = temp;
            }
            if(arr[ir]<arr[root])
            {
                int temp = arr[ir];
                arr[ir] = arr[root];
                arr[root] = temp;
            }
        }
    }
}



