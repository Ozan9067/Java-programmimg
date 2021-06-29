package day57_abstraction_polymoprphism_polymorphism;

import java.util.ArrayList;
import java.util.List;

public class AnimalTests {
    public static void main(String[] args) {

        Animal a1 =  new Animal();  //not polymporphic
        a1.makeNoise();


        Animal animal1 = new Dog();
        Animal animal2 = new Horse();
        Animal cat = new Cat();

        animal1.makeNoise();
        animal2.makeNoise();
        cat.makeNoise();


        // POLYMORPHIC LIST OF OBJECTS - LIST DATA TYPE IS PARENT CLASS
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Horse());
        listOfAnimals.add(new Cat());

        for (Animal each: listOfAnimals){
            each.makeNoise();
        }






    }


}
