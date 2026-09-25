package basicproblems;

import java.util.Scanner;
public class ReversetheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int r = 0;
        int i;
        for(i = 0;num!=0;i++){
            int digit = num % 10;
            r = r * 10 + digit;
            num = num/10;
        }
        System.out.println(r);
    }
}
