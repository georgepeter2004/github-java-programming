package basicproblems;

import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();//24
        int num2 = sc.nextInt();//60
        while (num2!=0){
            int temp = num2;//temp = 60 -> 24 -> 12
            num2 = num1 % num2;//24%60=24 -> 60%24=12 -> 24%12 = 0
            num1 = temp;//num1 = 60 -> num1 = 24 -> 12
        }
        System.out.println(num1);
    }
}
