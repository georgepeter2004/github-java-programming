package basicproblems;

public class CountWords {
    public static void main(String[] args) {
        String s = "     Java   is   Fun    ";
        String words[] = s.trim().split("\\s+");
        System.out.println(words.length);
    }
}
