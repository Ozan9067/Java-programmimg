package Day47_constructors;

public class Student {
    //no args

    public Student(){
        System.out.println("No args constructor");
    }

    public Student(String name){
        System.out.println("name - " + name);
    }

    //constructor with age
    public Student(int age){
        System.out.println("age param || = " + age);
    }

    //constructor with name and age
    public Student(String name, int age){
        System.out.println("name and age || = " + name+ " " + age);
    }


}
