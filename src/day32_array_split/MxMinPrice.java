package day32_array_split;

import java.util.*;

public class MxMinPrice {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};

        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(itemIDs));



        System.out.println("-----find and print details on most expensive-----------");

        double maxPrice = prices[0];
        int n = 0;
        for (int i = 0; i <prices.length ; i++){

            if (prices[i] > maxPrice){

                maxPrice = prices[i];
                n = i;

            }

        }
        System.out.println("max price is - $" + maxPrice + " and item is - " + items[n]);





        System.out.println("-----find and print details on least expensive-----------");
        double minPrice = prices[0];
        int x =0;
        for (int i = 0 ; i<prices.length ; i++){

            if(prices[i] < minPrice){
                minPrice =prices[i];
                x=i;

            }

        }
        System.out.println("min price is - $"+minPrice + " and the item is - " +items[x]);








    }
}
