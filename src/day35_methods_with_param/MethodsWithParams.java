package day35_methods_with_param;

public class MethodsWithParams {
    public static void main(String[] args) {
        displayValue(5);
        displayValue(2);
        int count = 55;
        displayValue(count);


        greetByName("ozan");
        String name = "orkun";
        greetByName(name);



    }

    public static void displayValue(int num){
        System.out.println("Value is : " + num);

    }

    public static void greetByName(String input){
        System.out.println("Hello " + input + ", how are you doing today?" );
    }







}
