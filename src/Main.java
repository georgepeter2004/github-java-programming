import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int a[] = {10,20,30,40,50,60};
//
//        System.out.println(Arrays.toString(a));
//
//        rotate(a,3);
//        System.out.println(Arrays.toString(a));


        int b[] = {3,4,2,1,6,5};

        pri(b);

    }

    public static int[] rotate(int a[],int r){
        int n = a.length;
        r = r%n;

        for(int i=1;i<=r;i++){
            int f = a[0];
            for(int j=1;j<n;j++){
                a[j-1] = a[j];
            }

            a[n-1] = f;
        }
        return a;
    }

    static void pri(int a[]){
        int n = a.length;
        int l=0,r=n-1;
        while(l<=r){
            for(int i=a[r];i>0;i--){
                System.out.print(a[l]+" ");
            }
            System.out.println();
            l++;
            r--;
        }

    }
    }

