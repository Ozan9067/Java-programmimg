package day13_conditional_statements;

public class IFWithBooleanVariable {
    public static void main(String[] args){

        boolean isHungry = true;

        if (isHungry){
            System.out.println("I am hungry I will go get something to eat");
        }else{
            System.out.println("I am not hungry lets keep coding java");
        }

        double price = 230.44;
        boolean isAfforable= price <=200 ;

        System.out.println("isAfforable = " + isAfforable);

        if(isAfforable){
            System.out.println("I can afford it, lets buy it!");
        }else{
            System.out.println("Too expensive for me");
        }

        boolean isRemoteJob = true;
        //if it is NOT remote job print "sorry im not interested
        //otherwise "sure what I am interested, what is the interview process

        if(!isRemoteJob){
            System.out.println("Sorry I am not interested");
        }else{
            System.out.println("Sure i am interested what is the interview process");
        }



    }
}
