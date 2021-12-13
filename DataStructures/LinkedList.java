/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

import java.util.ArrayList;

/**
 *
 * @author singh
 */
public class LinkedList<E> {
    Node head;
    class Node<E> {
        E data;
        Node next;
        Node(E data) {
            this.data = data;
            next = null;
        }
    }
    public void Insert(E data)
    {
        Node toAdd =  new Node(data);
        if(head==null)
        {
            head = toAdd;
        }
        else
        {
            Node temp = head;
            while(temp.next!=null)
                temp = temp.next;
            temp.next =  toAdd;
        }
    }
    
    public void print() {
        if(head==null)
            System.out.println("List is empty");
        else
        {
            Node temp = head;
            while(temp!=null)
            {
                 System.out.println(temp.data);
                 temp = temp.next;
            }
        }
    }
    
    public void printReverse() {
        if(head==null)
            System.out.println("List is empty");
        else
        {
            Node temp = head;
            ArrayList<E> li = new ArrayList<>();
            while(temp!=null)
            {
                 li.add((E) temp.data);
                 temp = temp.next;
            }
            int len = li.size();
            for(int i = len-1;i>=0;i--)
                System.out.println(li.get(i));
        }
    }
}
