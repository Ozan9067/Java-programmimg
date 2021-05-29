package day15_logicalops_switch_ternary;

public class AndOperatorsPractice {
    public static void main (String[] args){

        boolean onSale= true;
        boolean freeShipping = false;
        String itemName  = "Wooden Spoon";

        if (onSale && freeShipping){
            System.out.println("Adding to cart - " + itemName);
        }else {
            System.out.println("continue shopping for good deals on - " + itemName);
        }



        if (onSale && freeShipping && itemName.equals("Wooden Spoon")){
            System.out.println("Add to chart - " + itemName );
        }else {
            System.out.println("Continue shopping for more good deals - " + itemName);
        }

        //location, salary, remote, benefits, company




    }

}
