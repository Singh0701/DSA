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
public class DoublyLinkedList<E>{
    Node head = null;
   class Node<E>{
    E data;
    Node next,prev;
    Node(E data) {
        this.data = data;
        next=prev=null;
    }
  }
   public void Insert(E data) {
       Node toAdd = new Node(data);
       Node temp=head;
       if(head==null)
       {
           head = toAdd;
       }
       else
       {
           while(temp.next!=null)
           {
               temp=temp.next;
           }
           temp.next = toAdd;
//           System.out.println(temp.next.data);
           toAdd.prev = temp;
//           System.out.println(toAdd.prev.data);
       }
   }
   public void print() {
       Node temp = head;
       if(head == null)
       {
           System.out.println("List is empty");
       }
       else
       {
           while(temp!=null)
           {
               System.out.println(temp.data);
               temp = temp.next;
           }
       }
   }
       public void printReverse() {
       Node temp = head;
       if(head == null)
       {
           System.out.println("List is empty");
       }
       else
       {
           while(temp.next!=null)
           {
               temp=temp.next;
           }
           while(temp!=null)
           {
               System.out.println(temp.data);
               temp=temp.prev;
           }
       }
   }
}
