package DSA;

public class BinarySearch {

    public static int Find(int[] arr,int target){
        int start = 0,end = arr.length-1;
        boolean ase = false;

        if(arr[start]<arr[end]) ase = true;

        if(ase){
        while(start<=end){
            int mid = (start + end) / 2;
            if(target>arr[mid]){
                start = mid+1;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }

            else return mid;
        }
        return -1;
        }

        else{
            while(start<=end){
                int mid = (start + end) / 2;
                if(target<arr[mid]){
                    start = mid+1;
                }
                else if(target>arr[mid]){
                    end = mid-1;
                }

                else return mid;
            }
            return -1;
        }
    }
    public static void main(String[] args) {
        int arr[] = {8,7,6,5,4,3,2,1};
        System.out.println(Find(arr,1));
    }
}
