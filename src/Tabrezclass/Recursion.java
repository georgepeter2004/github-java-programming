package Tabrezclass;

public class Recursion {
    public static void main(String[] args) {
        int n = 8;
        func(1,n);
    }

    static void func(int i,int n){
        if(i>n) return;
        System.out.print(i+" ");
        func(i+1,n);
    }
}
