package DSA;

public class QueueArray {
    static final int Max_size = 30;
    int front,rear;
    int arr[];

    QueueArray(){
        arr = new int[Max_size];
        rear = front = -1;
    }

    void enqueue(int val){
        if(rear==Max_size) throw new IndexOutOfBoundsException("Queue is Full");
        if(front == -1) front++;
        arr[++rear]=val;
    }

    int dequeue(){
        if(front==-1 || front>rear) throw new IndexOutOfBoundsException("Queue is Empty");
        return arr[front++];
    }

    public boolean isEmpty(){
        return front==-1;
    }

    public static void main(String[] args) {
        QueueArray queue = new QueueArray();
        queue.enqueue(4);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

    }
}

/*
* this array is not a efficient way to use queue data structure if ur array
*  is full and you can dequeue everything but cannot enqueue again n again*/
