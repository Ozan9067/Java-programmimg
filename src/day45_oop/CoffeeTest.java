package day45_oop;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();
        System.out.println("coffee amount = " + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("amount after refill = " + myCoffee.getAmount());
        myCoffee.drink(10);
        System.out.println("amount after drink 10 = " + myCoffee.getAmount());
        //myCoffee.type = "turkish coffee";
        // use method
        myCoffee.setType("Turkish Coffee");
        System.out.println("my coffee = " + myCoffee.getType());

        //describe my coffee
        System.out.println(myCoffee.toString());

        //add another coffee object, set valies and call methods

        Coffee coffee1 =  new Coffee();
        coffee1.setType("cappuccino");
        System.out.println("coffee1 type = " + coffee1.getType());

        Coffee coffee2 = coffee1;

        System.out.println("coffee2 type = " + coffee2.getType());

        coffee2.setType("Expresso");

        Coffee coffee3 = new Coffee();
        coffee3.setType("Frappuccino");

        coffee3 = coffee2;

        Coffee coffee4 = null;  //reference table does not refer/point to any object in HEAP
        coffee4.setType("turkish");  // null point expection


    }
}
