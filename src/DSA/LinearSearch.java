package DSA;

import java.util.Arrays;

public class LinearSearch {
    public static int Find(int arr[],int Target){
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==Target){
                return i;
            }
        }
        return -1;
    }

    public static int Find(String str,char Target){
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)==Target){
                return i;
            }
        }
        return -1;
    }

    public static int[] Find(int[][] arr,int Target){
        for(int i=0;i < arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                if(arr[i][j]==Target)
                    return new int[] {i,j};
            }
        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8,9};
        int twoarr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        String name = "Kavi";
        System.out.println(Find(arr,8));
        System.out.println(Find(name,'i'));
        int result[]=Find(twoarr,7);
        System.out.println(Arrays.toString(result));
    }
}
