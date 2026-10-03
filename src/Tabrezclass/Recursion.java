package Tabrezclass;

public class Recursion {
    public static void main(String[] args) {


        //nto1(10);
        //System.out.println();
//        System.out.println(sumofn(5));
//
//        System.out.println(fact(4));
//
//        table(1,2);
    }

    static void func(int i,int n){
        if(i>n) return;
        System.out.print(i+" ");
        func(i+1,n);
    }

    static void nto1(int n){
        if(n==0) return ;
        System.out.print(n+" ");
        nto1(n-1);
    }

    static int sumofn(int n){
        if(n==1) return 1;

        return n+sumofn(n-1);

    }

    static int fact(int n){
        if(n==1) return 1;
        return n*fact(n-1);
    }

    static void table(int i,int n){
        if(i>10) return;
        System.out.println(n+"x"+i+"="+n*i);
        table(i+1,n);
    }

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        System.out.print((n-1)+" "+(n-2));
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
