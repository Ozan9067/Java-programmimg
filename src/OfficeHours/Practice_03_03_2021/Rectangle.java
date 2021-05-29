package OfficeHours.Practice_03_03_2021;
/*
Make a class Rectangle
create a main method

     - Declare two variables: length and width

         - Calculate the Perimeter 2(l*w)
         - Calculate the Area (w * l)

     - Print properties of the Rectangle

     - Modify to accept Scanner inputs
 */


import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);

        System.out.println("ENTER LENGTH AND WIDTH - ");

        int length =scan.nextInt();
        int width =scan.nextInt();

        int Perimeter = (2*(length * width));
        int Width = width * length;

        System.out.println("Peremieter = " + Perimeter);
        System.out.println("Width = " + width);




    }
}
