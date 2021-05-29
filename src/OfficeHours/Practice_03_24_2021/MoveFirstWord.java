package OfficeHours.Practice_03_24_2021;

//putting the first word at the end of the sentence

public class MoveFirstWord {
    public static void main(String[] args) {

        String str = "java is a fun language";
        int space = str.indexOf(" ");
        String firstWord = str.substring(0, space);

        System.out.println(str.substring(space + 1) + " " + firstWord);




    }
}
