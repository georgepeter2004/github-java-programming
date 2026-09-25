package basicproblems;

import java.util.Scanner;

public class FindoddorEven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        if(num%2==0) System.out.println("Even number");
        else System.out.println("odd number");
    }
}