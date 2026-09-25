package technical;
import java.util.Arrays;
import java.util.Scanner;

public class gym {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c=0,f=0;
        Arrays.sort(a);

        for (int i = n - 1; i >=0; i--) {
            e -= a[i];
            c+=1;
            if (e <= 0)
                { f = 1;
                break;}


            e -= a[i];
            c+=1;
            if (e <= 0) {
                 f = 1;
                break;
            }
        }
                if (f == 1) {
                    System.out.println(c);
                } else {
                    System.out.println(-1);
                }


    }
}
