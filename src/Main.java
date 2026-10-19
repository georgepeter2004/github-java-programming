import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a[] = {1,1,2,5,5,6},x=0;
        int b[] = {1,1,2,3,3,4,7,7},y=0;
        int res[] = new int[a.length+b.length];
        res[0] = a[0];
        for(int i = 1;i<res.length;i++){
            if(a[x]==b[y]) {
                if(a[x]!=res[i-1]){
                    res[i] = a[i];
                    x++;
                    y++;
                }

                else {
                    x++;
                    y++;
                }

            }
            else if(a[x]>b[y]) {
                if(a[x]!=res[i-1]){
                    res[i] = a[x++];
                }

                else if(b[y]!=res[i-1]){
                        res[i] = b[y++];
                    }

                else {
                    x++;
                    y++;
                }

            }
            else {
                if(b[y]!=res[i-1]){
                    res[i] = b[y++];
                }
                else if (a[x]!=res[i-1]){
                    res[i]=a[x++];
                }
                else {
                    x++;
                    y++;
                }
            }

            System.out.println(Arrays.toString(res));
        }


    }
}

