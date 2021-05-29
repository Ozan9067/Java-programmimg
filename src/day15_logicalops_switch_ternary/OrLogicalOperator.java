package day15_logicalops_switch_ternary;

public class OrLogicalOperator {
    public static void main(String[] args) {
        System.out.println("true || true =  " + (true|| true));
        System.out.println("true || false =  " + (true||false));
        System.out.println("false || true = " + (false||true));
        System.out.println("false || false = " + (false||false));

        System.out.println("*************************************************************************");
        System.out.println("true && true =  " + (true&& true));
        System.out.println("true && false =  " + (true&&false));
        System.out.println("false && true = " + (false&&true));
        System.out.println("false && false = " + (false&&false));









        int apples  = 5;
        int oranges = 7;

        System.out.println(apples > 3  || oranges > 4 );
        if (apples > 3 || oranges > 4){
            System.out.println("no need to buy fruits today");
        }else{
            System.out.println("need to get some fruit");
        }

        System.out.println(apples > 2 || oranges > 10 );  // true

        System.out.println(apples > 2 && oranges > 10);  //false


        System.out.println(apples == 0 || oranges ==0);  // false
        if (apples == 0 || oranges == 0 ){
            System.out.println("we need to purchase some fruit");
        }else{
            System.out.println("we are good with fruit");
        }














    }
}
