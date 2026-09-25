package basicproblems;

import java.util.Scanner;
public class FindLastDigitNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int lastdigit = num % 10;
        System.out.println("Result: "+lastdigit);
    }
}
