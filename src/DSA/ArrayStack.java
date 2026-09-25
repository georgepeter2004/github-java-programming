package DSA;

public class ArrayStack<T> {
    static final int MAX_SIZE = 30;
    int top;
    T arr[] = (T[]) new Object[MAX_SIZE];

    ArrayStack(){
        top = -1;
    }

    void push(T val){
        if(top==MAX_SIZE) throw new IndexOutOfBoundsException("Stack is Overflow");
        arr[++top]=val;
    }

    T pop(){
        if(top==-1) throw new IndexOutOfBoundsException("Stack is Underflow");
        return arr[top--];
    }

    T peek(){
        if(top==-1) throw new IndexOutOfBoundsException("Stack is Underflow");
        return arr[top];
    }


    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack();
        stack.push(4);
        System.out.println(stack.pop());
    }
}
