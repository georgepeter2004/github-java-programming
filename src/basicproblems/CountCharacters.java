package basicproblems;

public class CountCharacters {
    public static void main(String[] args) {
        String s ="Java@123";
        int letter,number,special;
        number = 0;
        letter = 0;
        special = 0;
        for (int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if (Character.isDigit(ch)){
                number++;
            } else if (Character.isLetter(ch)) {
                letter++;
            }
            else special++;
        }
        System.out.printf("Letter:%d\nNumber:%d\nSpecial:%d",letter,number,special);
    }
}
