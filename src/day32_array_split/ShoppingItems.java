package day32_array_split;

public class ShoppingItems {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};


        System.out.println("--------find the index of gloves in items array--------------");

        for (int i = 0; i<items.length ;i++){

            if (items[i].equals("Gloves")){
                System.out.println("index of gloves - " + i);
                break;
            }

        }

        System.out.println("----------set boolean to true if ipad is found------------");
        boolean ipadExists = false;

        for (int i =0 ; i<items.length;i++){

            if (items[i].equals("iPad")){
                ipadExists =true;
                break;
            }

        }
        System.out.println("does the ipad exists - " + ipadExists);


        System.out.println("---------print a report of each shopping item-------------" );
        /*
        shoes - 99.99 - #12345
         */

        for (int i = 0 ; i <items.length ; i++){
            System.out.print(items[i] + " - \t$");
            System.out.print(prices[i] + " - ");
            System.out.print("#" + itemIDs[i] + "\n");

        }



        System.out.println("------look for jacket in items and print all details----------");
        /*
        Jacket - $150.0 - #12346
         */

        for (int i = 0;i<items.length ; i++){

            if(items[i].equals("Jacket")){
                System.out.println(items[i] + " - $" + prices[i]  +" - #" + itemIDs[i]);
                break;
            }

        }






    }
}
