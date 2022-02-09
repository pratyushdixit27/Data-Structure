//Deletion at the begin
public class Del_LL1 {
    public static class Node{
        int data;
        Node next;
    }
public static void deleteAtBegin(Node head){
        Node temp=head;
        head= temp.next;
        temp.next=null;
        temp=null;
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
}

    public static void main(String[] args) {
        Node n1=new Node();
        Node n2=new Node();
        Node n3=new Node();

        deleteAtBegin(n1);
    }
}
