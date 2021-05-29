package day36_methods_with_return;

import java.util.*;

public class Info {
    public static void main(String[] args) {
        System.out.println("full name = " + fullName());
        System.out.println("is married = " + isMarried());
        System.out.println("age = " + age());

        System.out.println("birth year = " + getRandomYear());
        System.out.println(getRandomYear());

        String name = fullName();
        boolean marriageStatus = isMarried();
        int age = age();
        int year = getRandomYear();

        System.out.println("name = " + name);
        System.out.println("isMarried = " + isMarried());
        System.out.println("age = " + age);
        System.out.println("year = " + year);

    }

    public static String fullName(){
        System.out.println("ozan unal");
        return "Ozan Unal";
    }

    public static boolean isMarried(){
        return false;
    }

    public static int age(){
        int age = 30;
        return age;
    }

    public static int getRandomYear(){
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }



}
