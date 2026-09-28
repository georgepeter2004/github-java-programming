public class Main {
    public static void main(String[] args) {
        digital(2146);
    }


    static void digital(int n) {

        int temp = n;
        int divisor = 1;

        // Find highest place value
        while (temp >= 10) {
            temp = temp / 10;
            divisor = divisor * 10;
        }

        int rightTemp = n;

        while (divisor > 0) {

            int leftDigit = n / divisor;
            int rightDigit = rightTemp % 10;

            for (int i = 0; i < leftDigit; i++) {
                System.out.print(rightDigit);
            }

            System.out.println();

            // Move to next left digit
            n = n % divisor;//146


            // Move to next right digit
            rightTemp = rightTemp / 10;//214

            // Move divisor
            divisor = divisor / 10;//10
        }
    }
    }

