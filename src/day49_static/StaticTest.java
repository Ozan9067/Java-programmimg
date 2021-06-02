package day49_static;

public class StaticTest {
    static String word = "java";
    public static void main(String[] args) {
        //static merhod can be called using classname
        StaticMethods.displayMessage("wooden spoon");

        // instance method needs and object to be called
        StaticMethods stm = new StaticMethods();
        stm.instanceMethod();

        //static method can only access other static varibles and methods
        System.out.println(word);


    }
}
