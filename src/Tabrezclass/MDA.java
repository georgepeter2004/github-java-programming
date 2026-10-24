package Tabrezclass;

import java.util.Arrays;
import java.util.Scanner;

public class MDA {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a[][] = createArray();

        for(int i=0;i< a.length;i++){
            for(int j =0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
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
}
