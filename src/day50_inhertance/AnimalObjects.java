package day50_inhertance;

public class AnimalObjects {
    public static void main(String[] args) {

        Animal animal  = new Animal();
        animal.name = "Melo";
        animal.type = "pitbull";
        animal.Speak();

        Cat cat = new Cat();
        cat.Speak();

        Dog dog = new Dog();
        dog.Speak();

    }
}
