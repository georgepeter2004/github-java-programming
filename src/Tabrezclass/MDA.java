package Tabrezclass;

import java.util.Arrays;
import java.util.Scanner;

public class MDA {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a[][] = {
                {8,3,1,4},
                {2,1,-6,7},
                {3,7,8,9,4},
        };



    }

    public static int[][] createArray(){
        System.out.print("Enter Row: ");
        int row = sc.nextInt();

        int res[][] = new int[row][];
        for(int i=0;i<res.length;i++){
            System.out.print("\nEnter column for ["+i+"]: ");
            res[i] = new int[sc.nextInt()];
        }
        System.out.println();

        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[i].length;j++){
                System.out.print("Enter the Element ["+i+"]["+j+"]: ");
                res[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        return res;
    }

    public static int smallestElement2d(int a[][]){
        int smallest = Integer.MAX_VALUE;

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++){
                smallest = Math.min(smallest,a[i][j]);
            }
        }
        return smallest;
    }

    public static void reverseEven2dArray(int a[][]){
        for(int i=0;i<a.length;i++){
            if(i%2==0){
                int left = 0,right = a[i].length-1;
                while(left<right){
                    int temp = a[i][left];
                    a[i][left++] = a[i][right];
                    a[i][right--] = temp;
                }
            }
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void display(int a[][]){

        for(int i=0;i< a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

}
