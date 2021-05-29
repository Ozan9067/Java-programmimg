package day32_array_split;
import java.util.*;

public class SplitMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        //Write your code below






        String[] emailID = email.split("@");


        //System.out.println("Email id: " + emailID[0]);
        //System.out.println("Email domain: " + emailID[1]);

        if(!email.contains("@")){
            System.out.println("invalid email");

        }else if (email.contains("@")){
            System.out.println("invalid email");


        }else{
            System.out.println("Email id: " + emailID[0]);
            System.out.println("Email domain: " + emailID[1]);


        }



        String sentence = "today i am coding java arrays";

        String[] sentenceArray = sentence.split(" ");
        System.out.println(Arrays.toString(sentenceArray));
        System.out.println(sentenceArray.length);

        for(int i = 0 ; i < sentenceArray.length ; i++){
            System.out.println(sentenceArray[i]);
        }











    }
}
