package Tabrezclass;

public class Patterns {
    public static void main(String[] args) throws Exception {
//        star1();
//        System.out.println();
//
//        star2(11);
//        System.out.println();
//
//        star3(9);
//        System.out.println();


//        startriangle1(5);
//        startriangle2(5);
//        startriangle3(5);
//        startriangle4(5);
        startriangle5(5);
        startriangle6(5);
        startriangle7(5);


    }

    static void star1(int n) {//3x5 '*'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (true) System.out.print("* ");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }


    static void star2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    static void star3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == n - 1 || i == 0 || j == 0 || j == n / 2
                        || i == n / 2 || i == n - 1 || j == n - 1 || i == j )
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    static void star4(int n) throws Exception {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j<n ; j++) {
                if (true) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();

        }
    }

    static void star5(int n) throws Exception{
        for(int i=0;i<n;i++)
        {
            for(int j =0 ;j<n;j++){
                if(true) System.out.print(i+" ");
                else System.out.print("  ");
                Thread.sleep(150);
            }
            System.out.println();

        }
    }

    static void star6(int n) throws Exception{
        for(int i=0;i<n;i++)
        {
            for(int j =0 ;j<n;j++){
                if(true) System.out.print(j+" ");
                else System.out.print("  ");
                Thread.sleep(150);
            }
            System.out.println();

        }
    }

    static void star7(int n) throws Exception{

        char x = 'A';
        for(int i=0;i<n;i++)
        {
            for(int j =0 ;j<n;j++){
                if(true) System.out.print((x++)+" ");
                else System.out.print("  ");
                Thread.sleep(150);
            }
            System.out.println();

        }
    }

    static void star8(int n) throws Exception{
        for(int i=0;i<n;i++)
        {
            char x = 'A';
            for(int j =0 ;j<n;j++){
                if(true) System.out.print((x++)+" ");
                else System.out.print("  ");
                Thread.sleep(150);
            }
            System.out.println();

        }
    }

    static void startriangle1(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= j) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();

        }
    }

        static void startriangle2(int n){

            for(int i=0;i<n;i++)
            {
                for(int j =0 ;j<n;j++){
                    if(i<=j) System.out.print("* ");
                    else System.out.print("  ");
                }
                System.out.println();

            }

        }

    static void startriangle3(int n){

        for(int i=0;i<n;i++)
        {
            for(int j =0 ;j<n;j++){
                if(i+j>=n-1) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();

        }

    }

    static void startriangle4(int n){

        for(int i=0;i<n;i++)
        {
            for(int j =0 ;j<n;j++){
                if(i+j<=n-1) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();

        }

    }

    static void startriangle5(int n){
        for(int i=0;i<n;i++){
            int x = 1;
            for(int j=0;j<n;j++){
                if(i+j>=n-1) System.out.print((x++)+" ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    static void startriangle6(int n){
        for(int i=0;i<n;i++){
            char x = 'A';
            for(int j=0;j<n;j++){
                if(i+j>=n-1) System.out.print((x++)+" ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    static void startriangle7(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j>=n-1) System.out.print((j%2==0)? "0 ":"1 ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }



}
