package Tabrezclass;

public class Search {
    public static void main(String[] args) {
        int a[] = {1,2,9,10,5,7,3,8};
        System.out.println(linearSearch(a,7));

        int b[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(b,5));
    }

    static boolean linearSearch(int a[],int target){
        for(int i=0;i<a.length;i++){
            if(target == a[i]) return true;
        }
        return false;
    }

    static boolean binarySearch(int a[],int target){
        int lower = 0,higher = a.length-1;
        while(lower<=higher){
            int middle = lower+higher/2;
            if(target==a[middle]) return true;
            else if(target<a[middle]) higher = middle-1;
            else lower = middle+1;
        }
        return false;
    }
}
