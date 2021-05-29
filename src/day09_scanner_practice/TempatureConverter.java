package day09_scanner_practice;

import java.util.Scanner;

public class TempatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("***  Tempature Converter ***");
        System.out.println("Enter fahrenheit value : ");

        double fahrenheit = input.nextDouble();
        double celcius = (fahrenheit - 32) *5/9;

        System.out.println(fahrenheit  + " in fahrenheit is " + celcius);



    }
}
