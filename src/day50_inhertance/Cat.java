package day50_inhertance;

public class Cat extends Animal{

    public void jump(){
        System.out.println("Cat is jumping...");
    }

    @Override
    public void Speak(){
        System.out.println("cat is saying meow...");
    }


}
