package day17_ternary_nested_conditions;

public class AmazonPrimeShopping {
    public static void main(String[] args) {

        int itemPrice = 30;
        boolean isPrimeMember  = true;

        if (isPrimeMember){
            System.out.println("eligible for free 2 day shipping");
        }else {
            if (itemPrice >= 25){
                System.out.println("eligible for free shipping ");
            }else {
                System.out.println("not eligible for free shipping");
            }


        }







    }
}
