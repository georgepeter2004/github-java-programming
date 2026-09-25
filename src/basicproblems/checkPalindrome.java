package basicproblems;

import java.util.Scanner;

public class checkPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int copyn=n,rev=0;

        while(copyn!=0){
            int digit = copyn%10;
            rev = rev * 10 + digit;
            copyn /= 10;
        }
        if(rev==n) System.out.println("palindrome");
        else System.out.println("Not palindrome");

    }
}
