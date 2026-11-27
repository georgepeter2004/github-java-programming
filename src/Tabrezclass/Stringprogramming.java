package Tabrezclass;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Stringprogramming {
    public static void main(String[] args) {
//        isPangram("The Quick Brown Fox Jumps Over the Lazy Dog");

    }

    static void printLen(String n) {
        System.out.println(n.length());//length of string will print
    }

    static void extractCharacter(String n) {
        System.out.println(n.charAt(3));//3rd index of char print
    }

    static void readString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int n = sc.nextInt();
        //next(); it will read only single word or String
        sc.nextLine();//nextLine() will read Entire line
        System.out.print("\nEnter your name: ");
        String s = sc.nextLine();

        System.out.print("\nID: " + n + "\nName: " + s);
    }


    static void compareString(String s1, String s2) {
        System.out.println(s1.equals(s2));
    }

    static void isPalindrome(String s) {
        s.toLowerCase();
        String res = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            res += s.charAt(i);
        }
        System.out.println(s.equals(res));
    }

    static char[] convertintoCharArray(String s) {
        return s.toCharArray();
    }

    static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        char[] s = s1.toCharArray();
        char[] m = s2.toCharArray();
        Arrays.sort(s);
        Arrays.sort(m);
        return Arrays.equals(s, m);
    }

    static void isPangram(String n) {
        char a[] = n.toLowerCase().toCharArray();
        int r[] = new int[26];

        int in = 0;
        for(int i=0;i<n.length();i++){
            if(a[i]!=' '){
                r[a[i]]++;
            }
        }

    }

    static void characterFrequency(){
        String n = "aaaabbbaaccc";
        char a[] = n.toCharArray();

    }

    static void addChar(){
        String s = "Sy84e1d";
        int n = 0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                n += (s.charAt(i)-'0');
            }
            else continue;
        }
        System.out.println(n);
    }

    static void convertLowerCasetoUpperCase(){
        String s = "SyEdTaBREz";
        String n = "";
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))) n+=s.toLowerCase().charAt(i);
            if(Character.isLowerCase(s.charAt(i))) n+=s.toUpperCase().charAt(i);

        }

        System.out.println(n);
    }
}
