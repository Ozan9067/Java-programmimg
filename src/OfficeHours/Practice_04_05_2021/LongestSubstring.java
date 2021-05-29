package OfficeHours.Practice_04_05_2021;
/*
Biggest substring of matching characters
Given a String find the biggest substring of chars that match and print it.
Ex: aaabbbcccccddddee Output: ccccc
 */

public class LongestSubstring {
    public static void main(String[] args) {
        String str = "aaabbbcccccddddee";
        String longestSubstring = "";
        String temp = "";

        for (int i = 0 ; i < str.length(); i++){

            temp +=str.charAt(i);
            System.out.println(temp);

        }








    }
}
