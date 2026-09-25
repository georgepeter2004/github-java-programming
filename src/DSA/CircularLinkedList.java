package DSA;

public class CircularLinkedList<T> {

    class Node{
        T data;
        Node next;
        Node(T val){
            data = val;
            next = null;
        }
    }
    Node last;

    CircularLinkedList(){
        last = null;
    }

    public void insertAtBeginning(T val){
        Node Newnode = new Node(val);
        if(last==null){
            Newnode.next = Newnode;
            last = Newnode;
        }
        else{
            Newnode.next = last.next;
            last.next = Newnode;
        }
    }

    public void insertAtEnd(T val){
        Node Newnode = new Node(val);
        if(last==null){
            Newnode.next = Newnode;
            last = Newnode;
        }
        else{
            Newnode.next = last.next;
            last.next = Newnode;
            last = Newnode;
        }
    }

    public void deleteAtBeginning(){
        if(last==last.next){
            last=null;
            return;
        }
        else{
            last.next=last.next.next;
        }
    }

    public void deleteAtEnd(){
        if(last.next==last){
            last = null;
        }
        else{
            Node temp = last.next;
            while(temp.next!=last){
                temp=temp.next;
            }
            temp.next = last.next;
             last = temp ;
        }
    }
    public void Display(){
        if(last==null){
            System.out.println("List is Empty");
            return;
        }
        Node temp = last.next;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
        }while(temp != last.next );
    }

    public boolean Loop() {
        Node slow = last.next;
        Node fast = last.next;

        while(slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;

    }

}
