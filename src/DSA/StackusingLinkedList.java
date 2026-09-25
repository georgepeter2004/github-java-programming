package DSA;

public class StackusingLinkedList<T> {
    class Node<T>{
        T data;
        Node next;

        Node (T val){
            data = val;
            next = null;
        }

    }
    Node top;
    StackusingLinkedList(){
        top = null;
    }

    void push(T val){
        Node Newnode = new Node(val);
        Newnode.next = top;
        top = Newnode;
    }

    T pop(){
        if(top==null) throw new IndexOutOfBoundsException("Stack is underflow");
        T temp = (T)top.data;
        top = top.next;
        return temp;
    }

    T peek(){
        return (T)top.data;
    }

    public static void main(String[] args) {
        StackusingLinkedList<Integer> stack = new StackusingLinkedList<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
    }
}
