package Tabrezclass;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {

    }

    static void bubbleSort(int a[]){
        int n = a.length;
        for(int i=0;i<n-1;i++){
            for(int j = 0 ; j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }


    static void selectionSort(int a[]) {
        int n = a.length;
        for (int i = 0; i < n ; i++) {
            int smallest = i;
            for (int j = i+1; j < n ; j++) {
                if (a[j] < a[smallest]) {
                    smallest = j;
                }
            }
            int temp = a[i];
            a[i] = a[smallest];
            a[smallest] = temp;
        }

        System.out.println(Arrays.toString(a));

    }


    public static void CountingSort(int a[]){
        int n = a.length;

        int res[] = new int[largestElement(a)+1];

        for(int i=0;i<n;i++){
            res[a[i]]++;
        }

        int x = 0;
        for(int i=0;i<res.length;i++){
        }

    }

    static int largestElement(int a[]) {

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) largest = a[i];
        }
        return largest;
    }
}
