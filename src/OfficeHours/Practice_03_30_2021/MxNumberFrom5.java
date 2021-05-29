package OfficeHours.Practice_03_30_2021;

/*
[Max and Min from 5 numbers]
• Write a program that can ask the user "enter a number" five times
and return the maximum number
• Write a program that can ask the user "enter a number" five times
and return the minimum number
 */
import java.util.*;

public class MxNumberFrom5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = 0;

        for (int i = 0; i<5 ;i++){
            System.out.println("enter a number");
            int number = input.nextInt();

            if (number > max){
                max = number;
            }


        }
        System.out.println(max);








    }
}
