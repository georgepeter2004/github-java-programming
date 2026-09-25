package basicproblems;

import java.util.Scanner;
public class FindPowerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number(base): ");
        int num = sc.nextInt();
        System.out.println("^");
        int exponent = sc.nextInt();
        int power = 1;
        for(int i = 1;i<=exponent;i++){
            power = power * num;
        }
        System.out.println(power);


    }
}
