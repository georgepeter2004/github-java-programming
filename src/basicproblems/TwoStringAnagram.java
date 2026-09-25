package basicproblems;

import java.util.Arrays;

public class TwoStringAnagram {
    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";

        char[] aa = a.toCharArray();
        char[] bb = b.toCharArray();

        Arrays.sort(aa);
        Arrays.sort(bb);

        System.out.println(Arrays.equals(aa,bb));

    }
}
