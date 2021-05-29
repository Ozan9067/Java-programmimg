package day26_loops;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class PrintChars {
    public static void main(String[] args) {

        String word = "java";
        System.out.println(word.length());

        //System.out.println(word.charAt(0));
        //System.out.println(word.charAt(1));
        //System.out.println(word.charAt(2));
        //System.out.println(word.charAt(3));

        for (int i = 0 ; i <word.length(); i++){
            System.out.println(word.charAt(i));
        }





        String word2 = "application";
        System.out.println(word2.length());

        for (int i = word2.length() - 1 ; i >=0; i--){
            System.out.print(word2.charAt(i));
        }
















    }
}
