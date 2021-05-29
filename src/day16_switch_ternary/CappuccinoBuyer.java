package day16_switch_ternary;

public class CappuccinoBuyer {
    public static void main(String[] args) {

        String size = "grande";
        double price = 0;
        int calories  = 0;

        switch (size){
            case "tall":
                System.out.println("tall cappuccino");
                price = 3.69;
                calories = 90;
                break;
            case "grande":
                System.out.println("grande cappuccino");
                price = 3.99;
                calories = 120;
                break;
            case "venti":
                System.out.println("venti cappuccino");
                price = 4.29;
                calories =150;
                break;
            default:
                System.out.println("we dont serve that size");

        }


        System.out.println("Total price is = $" + price );
        System.out.println("You will consume " + calories + " cals of energy");





    }
}
