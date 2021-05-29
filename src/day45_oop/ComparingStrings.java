package day45_oop;

public class ComparingStrings {
    public static void main(String[] args) {

        String word1 = "java"; // in string pool
        String word2 = "java";  // re-use from string pool
        String word3 = new String("java"); //created in HEAP
        String word4 = new String("java"); //created new in HEAP

        System.out.println(word1 == word2);// true
        System.out.println(word1 == word3);//false

        System.out.println(word2 == word4);//false

        //.equals -- ALL TRUE


    }
}
