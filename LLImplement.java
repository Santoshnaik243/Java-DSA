public class LLImplement {

    
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }


    }
    public static class linkedList{
        Node head=null;
        Node tail=null;
        void addLast(int val){
            Node newNode=new Node(val);
            if(head==null){
                head=newNode;
                tail=newNode; 
            }
            tail.next=newNode;
            tail=newNode;

        }
        void addFirst(int val){
            Node newNode=new Node(val);
 
        }
        void display(){
            Node temp=head;
            while(temp !=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {
        linkedList ll=new linkedList();
        ll.addFirst(2);
        ll.addFirst(4);
        ll.display();
        
    }
    
    
}
