package Tabrezclass;

import java.util.Scanner;

public class BasicProblems {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("Prime number logic 1: "+prime1(8));
//        System.out.println("Prime number logic 2: "+prime2(9));
//        System.out.println("Prime number logic 3: "+prime3(9));
//
//        System.out.println("count digit 1: "+countdigit1(456));
//        System.out.println("count digit 2: "+countdigit2(456));
//
//        System.out.println("sum of digit: "+sumofdigit(1234));
//
//        nthMaximumMinimum(12314);
//
//        System.out.println("Sum of First and Last Digit: "+sumofFirstnLastDigit(7897));
//
//        System.out.println(xylem(1234)?"Xylem":"Phloem");
//
//        tables(2);
//
//        System.out.println(palindrome(121)? "Palindrome":"Not Palindrome");
//
//        System.out.println(binaryToDecimal(1101));
//
//        System.out.println(decimaltoBinary(13));
//        System.out.println(findSqrtPerfect(49));
//
//        System.out.println("GCD: "+GCD2(8,12));
//        System.out.println("LCM: "+LCM3(9,5));
//        System.out.println("Fibonacci: "+fibonacci(10));
//        System.out.println(strongnum(145));
        digital(2456);
        star(3);

    }


    static boolean prime1(int n) {
        if (n == 0 || n == 1) return false;//loop is running from  2 to nth times
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean prime2(int n) {
        if (n == 0 || n == 1) return false;//loop is running from  2 to n/2 times looping reduced
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean prime3(int n) {
        if (n == 0 || n == 1) return false;//loop is running from 2 to root n which is more faster
        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void nthMaximumMinimum(int n) {
        int max=n%10;
        int min=n%10;
        while(n>0){
            int d = n%10;

            if(d>max){
                max = d;
            }
            else if(d<min){
                min = d;
            }
            n/=10;
        }
        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);

    }

    static int countdigit1(int n){
        int count=0;
        for(int i=1;n>0;i++){
            count++;
            n/=10;
        }
        return count;//brute force
    }

    static int countdigit2(int n){
        return (int)Math.log10(n)+1;//optimal with in-build function
    }

    static int sumofdigit(int n){
        int digit = 0;
        while(n!=0){
            digit += n%10;
            n/=10;
        }
        return digit;
    }

    static int sumofFirstnLastDigit(int n){
        int first=0;
        int last=n%10;
        while(n>0){
            first = n%10;
            n/=10;
        }
        return first+last;
    }

    static boolean xylem(int n){//1234
        int last = n%10;//4
        int middlesum=0;//0
        int first=0;//0
        n/=10;//123
        while(n>=10){//123>=10-->12>=10
                middlesum +=n%10;//3+2
                n/=10;//123-->12-->1
        }
        first = n;
        return (first+last) == middlesum;//T or F
    }

    static void tables(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+(n*i));
        }
    }

    static boolean palindrome(int n){
        int og = n;
        int reverse = 0;
        while(n>0){
            reverse = (reverse * 10)+ n%10 ;
            n/=10;
        }
        return og==reverse;
    }

    static int binaryToDecimal(int n){
        int result = 0;
        int x = 1;
        while(n>0){
            result +=(n%10*x);
            x*=2;
            n/=10;
        }
        return result;
    }

    static String decimaltoBinary(int n){
        String res = "";
        while(n>0){
            res = n%2+res;
            n/=2;
        }
        return res;
    }

    static boolean findSqrtPerfect(int n){
        for(int i=1;i*i<=n;i++){
            if(i*i==n) return true;
        }
        return false;

    }


    static int GCD1(int a , int b){
        int n = a>b? a:b;
        for(int i=n;i>0;i--){
            if(n%i==0) return i;
        }
        return 1;
    }

    static int GCD2(int a , int b){
        int res = 0;
        while(a!=0 && b!=0){
            if(a>b){
                a = a%b;
            }
            else
                b = b%a;
        }
        if(a==0) return b;
        return a;
    }

    static int GCD3(int a,int b){
        while(b>0){//a=12,b=8
            int temp = b;
            b = a%b;
            a=temp;
        }
        return a;
    }



    static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    static int LCM1(int a,int b){
        return (a*b)/GCD1(a,b);
    }

    static int LCM2(int a ,int b){
        int k = Math.max(a,b);
        int i;
        for(i = k; ;i+=k){
            if(i%a==0 && i%b==0) break;
        }
        return i;
    }

    static int LCM3(int a,int b){
        int max = a>b? a:b;
        int step = max;
        while(true){
            if(max%b==0 && max%a==0){
                break;
            }
            max+=step;
        }
        return max;
    }

    static boolean strongnum(int n){//145
        int og = n;
        int sum = 0;


        while(n>0){        //145
            int digit = n%10;
            int ans = 1;
            for(int i=digit;i>1;i--){       //5>1
                ans *=i;                  //1*5=5
            }
            sum+=ans;
            n/=10;
        }
        return og==sum;
    }

    static void digital(int n){
        while(n>0){
            int last = n%10;
            for(int i=1;i<=last;i++){
                System.out.print(last);
            }
            System.out.println();
            n/=10;
        }
    }

    static void star(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
