package DSA;

class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

public class SingleLinkedList
{
    Node head;


    SingleLinkedList() {
        head = null;
    }

    public void insertAtBeginning(int val) {
        Node Newnode = new Node(val);
        if (head == null) {//empty list
            head = Newnode;
        } else //some values inside
        {
            Newnode.next = head;
            head = Newnode;
        }
    }

    public void insertAtPos(int pos,int val){
        if(pos==0){
            insertAtBeginning(val);
            return;
        }
        Node Newnode = new Node(val);
        Node temp = head;
        for(int i=1;i<pos;i++)
        {
            temp = temp.next;
            if(temp==null) throw new IndexOutOfBoundsException("Invalid Position :"+pos);
        }
        Newnode.next = temp.next;
        temp.next = Newnode;

    }

    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }
    public void deleteAtPos(int pos){
        if(head==null){
            throw new IndexOutOfBoundsException("Deletion on empty List");
        }
        if(pos==0){
            deleteAtBeg();
            return;
        }
        Node temp = head;
        Node prev = null;
        for(int i = 1;i<=pos;i++){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;

    }

    public void deleteAtBeg(){
        if(head==null){
            throw new IndexOutOfBoundsException("Deletion on empty List");
        }
        head = head.next;
    }



    public void reverse(){
        Node prev = null;
        Node current = head;
        Node next = head.next;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public boolean Loop() {
        Node slow = head;
        Node fast = head;

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
