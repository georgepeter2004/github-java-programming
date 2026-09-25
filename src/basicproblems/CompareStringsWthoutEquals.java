package basicproblems;

public class CompareStringsWthoutEquals {
    public static void main(String[] args) {
        String s1="listen",s2="listen";
        boolean equals = false;
        if (s1.length()!=s2.length()) equals=false;
        else {
            equals = true;
            for (int i=0;i<s1.length();i++){
                if (s1.charAt(i)!=s2.charAt(i)){
                    equals = false;
                    break;
                }
            }
        }
        System.out.println(equals);
    }
}
