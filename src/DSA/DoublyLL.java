package DSA;


class Node3 {
    int data;
    Node3 next;
    Node3 prev;

    Node3(int val) {
        data = val;
        next = null;
        prev = null;
    }
}

public class DoublyLL
{
    Node3 head;
    Node3 tail;


    DoublyLL() {
        head = null;
        tail = null;
    }

    public void insertAtBeginning(int val) {
        Node3 Newnode = new Node3(val);
        if (head == null) {//empty list
            head = Newnode;
            tail = Newnode;
        } else //some values inside
        {
            head.prev = Newnode;
            Newnode.next = head;
            head = Newnode;
        }
    }

    public void insertAtPos(int pos,int val){
        if(pos==0){
            insertAtBeginning(val);
            return;
        }
        Node3 Newnode = new Node3(val);
        Node3 temp = head;
        for(int i=1;i<pos;i++)
        {
            temp = temp.next;
            if(temp==null) throw new IndexOutOfBoundsException("Invalid Position :"+pos);
        }
        Newnode.next = temp.next;
        Newnode.prev = temp;
        if(temp == tail) {tail = Newnode;}

        else temp.next.prev = Newnode;

        temp.next = Newnode;

    }

    public void display()
    {
        if(head==null){
            System.out.println("List is empty");
        }
        Node3 temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }

    public void displayrev()
    {
        if(head==null){
            System.out.println("List is empty");
        }

        Node3 temp = tail;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.prev;
        }

    }


    public void deleteAtPos(int pos){
        if(head==null){
            throw new IndexOutOfBoundsException("Deletion on empty List");
        }

        if(pos==0){
            head = head.next;
            if(head == null)
                tail =null;

            else
                head.prev = null;
            return;
        }
        Node3 temp = head;
        Node3 prev = null;
        for(int i = 1;i<=pos;i++){
            prev = temp;
            temp = temp.next;
            if(temp == null)
                throw new IndexOutOfBoundsException("Invalid Position");
        }
        prev.next = temp.next;
        if(temp.next==null)
            tail = prev;
        else
            temp.next.prev = prev;

    }

    public void deleteAtBeg(){
        if(head==null){
            throw new IndexOutOfBoundsException("Deletion on empty List");
        }
        head = head.next;
        if(head == null)
            tail =null;

        else
            head.prev = null;
        return;
    }


    public void reverse(){
        Node3 prev = null;
        Node3 current = head;
        Node3 next = head.next;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }


}
