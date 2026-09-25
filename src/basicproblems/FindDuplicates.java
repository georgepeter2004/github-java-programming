package basicproblems;

public class FindDuplicates {
    public static void main(String[] args) {
        String s = "Programming";

        for (int i = 0;i<s.length();i++){
            int count = 1;
            for (int j = i+1;j<s.length();j++){
                if(s.charAt(i) == s.charAt(j)){
                    count++;
                }
            }

            boolean visited = false;
            for (int k = 0;k<i;k++){
                if (s.charAt(i) == s.charAt(k)){
                    visited = true;
                    break;
                }

            }
            if (!visited && count>1) System.out.println(s.charAt(i)+":"+count);
        }
    }
}
