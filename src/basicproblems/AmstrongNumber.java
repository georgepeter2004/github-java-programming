package basicproblems;

import java.util.Scanner;
public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int copy,digit=0,sum=0;
        copy = n;
        for(digit = 0;copy>0;digit++){
            copy = copy/10;
        }
        copy = n;
        while(copy>0){//123
            sum = sum + (int)Math.pow((copy%10),digit);
            copy = copy/10;
        }
        System.out.println(sum);

        if(sum == n){
            System.out.println("Armstronng");
        }
        else {
            System.out.println("Not Armstronng");
        }
    }
}
