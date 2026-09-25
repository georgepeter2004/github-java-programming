package technical;

import java.util.Scanner;

public class hero_villain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nv = sc.nextInt();
        int nh = sc.nextInt();
        int hh = sc.nextInt();
        int vh[] = new int[nv];
        for(int i=0;i<nv;i++){
            vh[i] = sc.nextInt();
        }
        int c=0;
        for(int i=0;i<nv;i++) {
            if(hh>0) {
                hh -= vh[i];
                c += 1;
            }
        }
        System.out.println(c);
    }
}
