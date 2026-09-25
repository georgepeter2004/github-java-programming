package basicproblems;

import java.util.Scanner;
public class PalindromeinDoublyLinkedList {
    class Node{
        int data;
        Node next,prev;

        Node(int val){ data=val; }
    }
    Node head,tail;
    PalindromeinDoublyLinkedList(){
        head=tail=null;
    }
    public void insert(int val){
        Node newNode = new Node(val);
        if(head==null) head=tail=newNode;
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }}

        public void Display(){
            Node curr = head;
            while (curr!=null){
                System.out.print(curr.data+" ");
                curr=curr.next;
            }
            System.out.println();
            curr = tail;
            while(curr!=null){
                System.out.print(curr.data+" ");
                curr=curr.prev;
            }
            System.out.println();
        }

       boolean isPalindrome(){
            Node left = head , right = tail;
            while(left != null && right != null && left != right && right.next != left){
                if(left.data != right.data) return false;
                right = right.next;
                left = left.next;
            }
            return true;

      }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PalindromeinDoublyLinkedList list = new PalindromeinDoublyLinkedList();
        int n = sc.nextInt();
        for(int i=0;i<n;i++) list.insert(sc.nextInt());
        list.Display();
        if(list.isPalindrome())
            System.out.println("palindrome");

        else
            System.out.println("Not Palindrome");
    }

}
