class Node{
    int data; Node next;

    public static void deleteEnd(Node head){
        Node temp = head;
        Node temp1=null;
        while(temp.next != null){
            temp1=temp;
            temp=temp.next;
        }
        temp1.next= null;
        temp=null;
        while(head != null){
            System.out.println(head.data);
            head=head.next;

        }

    }
    
    public static void main(String[]args){
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();
        n1.data= 10; n1.next=n2;
        n2.data=20; n2.next=n3;
        n3.data=30; n3.next=n4;
        n4.data=40; n4.next=null;

        deleteEnd(n1);

    }
}