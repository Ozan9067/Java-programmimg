package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(10,5);
        addNumbers(10,5,200,300);
        addNumbers(10,5,200,300,4,5,6,7,3,7,4,44,667,2,5);
        addNumbers();


    }

    public static void addNumbers(int... nums){
        int sum = 0;
        for (int n : nums){
            sum += n;
        }
        System.out.println("sum = " + sum);
    }



}
