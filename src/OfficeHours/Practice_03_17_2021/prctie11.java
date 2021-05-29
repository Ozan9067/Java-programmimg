package OfficeHours.Practice_03_17_2021;

import java.util.Scanner;

public class prctie11 {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of coupons:");
        int coupons = scan.nextInt();

        if (coupons < 3) {
            System.out.println("Not enough coupons");
        } else {

            int candyCount = coupons / 10;
            int remainingCoupons = coupons % 10;
            int gumballCount = remainingCoupons / 3;

            System.out.println("Numer of candies: " + candyCount);
            System.out.println("Number of Gumballs: " + gumballCount);


        }


    }
    }
