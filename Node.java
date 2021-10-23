public class Node {    //Basic Program of Linked List
    int data;
    Node next;

    Node(int data){
        this.data=data;
        System.out.println(data);
    }


    public static void main(String[] args) {
        Node n1= new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        Node n4= new Node(40);

        Node head = n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=null;
    }
}
