package day07_arithmetic_operations_casting;

public class OperatorPrecedence {
    public static void main (String[] args){
        System.out.println(10+5);
        System.out.println(10 + 5 - 3); //12
        System.out.println(10 + 5 - 3);
        System.out.println(10 - (5 + 3));

        System.out.println(2*3); // 6
        System.out.println(2*3/3); //2
        System.out.println(20 / (2*2)); //5
       // System.out.println(10/0);     YOU CANT DIVIDE BY 0 EVER

        System.out.println(2+5 *3); //17     MULTIPICATION FIRST
        System.out.println((2+5) * 3); //21

        System.out.println(10/3); // 3   java keeps the change

        // when you divide 2 whole numbers, result is ALWAYS a whole number.

        //YOU  MUST USE DECIMAL POINTS TO DIVIDE

        System.out.println(10.0 / 3.0);






    }
}
