package OfficeHours.Practice_03_24_2021;

//finding the middle number with odd and even numbers

public class MiddleChar {
    public static void main(String[] args) {

        String word = "even";

        if(word.length()%2 ==1){
            System.out.println(word.charAt(word.length()/2));
            System.out.println(word.substring(word.length()/2, word.length()/2 +1));

        }else {
            int index = word.length()/2;
            System.out.println(word.charAt(index -1 )+""+ word.charAt(index));
            System.out.println(word.substring(index - 1, index + 1));


        }







    }
}
