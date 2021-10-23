//Insert at End and print the elements

class Node{
    int data; Node next;

    static void insertAtEnd(Node head, int value){
        Node temp = head;
        Node n3=new Node();
        n3.data=value;
        while(temp.next!=null){
            temp=temp.next;

        }
        temp.next=n3;
    }

public static void traverse(Node head){
        Node temp1 = head;
        while(temp1 != null){
            System.out.println(temp1.data);
           temp1 = temp1.next;
        }

}

    public static void main(String[]args){
        Node n1=new Node();
        Node n2 = new Node();
        Node head = n1;
        n1.data=10;
        n1.next=n2;
        n2.data=20;
        n2.next=null;
        insertAtEnd(head, 30);

        traverse(head);
    }
}