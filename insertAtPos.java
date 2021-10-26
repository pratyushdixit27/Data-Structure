class Node{
    int data;
    Node next;
    public static void insertAtPos(Node head, int value, int pos){
        int count = 1;
        Node temp = head;
        while(count < pos-1)
        {
    temp=temp.next;
    count ++;
        }   
        Node naya = new Node();
        naya.data = value;
        naya.next = temp.next;
        temp.next = naya;
        
        
    }

    public static void main(String[]args){
        Node n1 = new Node();
         Node n2 = new Node();
         Node n3 = new Node();
         Node n4 = new Node();
         Node n5 = new Node();

         n1.data = 10; n1.next = n2;
         n2.data = 20; n2.next = n3;
         n3.data = 30; n3.next = n4;
         n4.data = 40; n4.next = n5;
         n5.data = 50; n5.next = null;

    insertAtPos(n1, 15, 3);

    }
}