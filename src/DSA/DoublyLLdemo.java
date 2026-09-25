package DSA;

//import java.util.Iterator;
public class DoublyLLdemo {
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        SingleLinkedList1<Integer> list1 = new SingleLinkedList1<Integer>();

        list.insertAtBeginning(9);
        list.insertAtBeginning(8);
        list.insertAtBeginning(7);
        list.insertAtBeginning(6);
        list.display();
        System.out.println();
        list.displayrev();
        System.out.println();

        list.deleteAtPos(3);

        list.display();
        System.out.println();
        list.displayrev();




//        list1.insertAtBeginning(5);
//        list1.insertAtBeginning(4);
//        list1.insertAtBeginning(3);
//        list1.insertAtBeginning(2);
//        list1.display();
//        System.out.println();
//        list1.search(4);
//        System.out.println();
//        list1.contains(4);
//        list1.get(3);
//        System.out.println();
//
//        for(int a:list1){
//            System.out.print(a+" ");
//        }



    }
}
