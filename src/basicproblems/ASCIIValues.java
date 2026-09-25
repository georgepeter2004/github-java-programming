package basicproblems;

public class ASCIIValues {
    public static void main(String[] args) {
        String s = "Aabc";
        for (int i=0;i<s.length();i++){
            System.out.println(s.charAt(i)+"->"+(int)(s.charAt(i)));
        }
    }
}
