package Tabrezclass;

public class Patterns {
    public static void main(String[] args) {
        star2(11);
    }

    static void star() {//3x5 '*'
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (true) System.out.print("* ");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }


    static void star2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == n - 1 || i == 0 || i == n - 1 || j == 0 || j == n - 1 || j == n / 2 || i == n / 2 || i == j || j == i)
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }


}
