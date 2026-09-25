package basicproblems;

import java.util.Scanner;

public class SnakePatternMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=3,k=1;
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = k;
                k++;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j = 0;j<n;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int j=n-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}
