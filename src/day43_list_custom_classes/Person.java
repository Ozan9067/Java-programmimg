package day43_list_custom_classes;

public class Person {
    //data veriables
    String firstName ;
    int age ;
    char gender;


    //behaviour
    public void speak(){
        System.out.println("person is speaking");
    }

}

class People {
    public static void main(String[] args) {
        Person person1 = new Person(); //created object of person aka (instantiate person class)

        person1.firstName = "Bob";
        person1.age = 33;
        person1.gender = 'M';

        person1.speak();

        System.out.println(person1.firstName);
        System.out.println(person1.age);
        System.out.println(person1.gender);

        Person person2 = new Person();
        person2.firstName = "Mike";
        person2.age = 12;
        person2.speak();

        System.out.println(person2.firstName);
        System.out.println(person2.age);

        System.out.println("person1 first name = "+person1.firstName);

    }
}
