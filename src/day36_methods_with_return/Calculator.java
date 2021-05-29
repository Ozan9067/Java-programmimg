package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("addition += " + add(2,5));
        double sum = add(4,6);
        System.out.println(sum);

        System.out.println("subtraction = "+minus(2,5));
        System.out.println("multipication = "+multiply(2,5));
        System.out.println("division = " + divide(2,5));

        System.out.println(addition(4,5));


    }

    public static double add(double num1, double num2){
        double sum = num1 + num2;
        return sum;
    }
    public static double minus(double num1, double num2){
        double sum = num1 - num2;
        return sum;
    }
    public static double multiply(double num1, double num2){
        double sum = num1 * num2;
        return sum;
    }
    public static double divide(double num1, double num2) {
        double sum = num1 / num2;
        return sum;
    }

    public static double addition (double num1, double num2){
        double sum = num1+num2;
        System.out.print("this one ");
        return sum;

    }



}
