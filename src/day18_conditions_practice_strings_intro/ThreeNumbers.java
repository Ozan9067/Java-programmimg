package day18_conditions_practice_strings_intro;

public class ThreeNumbers {
    public static void main(String[] args) {

        int num1 = 1000;
        int num2 = 1000;
        int num3 = 100;

        if (num1 >= num2 && num1 >= num3){
            System.out.println(num1 + " is greater");
        }else if(num2 >= num1 && num2 >= num3){
            System.out.println(num2 + " is greater");
        }else{
            System.out.println(num3 + " is greater");
        }


    }
}
