package day20_string_manipulation;

public class StringReplace {
    public static void main(String[] args) {

        String  word = "Oman";

        System.out.println(word.replace("m","z"));


        String sentence = "java strings are fun";
        System.out.println(sentence);
        System.out.println(sentence.replace("strings","conditions"));

        System.out.println(sentence.replace("java", ""));



    }
}
