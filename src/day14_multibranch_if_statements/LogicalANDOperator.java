package day14_multibranch_if_statements;

public class LogicalANDOperator {
    public static void main(String[] args) {
        System.out.println(true && true);     //true
        System.out.println(true && false);    //false
        System.out.println(false && true);    //false
        System.out.println(false && false);  //false

        System.out.println(10 > 5 && 1== 1); //true
        System.out.println(10 > 13 && 2==2);  //false


        int apples = 10, oranges = 5;
        boolean check = apples < 5 && oranges > 3;
        System.out.println("check = " + check);


        if (apples > 6 && oranges > 2){
            System.out.println("i have enough apples and oranges");
        }else{
            System.out.println("i need to go the grocery store to buy fruit");
        }


        
        
        
    }
}
