//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1;
        for(int i=1;i<=10;i++){
            System.out.print(n1+" ");
            int n3 = n1+n2;
            n1=n2;
            n2=n3;
        }

    }

}