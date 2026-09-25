package basicproblems;

public class LargestwordinString {
    public static void main(String[] args) {
        String s = "Java is a Powerful Programming Language";
        String[] words = s.split(" ");
        String largest = "";
        for (String word:words){
            if(word.length()>largest.length()){
                largest=word;
            }
        }
        System.out.println(largest);
    }
}
