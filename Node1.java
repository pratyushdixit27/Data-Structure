public class Node1 {    //Basic Program of Linked List
    int data;
    Node next;

public static void Traverse(Node head) {
    Node temp = head;
    while (temp != null) {
        System.out.println(temp.data);
        temp = temp.next;

    }
}


    public static void main(String[] args) {
        Node n1= new Node();
        Node n2=new Node();
        Node n3=new Node();
        Node n4= new Node();

        Node head = n1;
        n1.data=10;
        n1.next=n2;
        n2.data=20;
        n2.next=n3;
        n3.data=30;
        n3.next=n4;
        n4.data=50;
        n4.next=null;

        Traverse(head);
    }
}
