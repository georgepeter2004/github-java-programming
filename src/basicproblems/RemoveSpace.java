package basicproblems;

public class RemoveSpace {
    public static void main(String[] args) {
        String s="J A       V     A";

        s = s.replaceAll("\\s","");
        System.out.println(s);
    }
}
