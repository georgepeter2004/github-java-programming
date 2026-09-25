package basicproblems;

public class RemoveLetter {
    public static void main(String[] args) {
        String s = "Banana",r="";
        char ch = 'a';
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)!=ch){
                r+=s.charAt(i);
            }
        }
        System.out.println(r);
    }
}
