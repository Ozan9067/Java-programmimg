package day12_comparison_operators;

import java.util.jar.JarOutputStream;

public class IfElseStatement {
    public static void main (String[] args){

        if(10>5){
            System.out.println("Condition is true");
        }else{
            System.out.println("Condition is false");
        }

        int count =25;
        // check if count is mora than 30. if yes print "count is more than 30" otherwise print opposite

        if (count>30) {
            System.out.println("count is more than 30");
        }else {
            System.out.println("count is less than 30");
        }

        byte age = 17;
        if(age >= 18 ){
            System.out.println("you are eligible to vote");
            System.out.println("Age is greater or equal to 18");
        }else{
            System.out.println("you are too young to vote");
            System.out.println("age is less than 18");
        }

        int drinkingAge = 20;
        if (drinkingAge > 21){
            System.out.println("You are old enough to drink");
            System.out.println("time to get wasted");
        }else {
            System.out.println("You are too young to drink");
            System.out.println("sorry");
        }

    }
}
