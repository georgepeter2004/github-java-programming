package DSA;

//import java.util.Iterator;
public class SLLDemo {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        SingleLinkedList1<Integer> list1 = new SingleLinkedList1<Integer>();

        list.insertAtBeginning(9);
        list.insertAtBeginning(8);
        list.insertAtBeginning(7);
        list.insertAtBeginning(6);
        list.insertAtBeginning(5);
        list.insertAtBeginning(4);
        list.display();
        System.out.println();

        boolean res = list.Loop();
        System.out.println(res);

        list.reverse();
        list.display();
//      list1.insertAtBeginning(5);
//      list1.insertAtBeginning(4);
//      list1.insertAtBeginning(3);
//      list1.insertAtBeginning(2);
//      list1.display();
//      System.out.println();
//      list1.search(4);
//      System.out.println();
//      list1.contains(4);
//      list1.get(3);
//      System.out.println();
//
//      for(int a:list1){
//         System.out.print(a+" ");
//      }



    }
}
