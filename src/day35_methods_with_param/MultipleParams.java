package day35_methods_with_param;

import java.util.*;
public class MultipleParams {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two doubles: ");
        double d1 = scan.nextDouble();
        double d2 = scan.nextDouble();


        showSum(d1,d2);
        //showSum(5.6,100.5);

    }

    public static void showSum(double num1, double num2){
        double sum = (num1 + num2);
        System.out.println("The sum of num1 and num2 is: " + sum );
    }





}
