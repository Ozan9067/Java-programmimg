package day36_methods_with_return;
/*
add new Calculations
add main method
call Calculator class methods there
 */

public class Calculations {
    public static void main(String[] args) {
        System.out.println("add- 10 +45 = " + Calculator.add(10,45));
        System.out.println("minus- 10 - 45 = " + Calculator.minus(10,45));
        System.out.println("division- 10/45 = " + Calculator.divide(10,45));
        System.out.println("multipication- 10*45 = " + Calculator.multiply(10,45));
        
        double d1 = 234.3;
        double d2 = 321.5;
        double result = Calculator.minus(d1,d2);
        System.out.println("result = " + result);

        System.out.println(Calculator.addition(5,444));

    }




}
