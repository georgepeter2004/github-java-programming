package basicproblems;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayjava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size: ");
        int size = sc.nextInt();
        int a[] = new int[size];
        for(int i=a.length-1;i>=0;i--){
            System.out.print("\nEnter the value a["+i+"]: ");
            a[i]=sc.nextInt();
        }



        System.out.println(arraysfunc(a));
    }

    public static int arraysfunc(int[] a){
        int n = 0;
        for(int i=0;i<a.length;i++){
            n+=a[i];
        }
        return n;
    }

    public static void arrfun(int n[]){
        int s=0;
        int e=
        while(s>e){

        }
    }
}
