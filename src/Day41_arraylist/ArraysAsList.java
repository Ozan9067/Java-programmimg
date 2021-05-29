package Day41_arraylist;

import java.util.*;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23, 17, 8, 3, 6, 24, 10);
        System.out.println("nums = " + nums);
        //nums.add(100);  cant add or remove  or clear when it comes form asList


        List<Integer> numsList = new ArrayList<>(Arrays.asList(4,2,4,55654,76));
        numsList.add(33);
        numsList.add(56);

        System.out.println("numsList = " + numsList);
        
        //remove 76
        numsList.remove(new Integer(76));
        System.out.println("numsList = " + numsList);

        /**
         List String drinksWithCaffeine -> coffee, tea, monster, red bull, coke, pepsi, mdew, kambucha

         */

        ArrayList<String> drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee", "tea", "monster", "red bull",
                "coke", "pepsi", "mdew", "kambucha", "celcius"));

        System.out.println(drinksWithCaffeine);

        int caffeineAmount = 0;

        for(String drink : drinksWithCaffeine){
            if(drink.equals("monster") || drink.equals("red bull") || drink.equals("celcius")){
                caffeineAmount = 150;
                System.out.println(drink + " --> " + caffeineAmount);
            }else if (drink.equals("coffee") || drink.equals("kambucha") ){
                caffeineAmount = 112;
                System.out.println(drink + " --> " + caffeineAmount);
            }else if(drink.equals("tea") || drink.equals("coke") || drink.equals("pepsi") || drink.equals("mdew")){
                caffeineAmount = 35;
                System.out.println(drink + " --> " + caffeineAmount);
            }
        }



        for(String drink : drinksWithCaffeine){
            switch(drink){
                case "monster": case "red bull": case"celcius":
                    caffeineAmount = 150;
                    System.out.println(drink + " --> " + caffeineAmount);
                    break;
                case "coffee": case "kambucha":
                    caffeineAmount = 112;
                    System.out.println(drink + " --> " + caffeineAmount);
                    break;
                case "tea": case " coke": case "pepsi": case "mdew":
                    caffeineAmount = 35;
                    System.out.println(drink + " --> " + caffeineAmount);
                    break;


            }

        }

        System.out.println("------------------------------------------------------------------");

        drinksWithCaffeine.forEach(drink -> System.out.println(drink));

        drinksWithCaffeine.forEach(each -> {
            System.out.println("----this is forEach block-----");
            System.out.println("drink = " + each);
        });

        List<Integer> nums1 = Arrays.asList(2,4,5);
        nums1.forEach(n -> System.out.println(n * n ));











    }
}
