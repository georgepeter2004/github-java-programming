import Tabrezclass.Arrayjava;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Arrayjava s1 = new Arrayjava();
        int a[] = {10,4,6,8,1,2,3};
        System.out.println(Arrays.toString(a));

        int res[] = new int[s1.largestElement(a)+1];

        for(int i=0;i<a.length ;i++){
            res[a[i]]++;
        }

        int x=0;

        for(int i=0;i<res.length;i++){
            while(res[i]>0){
                a[x++] = i;
                res[i]--;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}

