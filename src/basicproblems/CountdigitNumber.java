package basicproblems;

import java.util.Scanner;
public class CountdigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int i;
        for(i = 0;num!=0;i++){
            num /= 10;
        }

        System.out.println(i);


    }
}
