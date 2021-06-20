package day55_abstraction.interfaces_demo;

public interface MyInterface {
    public abstract void learn();
}

interface MyInterface2 {

}


class MyClass implements MyInterface {

    @Override
    public void learn(){
        System.out.println("learning in MyClass");
    }

}

class Main {
    public static void main(String[] args) {

        //MyInterface myInterface = new MyInterface();  CANNOT CREATE - INTERFACE
        MyClass myClass = new MyClass();


    }
}