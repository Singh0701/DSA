/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

/**
 *
 * @author singh
 */
public class BinaryTree{
    Node head=null;

    boolean find(int i) {
        Node temp = head;
        if(head ==null)
            return false;
        else if(head.data==i)
            return true;
        return false;
    }
    class Node{
        Node left,right,parent;
        int data;
        Node(int data)
        {
            this.data=data;
            left=right=parent=null;
        }
    }
    
    public void insert(int data) {
        Node toAdd = new Node(data);
        Node temp = head;
        if(head==null)
        {
            head = toAdd;
//            System.out.println(head.data);
        }
        else
        { 
            temp = head;
            while(true)
            {
                if(temp.data == toAdd.data)
                    return;
                if(temp.data>toAdd.data)
                    if(temp.left==null)
                    {
                        temp.left = toAdd;
                        toAdd.parent = temp;
//                        System.out.println(toAdd.data);
                        return;
                    }
                    else
                    {
                        temp = temp.left;
                    }
                else if(temp.data<toAdd.data)
                    if(temp.right==null)
                    {
                        temp.right = toAdd;
                        toAdd.parent = temp;
//                        System.out.println(toAdd.data);
                        return;
                    }
                    else
                        temp = temp.right;          
            }
            
        }
    }
    
   public void print()
    {
        Node temp = head;
        if(temp==null)
            System.out.println("Empty Tree");
       else
        {
            System.out.println(head.data);
            if(head.left!=null)
                printR(head.left);
            if(head.right!=null)
                printR(head.right);
            
        }
    }
    
    public void printR(Node temp)
    {
         System.out.println(temp.data);
          if(temp.left!=null)
            printR(temp.left);
          if(temp.right!=null)
            printR(temp.right);
    }
    public void f(Node temp,int i)
    {
        if(i==temp.data)
         System.out.print(temp.data);
          if(temp.left!=null)
            printR(temp.left);
          if(temp.right!=null)
            printR(temp.right);
    }
}
