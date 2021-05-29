package day19_class_vs_object_strings;

public class StringCaseConversion {
    public static void main(String[] args) {


        String word ="Thriller";

        System.out.println(word.toLowerCase());

        System.out.println(word.toUpperCase());

        System.out.println("JAVA".toLowerCase());

        word.toLowerCase();
        System.out.println(word); //Thriller

        String wordInLCase = word.toLowerCase();
        System.out.println("wordInLCase = " + wordInLCase);

        word = word.toLowerCase();
        System.out.println("word =  " + word);


        String comapny = "Amazon ";
        System.out.println(comapny.toUpperCase());








    }
}
