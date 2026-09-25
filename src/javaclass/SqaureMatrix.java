package javaclass;

import java.util.Scanner;

public class SqaureMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[][] = new int[n][n];
        int temp [][] = new int[n][n];


        for(int i =0;i<n;i++){
            for(int j = 0;j<n;j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        int arr2[][] = new int[n][n];

        for(int i =0;i<n;i++){
            for(int j = 0;j<n;j++){
                arr2[i][j] = sc.nextInt();
            }
        }

       /* for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                temp[i][j] = arr1[i][j]+arr2[i][j];
                System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }
*/
  /*      for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                temp[i][j] = arr1[i][j]-arr2[i][j];
                System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }*/
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                temp[i][j] = 0;
               for(int k=0;k<n;k++){
                   temp[i][j] += arr1[i][k] * arr2[k][j];

               }
                System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }
    }
}
