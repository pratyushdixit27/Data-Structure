// INSERT THE NODE IN MIDDLE USING TORTOISE AND
 
    class Node {
        int data;
        Node next;


        static void atMiddle(Node head){
                Node naya = new Node();
                naya.data = 15;
            Node temp = head;
            Node slow = temp;
            Node temp1 = null;
            Node fast = temp;

            while(fast!=null && fast.next!=null){
                temp1=slow;
                slow = slow.next;
                fast = fast.next.next;
            }
           naya.next=slow;
            temp1.next=naya;


        }
        static void traverse(Node head){
            Node temp3= head;
            while(temp3 != null){
                System.out.println(temp3.data);
                temp3 = temp3.next;
            }
        }






        public static void main(String[] args) {
            Node n1 = new Node();
            Node n2 = new Node();
            Node n3 = new Node();
            Node n4 = new Node();
Node head= n1;
            n1.data=10;
            n2.data=20;
           n3.data=30;
            n4.data=40;

            n1.next=n2;
            n2.next=n3;
            n3.next=n4;
            n4.next=null;

            atMiddle(head);
            traverse(head);

        }


    }
