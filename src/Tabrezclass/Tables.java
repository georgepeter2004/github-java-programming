package Tabrezclass;

public class Tables {
    public static void main(String[] args) {
        int start = 3, end = 5;

        tables2(start,end);
       // tables1(start,end);


    }

    static void tables1(int start,int end){
        while (start <= end) {

            for (int j = 1; j <= 10; j++) {
                System.out.println(start + "x" + j + "=" + start * j);
            }

            System.out.println();
            start++;
        }
    }

    static void tables2(int start,int stop){
        for(int i=1;i<=10;i++){
            for(int j=start;j<=stop;j++){
                System.out.print(j+"x"+i+"="+j*i+"\t");
            }
            System.out.println();
        }
    }
}
