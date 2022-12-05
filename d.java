
import java.io.*;
import java.util.*;

public class d{
class node{
int data;
node prev;
node next;

public node(int data){
 this.data=data;
 this.next=null;
}
}
public node head=null;
public node tail=null;

 public void addNode(int data) {  
       
        node newn = new node(data);  
        if(head == null) {  
            head = tail = newn;  
            head.prev = null;  
            tail.next = null; 
        }  
        else {  
            
            tail.next = newn;  
            newn.prev = tail; 
            tail = newn;  
            tail.next = null;  
        }  
    }  
    public void addStart(int data) {  
        
    node newn = new node(data);  
     if(head == null) {  
        head = tail = newn;  
            head.prev = null; 
             tail.next = null;  
        }  
       
        else {  
         
            head.prev= newn;  
            newn.next = head;  
             newn.prev = null;  
             head = newn;  
        }  
    }  
  {
     }
public void addM(int data, int pr) {  
    int c=1;
    node newn = new node(data);  
    node current = head;  
    
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        } 
        if(pr==1){addStart(data);} 
      else  while(current != null) { 
        
            if(c==pr-1){
           // newn.data=pr;
           
    newn.next =current.next;

    
    current.next = newn;

    
    newn.prev = current;

   
    if (newn.next != null)
        newn.next.prev = newn;
        }  current=current.next;
        c++;
    }  
  }


     public void delete(int dl) {
       
        node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
           
        
        while(current != null) {  
            if(current.data==dl){
        
       
        if (head==null) {
            head = current.next;
        }
 
        if (current.next != null) {
            current.next.prev = current.prev;
        }
 
        if (current.prev != null) {
            current.prev.next = current.next;
        }
        }current=current.next;}
         current=null;
        
        System.out.println("deleted");
        return;
    } 
  
    
    public void display() {  
       
        node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
    }


    public static void main(String[] args)
    {
       d dll=new d();
       int ch=0;
       Scanner sc= new Scanner(System.in);
       while(ch!=4){
       System.out.println("\n\nMENU\n1)Add elements\n2)Delete elements\n3)Display\n4)Exit\nEnter your choice: "); 
       ch=sc.nextInt();
       switch(ch)
       {
        case 1: {
			  System.out.println("\n\n1. add at head\n2. add at tail\n3. add at any position\n enter: ");
                    int a=sc.nextInt();
                    System.out.println("Enter data to be added: ");
                    int da=sc.nextInt();
                    if(a==1)
                    { 
                      dll.addStart(da);
                    }
                    else if(a==2){
                    dll.addNode(da);}
                    else{
                    System.out.println("enter position: ");
                    int pr=sc.nextInt();
                    dll.addM(da,pr) ;
                    }
                    break;}
        case 2: {
                    System.out.println("Enter data to be deleted: ");
                    int dl=sc.nextInt();
                   // System.out.println(dl);
                    dll.delete(dl);
                    break;
                    }
        case 3: {
                    dll.display();
                    break;
                    }
        case 4: break;
        default: System.out.println("invalid choice.");break;
       }
     }
    }
   }                    
