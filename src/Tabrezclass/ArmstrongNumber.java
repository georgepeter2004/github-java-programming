package Tabrezclass;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int copy = n;
        int count;
        int result =0;
        for(count=0; copy>0;count++){
            copy/=10;
        }
        copy = n;

        while(copy>0){
            result += (int)Math.pow(copy%10,count);
            copy/=10;
        }

        if(result==n) System.out.println(true);
        else System.out.println(false);



    }
}
