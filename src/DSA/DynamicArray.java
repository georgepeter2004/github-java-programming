package DSA;

import java.util.Arrays;
import java.util.Scanner;

class DynamicArrayfunction
{
    static final int initvalue=8;
    private int arr[];
    private int size,capacity;

DynamicArrayfunction(){
    size = 0;
    arr = new int[initvalue];
    capacity = initvalue;
}

public void add(int val) {
    arr[size++] = val;
    if (size == capacity) {
        expandArray();
    }
}
    private void expandArray(){
        capacity *= 2;
       arr = Arrays.copyOf(arr,capacity);
}

public void Display(){
    System.out.println("Elements :");
    for(int i = 0;i<size;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}

public void insertAtPos(int pos,int val){
    if(size == capacity) expandArray();

    for(int i=size-1;i>=pos;i--){
        arr[i+1]=arr[i];
        size++;
    }
    arr[pos]=val;
}

public void insertAtbeg(int val){
    int pos = 0;
    if(size == capacity) expandArray();

    for(int i = size-1;i>=pos;i--){
        arr[i+1]=arr[i];
        size++;
    }
    arr[pos]=val;
}

public void deleteAtBeg(){
    for (int i = 1;i<size;i++){
        arr[i-1]=arr[i];
        if(capacity > initvalue && capacity > 3*size) shrinkcapacity();
    }
    size--;
}

public void deleteAtPos(int pos){
    for(int i = pos+1;i<size;i++){
        arr[i-1]=arr[i];
        if(capacity > initvalue && capacity > 3*size) shrinkcapacity();
    }
    size--;
}

public void deleteAtEnd(){
    int pos = size-1; //3
    for(int i = pos+1;i<=size;i++){//4
        arr[size-1]=arr[i];//arr[5]=arr[]
        if(capacity > initvalue && capacity > 3*size) shrinkcapacity();
    }
    size--;
}

    private void shrinkcapacity(){
        capacity /=2;
        arr = Arrays.copyOf(arr,capacity);
    }
    public int length(){
        return size;
    }

    public void get(int pos){
    if(pos<0 || pos>size){
        System.out.println("Invalid Position");
    }
        System.out.print("index of value: "+arr[pos]);
    }

    public void update(int pos,int val){
        if(pos<0 || pos>size){
            System.out.println("Invalid Position");
        }

        arr[pos]=val;
        Display();
    }

    public void search(int val){
    for(int i =0;i<size;i++){
        if(arr[i]==val){
            System.out.println("Index of value: "+i);
            return;
        }
        else{
            continue;
        }
    }
        System.out.println("No Value Found");
    }

    public boolean contains(int val){
    for (int i=0;i<size;i++){
        if(arr[i]==val){
            return true;
        }
        else{
            continue;
        }
    }
        return false;
    }

}



public class DynamicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DynamicArrayfunction list = new DynamicArrayfunction();
        int pos,val,choice,length;
        while (true){
            System.out.println("1.Insert at End");
            System.out.println("2.Display");
            System.out.println("3.Insert at specified position");
            System.out.println("4.Delete");
            System.out.println("5.Exit");
            System.out.println("6.Delete at End");
            System.out.println("7.insert at Beginning");
            System.out.println("8.delete at Beginning");
            System.out.println("9.Get index of value");
            System.out.println("10.Update value at Pos");
            System.out.println("11.search");
            System.out.println("12.contains (true of false)");

            System.out.print("Enter the Choice: ");
            choice = sc.nextInt();

            switch (choice){
                case 1 :
                    System.out.print("Enter the Value: ");
                    val = sc.nextInt();
                    list.add(val);
                    break;
                case 2 :
                    list.Display();
                    break;

                case 3 :
                    length = list.length();
                    System.out.println("No of Elements in List:"+length);
                    System.out.print("Enter the position(Starts from 0): ");
                    pos = sc.nextInt();
                    if(pos<0){
                        System.out.println("Invalid Position");
                    }
                    System.out.println("Enter the Value:");
                    val = sc.nextInt();
                    list.insertAtPos(pos,val);
                    break;

                case 4 :
                    System.out.print("Enter the position(Starts from 0): ");
                    pos = sc.nextInt();
                    if(pos<0){
                        System.out.println("Invalid Position");
                    }
                    list.deleteAtPos(pos);
                    break;

                case 5 :
                    System.exit(0);

                case 6 :
                    list.deleteAtEnd();
                    break;

                case 7 :
                    System.out.print("Enter the Value: ");
                    val = sc.nextInt();
                    list.insertAtbeg(val);

                case 8:
                    list.deleteAtBeg();
                    break;

                case 9 :
                    System.out.print("Enter the Position: ");
                    pos = sc.nextInt();
                    list.get(pos);
                    break;

                case 10 :
                    System.out.print("Enter the position: ");
                    pos = sc.nextInt();

                    System.out.print("Enter the Value: ");
                    val = sc.nextInt();

                   list.update(pos,val);
                    break;

                case 11 :
                    System.out.print("Enter the value: ");
                    val = sc.nextInt();
                    list.search(val);
                    break;

                case 12 :
                    System.out.print("Enter the Value: ");
                    val = sc.nextInt();
                    boolean res = list.contains(val);
                    System.out.println(res);

                default :
                    System.out.println("Invalid Choice");
            }
        }
    }
}
