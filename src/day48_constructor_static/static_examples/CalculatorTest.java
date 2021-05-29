package day48_constructor_static.static_examples;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator.add(5,3);   // add is a static method, can be called using class name

        //Calculator.multiply(2,4);   ERROR BECAUSE THE METHOD ITS USING IS NOT STATIC

        Calculator calc = new Calculator();
        calc.multiply(2, 4);


        //static method can also be called using an object
        calc.add(5,6);

        //static method = method that cab be called using the classname, No need for object to be callled
        //it can also be called usinf object too



    }



}
