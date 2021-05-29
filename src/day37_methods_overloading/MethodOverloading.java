package day37_methods_overloading;

public class MethodOverloading {
    public static void main(String[] args) {
        sum(3, 6);
        MethodOverloading.sum(3,6);

        sum(1.1, 2.3);

        sum(1,3.3);

        sum((int)3.3,4,5);

        sum("hello", "world");


    }


    public static void sum(int a, int b){
        System.out.println("sum(int a, int b)");
        System.out.println("result = " + (a + b));

    }
    public static void sum(double a, double b){
        System.out.println("sum(double a, double b)");
        System.out.println("result = " + (a + b));
    }
    public static void sum(int a, int b, int c){
        System.out.println("sum(int a, int b, int c)");
        System.out.println("result = " + (a + b + c));
    }
    public static void sum(String a, String b){
        System.out.println("sum(String, String)");
        System.out.println("result = " + (a + b));
    }





}
