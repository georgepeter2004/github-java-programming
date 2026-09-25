package basicproblems;

public class ToggleCase {
    public static void main(String[] args) {
        String s = "JaVa";
        String r = "";

        for (char ch:s.toCharArray()){
            if (Character.isLowerCase(ch)){
                r += Character.toUpperCase(ch);
            }
            else {
                r += Character.toLowerCase(ch);
            }
        }

        System.out.println(r);
    }
}
