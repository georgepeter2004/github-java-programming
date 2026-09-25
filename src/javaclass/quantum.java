package javaclass;

import java.util.Scanner;

public class quantum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=0;
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        /*for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }*/


        int i=0 ,j=0;
        while(i<n-1 || j<n-1){
                if(i==n-1){
                    j++;
                }
                else if(j==n-1) i++;
                else {
                    if (arr[i][j + 1] < arr[i + 1][j]) {
                        i++;
                    } else if (arr[i][j + 1] > arr[i + 1][j]) {
                        j++;
                    } else {
                        i++;
                    }
                }
                    temp += arr[i][j];

            }

        System.out.println("Ans:" + temp);
    }
    }

