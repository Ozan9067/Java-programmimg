package day14_multibranch_if_statements;

public class MultiBranchIfStatement {
    public static void main(String[] args){
        int day1 = 3;

        if( day1 == 1){
            System.out.println("monday");
        }else if ( day1 == 2){
            System.out.println("tuesday");
        }else if(day1 == 3 ){
            System.out.println("wednesday");
        }else{
            System.out.println("does not match any day");
        }

        System.out.println("===========MUTLI BRANCH IF STATEMENT=============== ");

        day1 = 2;

        if(day1 == 1){
            System.out.println("monday");
        }else if (day1 ==2){
            System.out.println("tuesday");
        }else if (day1 ==3){
            System.out.println("wednesday");
        }else{
            System.out.println("java day");
        }

        System.out.println("everyday code java");


    }

}
