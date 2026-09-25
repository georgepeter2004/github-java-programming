package DSA;

public class CircularLLDemo {
    public static void main(String[] args) {
        CircularLinkedList<Integer> list = new CircularLinkedList<>();

        list.insertAtEnd(6);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);

        list.Display();
        list.deleteAtEnd();
        System.out.println();
        boolean res = list.Loop();
        System.out.println(res);
        list.Display();


    }
}
