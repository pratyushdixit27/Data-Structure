class Node{

    int data; Node next;

    public static void insertAtPos(Node head, int value, int pos){
        Node temp = head;
        int count = 1;
        while(count < pos-1){
            temp = temp.next;
           count = count +1;
        }

        Node naya = new Node();
        naya.data =  value;
        naya.next = temp.next;
        temp.next = naya;
    }

    //traverse

    public static void traverse(Node head){
        Node temp1 = head;
        while(temp1 != null){

            System.out.println(temp1.data);
            temp1 = temp1.next;

        }
    }
    public static void main(String[]args){
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();
        Node n5 = new Node();
        n1.data= 10; n1.next = n2;
        n2.data= 20; n2.next = n3;
        n3.data= 30; n3.next = n4;
        n4.data= 40; n4.next = n5;
        n5.data=50; n5.next =null;

        insertAtPos(n1, 25, 3);
        traverse(n1);
    }
}