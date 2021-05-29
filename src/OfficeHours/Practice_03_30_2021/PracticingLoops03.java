package OfficeHours.Practice_03_30_2021;

/*
Write a program that can calculate the sum of all the even numbers between 1 ~ 100
 */
public class PracticingLoops03 {
    public static void main(String[] args) {

        int number = 100;
        int count = 0;
        int total = 0;


        while(count <= number){
            //System.out.print(count + ", ");
            count +=2;

            if (count>0 || count <=100){
                total = total +count;
            }

        }

        System.out.println("sum of even numbers 1-100 - " + total);









    }
}
