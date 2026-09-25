package basicproblems;

public class pushzerotolast {
    public void swap(int arr[]){

    }
    public static void main(String[] args) {
        int arr[]={1,2,0,0,6,7,0,8,0};
        int i=0,j=arr.length-1;
        while(i<=j){
            if(arr[i]!=0){
                i++;
                if(arr[j]==0) j--;
            }
            else{
                int temp = arr[i];
                arr[i++]=arr[j];
                arr[j--]=temp;
                System.out.println();
            }

            for(int a:arr){
                System.out.print(a+" ");
            }
        }
    }
}
