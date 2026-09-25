package basicproblems;

public class LeadersinArray {
    public static void main(String[] args) {
        int arr[] = {16,17,3,5,1,2};
        int n=arr.length;
        int max = -1;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=max){
                max = arr[i];
                System.out.print(max+" ");

            }
            else{
                continue;
            }
        }

    }
}
