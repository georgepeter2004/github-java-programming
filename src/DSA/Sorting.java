package DSA;

import java.util.Arrays;

public class Sorting {
    public static void Selectionsort(int[] arr){
        for(int i=0;i<arr.length;i++){//5,48,2,34,7,76
            int minIndex = i;//5->48
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex])//48<5->2<48
                    minIndex = j;
            }
        int temp = arr[i];//5
        arr[i]=arr[minIndex];//5
        arr[minIndex] = temp;//5

        }
        System.out.println(Arrays.toString(arr));
    }


    public static void Bubblesort(int arr[]){
        int n = arr.length;
        for(int i=1;i<n;i++){
            for(int j=0;j<n-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void Insertionsort(int arr[]){
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int[] mergeSort(int[] arr){
        int mid = arr.length/2;

        if(arr.length==1) return arr;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    public static int[] merge(int[] first,int[] second){
       int[] joined = new int[first.length+second.length];
       int i=0,j=0,k=0;
       while(i<first.length && j<second.length){
           if(first[i]>second[j]){
               joined[k++]=second[j++];
           }
           else{
               joined[k++] = first[i++];
           }
       }

       while(i< first.length)  joined[k++]=first[i++];
       while(j< second.length)  joined[k++]=second[j++];

        return joined;
    }

    public static void mergeSortinPlace(int[] arr,int start,int end){

        int mid = (start+end)/2;

        if(end-start==1) return;

        mergeSortinPlace(arr,start,mid);
        mergeSortinPlace(arr,mid,end);

        mergeInplace(arr,start,mid,end);
    }



    public static void mergeInplace(int[] arr,int start,int mid,int end){
        int[] joined = new int[end-start];
        int i=start,j=mid,k=0;
        while(i<mid && j<end){
            if(arr[i]<arr[j]){
                joined[k++]=arr[i++];
            }
            else{
                joined[k++] = arr[j++];
            }
        }

        while(i<mid)  joined[k++]=arr[i++];
        while(j<end)  joined[k++]=arr[j++];

        for(k=0;k<joined.length;k++){
            arr[start+k]=joined[k];
        }
    }

    public static void quickSort(int[] arr,int low,int high){
        if(low>=high) return;

        int start = low,end = high,mid=(start+end)/2,pivot = arr[mid];

        while(start<=end){
            while(arr[start]<pivot) start++;

            while(arr[end]>pivot) end--;

            if(start<=end){
                int temp = arr[start];
                arr[start++]=arr[end];
                arr[end--]=temp;
            }

            quickSort(arr,low,end);
            quickSort(arr,start,high);
        }

    }



    public static void main(String[] args) {
        int arr[] = {5,48,2,34,7,76};
        /*Selectionsort(arr);
        Bubblesort(arr);
        Insertionsort(arr);
        int[] result = mergeSort(arr);
        mergeSortinPlace(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));*/
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
