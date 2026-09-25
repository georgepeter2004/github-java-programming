package basicproblems;

public class StrPalindrome {
    public static void main(String[] args) {
        String s = "madam";
        String rev = "";

        for (int i = s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        System.out.println(s.equals(rev));
        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String s){
        int left=0;
        int right=s.length()-1;

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
