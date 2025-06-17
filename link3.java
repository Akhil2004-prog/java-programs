class Node{
    int data;
    Node next;
    Node(int n){
        this.data=n;
        this.next=null;
    }
}
class linkedlist{
    Node head=null;
    void add(int n){
        Node newnode=new Node(n);
        if(head==null){
            head=newnode;
        }
        else{
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
             curr.next=newnode;
        }
        
    }
    void addf(int n){
        Node newnode=new Node(n);
        newnode.next=head;
        this.head=newnode;
        
    }
void display()
{
    Node curr=head;
    while(curr!=null){
        System.out.println(curr.data);
        curr=curr.next;
    }
}
}
public class link3{
    public static void main(String[] args){
        linkedlist l=new linkedlist();
        l.add(4);
        l.add(5);
        l.add(6);
        l.addf(7);
        l.addf(8);
        l.display();
        
    }
}