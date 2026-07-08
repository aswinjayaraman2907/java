class node{
    int data;
    node next;


    node(int data){
        this.data=data;
    }
}
public class linkedlist {
    public static void main(String[] args){
    node head =new node(10);
    head.next =new  node(20);
    head.next.next = new node(30);
    head.next.next.next=new node(40);
    head.next.next.next.next=new node(50);
    head.next.next.next.next.next=new node(60);

    node temp = head;
    while (temp != null) {
        System.out.println(temp.data+"");
        temp=temp.next;
    }

    }
}
