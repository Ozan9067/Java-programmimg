package OfficeHours.Practice_04_21_2021;
import java.util.*;

public class replitPractice {
    public static void main(String[] args) {

        //method2("The sun set quickly and created a shadow");
        System.out.println(method3(50));

    }

    public static void method2(String s){
        String a = s.substring(10);

        if(a.length()> s.length()){
            System.out.println(a);
        }else {
            System.out.println(s);
        }

    }

    public static String method3(int num){

        if(num <0) {
            return "less than 0";
        }else if (num < 50){
            return " less than 50";
        }else if (num < 100){
            return "less than 100";
        }else {
            return "other";
        }

    }




}














































