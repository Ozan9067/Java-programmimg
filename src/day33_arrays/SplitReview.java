package day33_arrays;
import java.util.Arrays;
public class SplitReview {
    public static void main(String[] args) {
        String word = "java";
        String[] word1 = word.split("a");
        System.out.println(word1.length);
        
        int countOfA = word1.length;
        System.out.println("countOfA = " + countOfA);



        String word3 = "java";
        String[] strArr = word3.split("");
        System.out.println(Arrays.toString(strArr));

        System.out.println("-------------split with empty string-------------------");
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);




        String word7 = "java1html2sql";
        String[] word8 = word7.split("\\d");
        System.out.println(Arrays.toString(word8));

        word7 = word7.replaceAll("\\d", "-");
        System.out.println("word7 = " + word7);



        //CREATE PASSWORD
        String password = "bcTd123_5";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }





    }
}
