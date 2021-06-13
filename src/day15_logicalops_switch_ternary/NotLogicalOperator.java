package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true) );
        System.out.println("!false = " +(!false));


        int age = 20;

        if (!(age > 7)){
            System.out.println("need to sit in the car seat, age = " + age);
        }else {
            System.out.println("no need for a car seat, age = " + age);
        }


        boolean isSmokingAllowed = false;

        if (!isSmokingAllowed){
            System.out.println("Smoking is allowed ");
        }else {
            System.out.println("no smoking");
        }


        boolean isAffordable = false;

        if (!isAffordable){
            System.out.println("Item not affordable");
        }else {
            System.out.println("Item affordable");
        }


        String env = "qa";
        if (env.equals("qa")){
            System.out.println("in wrong environment");
        }


        String carModel = "day53_inheritance/Tesla";
        // if its not a tesla im not interested
        if (!carModel.equals("day53_inheritance/Tesla")){
            System.out.println("not interested, thank you");
        }

        String secretPassword = "abc123";
        String inputPassword = "abc321";
        if (!inputPassword.equals("abc123")){
            System.out.println("incorrect password");
        }



        if (!inputPassword.equals(secretPassword)){
            System.out.println("incorrect password");
        }



        if (inputPassword.equals("abc123")) {
            System.out.println("Correct password");
        } else {
            System.out.println("In correct password");
        }


    }
}
