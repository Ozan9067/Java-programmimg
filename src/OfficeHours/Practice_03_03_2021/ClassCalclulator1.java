package OfficeHours.Practice_03_03_2021;
/*
Make a class Stage1Calculator
create a main method

    - Declare two double variables
    - Declare 5 more double variables for each operation.
        > Execute all the operation between the first two numbers
    - Print out operations
        Ex: if the nums are 5 and 10
            5 + 10 = 15
            5 - 10 = -5
            etc..
 */

public class ClassCalclulator1 {
    public static void main(String[] args){
            double num1 = 7;
            double num2 = 5;

            double num3 = 6;
            double num4 = 3;
            double num5 = 2;
            double num6 = 1;
            double num7 = 4;

            int num8 = (int) num1;
            int num9 = (int) num6;

            int num10 = num8 + num9;
            int num11 = num8 - num9;
            int num12 = num8 / num9;
            int num13 = num8 % num9;


            System.out.println( num8 + " + " + num9 + " = " + num10);
            System.out.println( num8 + " - " + num9 + " = " + num11);
            System.out.println( num8 + " / " + num9 + " = " + num12);
            System.out.println( num8 + " % " + num9 + " = " + num13);







    }



}
