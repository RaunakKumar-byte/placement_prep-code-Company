public class addf {


    public static class Node{

        int data;
        Node next;


        public Node(int data){

            this.data=data;
            this.next=null;
        }
    }


    public static class LinkedList{

        public static Node head;
        public static Node tail;
        public static int size;


        public void addFirst(int data){

            Node newNode=new Node(data);
            size++;


            if(head==null){

                head=tail=newNode;
                return;
            }


            newNode.next=head;
            head=newNode;

        }



        public void addLast(int data){

            Node newNode=new Node(data);
            size++;


            if(head==null){

                head=tail=newNode;
                return;
            }


            tail.next=newNode;
            tail=newNode;

        }



        public void printll(){

            if(head==null){

                System.out.println("LL is empty");
                return;
            }


            Node temp=head;


            while(temp!=null){

                System.out.print(temp.data+"-->");

                temp=temp.next;
            }


            System.out.println("null");

        }


        public void add_in_middle(int data, int idx){
            if(idx==0){
                addFirst(data);
                return;
            }
            Node newNode=new Node(data);
            size++;
            Node temp=head;
            int i=0;
            while(i<idx-1){
                temp=temp.next;
                i++;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }


        public int remove_f(){
            if(size==0){
                System.out.println("ll is emptyt");
                return Integer.MIN_VALUE;
            }else if(size==1){
                int val=head.data;
                head=tail=null;
                return val;
            }

            int val=head.data;
            head=head.next;
            size--;
            return val;

        
        }

        public int remove_l(){
            if(size==0){
                System.out.println("LL is Empty");
                return Integer.MIN_VALUE;
            }else if(size==1){
                int val=head.data;
                head=tail=null;
                size=0;
                return val;
            }


            Node prev=head;
            for(int i=0;i<size-2;i++){
                prev=prev.next;

            }
            int val=prev.next.data;
            prev.next=null;
            tail=prev;
            size--;
            return val;

        }


        public int iterative_search(int key){
            Node temp=head;
            for(int i=0;i<size;i++){
                if(temp.data==key){
                    return i;
                }
                temp=temp.next;

            }
            return -1;
        }

         public void reverseList(ListNode head) {
        Node prev=null;
        Node curr=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        
    }

       public void removeNthFromEnd(Node head, int n) {
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(n==size){
            head=head.next;
            return ;
        }
        Node prev=head;
        for(int i=1;i<size-n;i++){
            prev=prev.next;

        }
        prev.next=prev.next.next;
        return ;
    }

     public boolean isPalindrome(ListNode head) {
        
        ListNode mid=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            mid=mid.next;
            fast=fast.next.next;

        }
        ListNode prev=null;
        ListNode curr=mid;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
       ListNode left=head;
       ListNode right=prev;

       while(right!=null){
        if(left.val!=right.val){
            return false;
        }
        left=left.next;
        right=right.next;
       }
       return true;
    }



      public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    }
     


    public static void main(String[] args){


        LinkedList ll=new LinkedList();


        ll.printll();


        ll.addFirst(2);
        ll.printll();


        ll.addFirst(1);
        ll.printll();


        ll.addLast(3);
        ll.printll();


        ll.addLast(5);
        ll.printll();
       ll.add_in_middle(4,3); 
               ll.printll();
System.out.println(ll.size);

ll.remove_f();
ll.printll();
  System.out.println(ll.iterative_search(3));

    }
}