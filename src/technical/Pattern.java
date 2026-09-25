package technical;

public class Pattern {
    public static void main(String[] args) {

        int num = 5;
        int row,col;
        for(row=1;row<=num;row++,
        System.out.println()){
            for (col=1;col<=num;col++) {
                if (num==5){
                    if(row == 1 ||row == 2 ||row == 4 ||row == 5 ||col + row != 6){
                        System.out.print(1+" ");}
                        else{
                            System.out.print(0 + " ");
                        }
                    } else if (row == 1 || row == 2 || row == 5 || col == 1 || col == 2 || col == 5 || col == num || row == num) {
                        System.out.print(1+" ");
                    }
                    else {
                        System.out.print(0+" ");
                    }
                }
            }

        }
    }

