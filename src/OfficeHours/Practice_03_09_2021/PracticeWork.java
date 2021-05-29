package OfficeHours.Practice_03_09_2021;

import java.util.Scanner;

public class PracticeWork {
    public static void main (String[] ags){

        long a = 3_0000L;
        double b =(float) a;
        System.out.println(a);





    }

    public static class MovieDuration {

        public static void main(String[] args){

            Scanner input = new Scanner(System.in);
            System.out.println("Enter the length of the movie :");

            double movieLength = input.nextDouble();
            double price = 0;

            if (movieLength == 1){
                price = 8.99;
                System.out.println("price = " + 8.99);
            }

            if (movieLength == 1.5){
                price = 10.50;
                System.out.println("price = " + 10.50);
            }

            if (movieLength == 2.0){
                price = 12.99;
                System.out.println("price = " + 12.99);
            }
            if (movieLength == 2.5){
                price = 14.50;
                System.out.println("price = " + 14.50);
            }

            if (movieLength >= 3.0){
                price = 15.99;
                System.out.println("price = " + 15.99);
            }






        }

    }

    public static class MovieDuration2 {
        public static void main(String[] args){

            Scanner input = new Scanner(System.in);
            System.out.println("Enter the length of the movie :");

            double movieLength = input.nextDouble();
            double price = 0;

            if (movieLength == 1){
                price = 8.99;
            }

            if (movieLength == 1.5){
                price = 10.50;
            }

            if (movieLength == 2.0){
                price = 12.99;
            }
            if (movieLength == 2.5){
                price = 14.50;
            }

            if (movieLength >= 3.0){
                price = 15.99;
            }
            if (movieLength <= 0){
                System.out.println("Invalid Length");
            }else{
                System.out.println("price " + price);

            }


        }
    }
}
