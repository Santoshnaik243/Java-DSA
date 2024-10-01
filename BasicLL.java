import java.util.*;

public class BasicLL {


    public static void displayRe(Node head){
        if(head==null)return;
        displayRe(head.next);
        System.out.print(head.data+" >");   //reverse order
    
    }
    
    
    public static void displayR(Node head){
        if(head==null) return;
        System.out.print(head.data+" +");    //recursion
        displayR(head.next);
        System.out.println();
    }

    public static void display(Node head){
        Node temp=head;
        while(temp !=null){
            System.out.print(temp.data+" ");   //function
            temp=temp.next;
        }
        System.out.println();
    }
    public static void length(Node head){
        int count=0;
        while(head !=null){
            count++;
            head=head.next;
        }
        System.out.println(count);

    }
    public  static class Node{
        int data; //value
        Node next; //address of next node
        Node(int data){
            this.data=data;

        }

    }
    public static void main(String[] args) {
        Node a=new Node(3);
        System.out.println(a.next);
        Node b=new Node(5);
        Node c=new Node(9);
        Node d=new Node(8);
        Node e=new Node(16);

        a.next=b;  //3 -> 5
        b.next=c; // 3->5->9
        c.next=d; // 3->5->9->8
        d.next=e; //3->5->9->8->16

        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        System.out.println(a.next.next.next.data);
        System.out.println(a.next.next.next.next.data);

        Node temp=a;
       
       while(temp !=null){
        System.out.print(temp.data+"->"); //LinkedList Display Code
        temp=temp.next;
       }
       System.out.println();

        display(a);
        displayR(a);
        displayRe(a);
        //System.out.println(length(a));
        length(a);
        
    }
}
