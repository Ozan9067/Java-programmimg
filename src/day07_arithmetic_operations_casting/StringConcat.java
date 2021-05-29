package day07_arithmetic_operations_casting;

public class StringConcat {
    public static void main(String[] args) {
        System.out.println("java" + 3 + 5);  //it wont add if there is a String
        System.out.println("java" + (3+5));
        System.out.println(5 + 3 + "java");
        System.out.println(5 + (3 + "java"));

        System.out.println("hello" + 1 + 2 + 3);
        System.out.println("hello"+ (1 + 2 + 3) );

        String str1 = "hello";
        String str2 = "friends";

        System.out.println(str1 +" " + str2);

        int num1 = 7;
        int num2 = 8;

        System.out.println(num1 + num2); // prints out 15

        System.out.println(num1 + " " + num2);

        System.out.println("" + num1 + num2);

        char char1 ='a';
        char char2 = 'b';
        System.out.println(char1 + char2); // prints out 195

        System.out.println(char1 +" " + char2); // prints out a b

        System.out.println(char1 +"" + char2); // prints out ab



    }
}
