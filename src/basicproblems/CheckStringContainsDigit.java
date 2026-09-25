package basicproblems;

public class CheckStringContainsDigit {
    public static void main(String[] args) {
        String s = "ja12a";
        boolean flag = false;
        for (int i =0;i<s.length();i++){
            if (Character.isDigit(s.charAt(i))){
                flag = false;
                break;
            }
            else flag=true;
        }
        System.out.println(flag);
    }
}
