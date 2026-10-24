package Tabrezclass;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {

        int a[] = {10,4,6,8,1,2,3};
        System.out.println(Arrays.toString(a));
        countingSort(a);
        System.out.println(Arrays.toString(a));
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


    public static void countingSort(int a[]){
        int n = a.length;

        int res[] = new int[largestElement(a)+1];

        for(int i=0;i<n;i++){
            res[a[i]]++;
        }

        int x = 0;
        for(int i=0;i<res.length;i++){
            while(res[i]>0){
                a[x++]=i;
                res[i]--;
            }
        }

    }

    static int largestElement(int a[]) {

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) largest = a[i];
        }
        return largest;
    }

    static void merge(int a[],int l,int m,int h){
        int[] k = new int[a.length];

        int x=0;//maintaining index
        int left = l,right = m+1;

        while(left<=m && right<=h){
            if(a[left]<=a[right]) k[x++] = a[left++];
            else k[x++] = a[right++];
        }

        while(left<=m) k[x++] = a[left++];
        while(right<=h) k[x++] = a[right++];

        x=0;
        for (int i=l;i<=h;i++) a[i] = k[x++];

    }
}
