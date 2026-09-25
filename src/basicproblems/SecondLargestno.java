package basicproblems;

public class SecondLargestno {
    public static void main(String[] args) {
        int arr[]={10,20,32,45,56,75};
        int n = arr.length;
        int max1=-1;
        int max2=-1;
        for(int i = 0;i<n;i++){
            if(arr[i]>=max1){
                max2 = max1;
                max1 = arr[i];
            }
            if( max1<=max2) max2 = arr[i];
        }
        System.out.println(max2+" "+max1);
    }
}
