class Node {
    int data;
    Node next;


    static void insertAtBegin(Node head, int value) {
        Node temp = new Node();
        temp.data = value;

        temp.next = head;
        while(temp !=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    


    public static void main(String[] args) {
        Node n1 = new Node();
        n1.data = 10;
        n1.next = null;

        Node n2 = new Node();
        n2.data = 20;
        n2.next = null;

        n1.next = n2;

        Node n3 = new Node();
        n3.data = 30;
        n3.next = null;

        n2.next = n3;

        insertAtBegin(n1, 12);
        
    }
}