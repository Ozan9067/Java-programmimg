package day12_comparison_operators;

public class ComparisonExamples {
    public static void main(String[] args){

        int currentSpeed = 45;
        int speedLimit = 55;
        boolean isSpeeding = speedLimit < currentSpeed;
        System.out.println("Are you speeding? " + isSpeeding);
        System.out.println("current speed = " + currentSpeed + "mph");
        System.out.println("speed limit = " + speedLimit + "mph");


        // starts speeding

        currentSpeed +=20;
        System.out.println("current speed = " + currentSpeed + "mph");

        double accountBalance = 250.25;
        double itemPrice = 200;
        System.out.println("Can I afford it? " + (accountBalance >= itemPrice));

        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("can afford  = " + canAfford);

        //decrease balance

        accountBalance = accountBalance - itemPrice ;
        //accountBalance -= itemPrice;     -same thing

        boolean isBroke =  accountBalance <= 0;
        System.out.println("Am I broke? " + isBroke);












    }
}
