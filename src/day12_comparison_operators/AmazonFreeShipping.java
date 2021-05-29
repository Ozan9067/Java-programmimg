package day12_comparison_operators;

import java.util.Scanner;

public class AmazonFreeShipping {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Total Price");

        double totalPrice = scan.nextDouble();

        if (totalPrice >= 25){
            System.out.println("Free shipping fam");
        }else{
            System.out.println("no free shipping fam");
        }

    }
}
