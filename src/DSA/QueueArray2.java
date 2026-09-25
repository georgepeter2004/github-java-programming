package DSA;

public class QueueArray2 {
        static final int Max_size = 30;
        int front,rear;
        int arr[];

        QueueArray2(){
            arr = new int[Max_size];
            rear = -1;
        }

        void enqueue(int val){
            if(rear==Max_size) throw new IndexOutOfBoundsException("Queue is Full");
            arr[++rear]=val;
        }

        int dequeue(){
            if(rear==-1) throw new IndexOutOfBoundsException("Queue is Empty");
            int temp = arr[0];
            for(int i = 1;i<=rear;i++) arr[i-1]=arr[i];
            rear--;
            return temp;
        }

        public boolean isEmpty(){
            return rear == -1;
        }

        public static void main(String[] args) {
            QueueArray queue = new QueueArray();
            queue.enqueue(4);
            queue.enqueue(2);
            queue.enqueue(3);

            System.out.println(queue.dequeue());
            System.out.println(queue.dequeue());
            System.out.println(queue.dequeue());

            queue.enqueue(3);
            queue.enqueue(3);
            queue.enqueue(3);

            System.out.println(queue.dequeue());
            System.out.println(queue.dequeue());
            System.out.println(queue.dequeue());

            /*
             * this array is inefficient way to use queue data structure if ur array
             *  is getting dequeue the first element it should swift the all element to one step front of the array
             * so in worst case it is not a proper way.
             * */
        }
    }

