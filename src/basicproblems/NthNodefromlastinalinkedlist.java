package basicproblems;

public class NthNodefromlastinalinkedlist {
    class Node{
        int data;
        Node next;

        Node(int val){
            data=val;
            next=null;
        }

    }
    Node head;
    NthNodefromlastinalinkedlist(){
        head = null;
    }

    public void Insert(int val){
        Node node = new Node(val);
        if(head==null){
            head = node;
        }
        else{
            node.next = head;
            head=node;
        }

    }

    public int nthelement(int n){
        Node temp1 = head;
        Node temp2 = head;

        while(temp2!=null){
            if(n==0) break;
            temp2=temp2.next;
            n--;
        }

        if(n>0) return -1;

        while(temp2!=null){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1.data;
    }

    public static void main(String[] args) {
        NthNodefromlastinalinkedlist test = new NthNodefromlastinalinkedlist();

        test.Insert(5);
        test.Insert(8);
        test.Insert(6);
        test.Insert(2);
        test.Insert(3);


        int r = test.nthelement(3);
        System.out.println(r);
    }
}
