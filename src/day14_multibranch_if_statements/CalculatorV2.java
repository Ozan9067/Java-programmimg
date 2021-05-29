package day14_multibranch_if_statements;

import java.util.Scanner;

public class CalculatorV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(" enter 2 numbers  - ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();


        System.out.println("ENTER OPERATOR : - + * /");
        char operator = scan.next().charAt(0);



        if (operator == '+'){
            System.out.println(num1 + num2);
        }else if (operator == '-'){
            System.out.println(num1 - num2);
        }else if (operator == '*'){
            System.out.println(num1 * num2);
        }else if (operator == '/'){
            System.out.println(num1 / num2);
        }else {
            System.out.println("Invalid operator = " + operator);
        }

    }
}
