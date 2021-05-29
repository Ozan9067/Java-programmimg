package OfficeHours.Practice_03_30_2021;

/*
[Dynamic alphabet]
• Write a program that will ask ‘upper’ or ‘lower’
• If it is upper: print the alphabet in all uppercase letter from A to Z • If it is lower: print the alphabet in all uppercase letter from a to z
- Challenge: Also ask if they want to show the alphabet in ascending or order descending
- Ascending:A–Zora–z
- Descending:Z–Aorz–a
 */
import java.util.*;
public class DynamicLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("do you want uppercase or lowercase");
        String upperOrLower = input.next();

        System.out.println("do you want it in ascending or descending order");
        String ascendOrDescend = input.next();



        int starting ;
        int ending ;


        if (upperOrLower.equals("uppercase")){
            starting = 'A';
            ending = 'Z';
        }else{
            starting = 'a';
            ending  = 'z';

        }



        if (ascendOrDescend.equals("ascending")){

            for(int i = starting; i <=ending; i++){
                System.out.print((char)i + " ");
            }

            }else {

            for(int i = ending; i <=starting; i++){
                System.out.print((char)i + " ");
            }


        }











    }
}
