package basicproblems;

public class ReverseWord {
    public static void main(String[] args) {
        String s = "java is Programming Language";
        String arr[] = s.split(" ");

            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i]+" ");
            }
    }
}
