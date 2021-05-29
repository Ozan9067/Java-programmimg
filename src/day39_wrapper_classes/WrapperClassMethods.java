package day39_wrapper_classes;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10,5));
        System.out.println(Integer.sum(50, 35));
        System.out.println(Integer.min(2,1645));
        System.out.println("MIN INT = " + Integer.MIN_VALUE );
        System.out.println("MAX INT = " + Integer.MAX_VALUE );

        System.out.println(Double.max(22.4, 223143.34));
        System.out.println("MIN_DOUBLE = " + Double.MIN_VALUE);
        System.out.println("MAX_DOUBLE = " + Double.MAX_VALUE);


        System.out.println(Double.compare(5,1));
        System.out.println(Double.compare(5,5));
        System.out.println(Double.compare(5,45));


        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isDigit('v'));
        System.out.println(Character.isAlphabetic('Q'));
        System.out.println(Character.isLetter('R'));
        System.out.println(Character.isLetter('9'));

        char letter = 'a';
        if (Character.isUpperCase(letter)){
            System.out.println("it is uppercase");
        }else {
            System.out.println("not uppercase ");
        }






        String word = "jaVa Vs Fun";
        for ( int i = 0 ;  i <word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                System.out.print(word.charAt(i));
            }

        }
        System.out.println(Character.MIN_VALUE);


        System.out.println(Boolean.TRUE);




        String total = "345";
        int count = Integer.parseInt(total);
        System.out.println(count);

        String strPrice = "123.99";
        double count1 = Double.parseDouble(strPrice);

        System.out.println(strPrice);







    }
}
