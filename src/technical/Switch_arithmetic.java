package technical;

import java.util.Scanner;
public class Switch_arithmetic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number1:");
        int num1 = in.nextInt();
        System.out.println("enter number2:");
        int num2 = in.nextInt();
        System.out.println("enter  + Add" + " - sub "+" * mul "+" / Division");
        System.out.println("enter an operator:");
        char choice = in.next().charAt(0);
        switch (choice){
            case '+' :
                System.out.println("Addition :" + (num1+num2) );
                break;
            case '-' :
                System.out.println("Subtraction :" + (num1-num2) );
                break;
            case '*' :
                System.out.println("Multiplication :" + (num1*num2) );
                break;
            case '/' :
                System.out.println("Division :" + (num1/num2) );
                break;
            default:
                System.out.println("give correct operator");
                break;
        }
    }
}
