package basicproblems;

public class CountVowelsnConsonants {
    public static void main(String[] args) {
        String s = "hello".toLowerCase();
        int vowels = 0;
        int consonants = 0;

        for (int i = 0 ; i<s.length();i++){
            char ch = s.charAt(i);
            if ("aeiou".indexOf(ch) != -1){
                vowels++;
            }
            else consonants++;
        }

        System.out.println("vowels:"+vowels+"\nconsonants:"+consonants);

    }
}
