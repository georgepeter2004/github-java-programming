package Tabrezclass;

public class Leetcode {
    public static void main(String[] args) {

    }

    public boolean validMountainArray(int[] arr) {
        int i = 0,n=arr.length;
        if(n<3) return false;
        while(i+1<n && arr[i]<arr[i+1])
            i++;

        if(i==0 || i==n-1) return false;

        while(i+1<n && arr[i]>arr[i+1]) i++;

        if(i==n-1) return true;

        return false;
    }

}
