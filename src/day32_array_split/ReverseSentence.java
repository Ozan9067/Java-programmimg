package day32_array_split;


import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String word = "java is fun";
        String[] wordArray = word.split(" ");
        String reversed = "";

        for (int i = wordArray.length-1 ; i >=0;i-- ){

            //System.out.print(wordArray[i] + " ");
            reversed += wordArray[i] + " ";
        }
        System.out.println("sentence = " + word);
        System.out.println("reversed = " + reversed.trim());


        String n = "java";
        String[] x = n.split("");
        System.out.println(Arrays.toString(x));



    }
}
