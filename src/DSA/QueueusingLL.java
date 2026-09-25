package DSA;

public class QueueusingLL
{
    class Node{
        int data;
        Node next;

        Node(int val){
            data = val;
            next = null;
        }
    }
    Node front,rear;

    QueueusingLL() {
        front = null;
        rear = null;
    }
        public void enqueue(int val){
            Node newnode = new Node(val);
            if(front==null) front = newnode;
            else rear.next = newnode;
                rear = newnode;

        }

        public int dequeue()
        {
            if(front==null) throw new IndexOutOfBoundsException("Queue is Empty");
            int temp = front.data;
            front=front.next;
            if(front==null) rear = null;
            return temp;
        }

        public boolean isEmpty(){
        return front==null;
        }


    public static void main(String[] args) {
        QueueusingLL stack = new QueueusingLL();

        stack.enqueue(2);
        stack.enqueue(1);
        stack.enqueue(3);
        stack.enqueue(4);

        System.out.println(stack.dequeue());
        System.out.println(stack.dequeue());
        System.out.println(stack.dequeue());
        System.out.println(stack.dequeue());
    }

    }
