package basicproblems;

public class OccurenceLetter {
    public static void main(String[] args) {
        String s = "Programming";
        char ch = 'g';
        int count=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==ch){
                count++;
            }
        }
        System.out.println(count);
    }
}
