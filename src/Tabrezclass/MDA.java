package Tabrezclass;

import java.util.Arrays;
import java.util.Scanner;

public class MDA {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the row size: ");
//        int row = sc.nextInt();
//
//        int a[][] = new int[row][];
//        System.out.println();
//        for(int i=0;i< a.length;i++){
//            System.out.print("Enter the Column["+i+"] Size: ");
//            int col = sc.nextInt();
//            a[i] = new int[col];
//        }
//        System.out.println();

        int a[][] = {{1,2,3},{2,1,3},{1,2,3,4,5}};
        for(int i=0;i<a.length;i++){
            if(i%2==0){
                int l=0,r = a[i].length-1;
                while(l<r){
                    int temp = a[i][l];
                    a[i][l++] = a[i][r];
                    a[i][r--] = temp;
                }
            }

            for(int j =0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }






}
}
