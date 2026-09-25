package technical;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your marks:");
        int marks = in.nextInt();

        switch (marks / 10) {
            case 10:
            case 9:
                System.out.println("Grade A");
                break;
            case 8:
            case 7:
                System.out.println("Grade C");
                break;
            case 6:
                System.out.println("Grade D");
                break;
            default:
                System.out.println("Grade F");
                break;
        }


    }
}
