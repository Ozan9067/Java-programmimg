package day40_arraylist;
import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {

        List<String> shoppingList = new ArrayList<>();
        System.out.println("shoppingList.size() = " + shoppingList.size());
        System.out.println("isEmpty? = " + shoppingList.isEmpty());

        if (shoppingList.isEmpty()) {
            System.out.println("list is empty");
        }else {
            System.out.println("list is not empty");
        }


        shoppingList.add("shoes");
        shoppingList.add("cheap monitor");
        shoppingList.add("mask");
        shoppingList.add("wooden spoon");
        shoppingList.add("scooter");
        shoppingList.add("java book");
        shoppingList.add("tesla");


        if (shoppingList.isEmpty()) {
            System.out.println("list is empty");
        }else {
            System.out.println("list is not empty");
        }

        int count = shoppingList.size();
        System.out.println("items to buy = " + count);

        System.out.println("are shoes on my shopping list? "  + shoppingList.contains("shoes"));

        if(shoppingList.contains("shoes")){
            System.out.println("shoes are on the list");
        }else {
            System.out.println("shoes are not on the list");
        }

        System.out.println("buying shoes....$80");

        shoppingList.remove("shoes");
        System.out.println(shoppingList);

        System.out.println("done shopping, get back to coding");
        shoppingList.clear();
        System.out.println(shoppingList); 










    }
}
