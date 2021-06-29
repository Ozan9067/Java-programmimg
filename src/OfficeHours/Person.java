package OfficeHours;

public class Person {

    private String firstName;
    private String lastName;
    private int age;


    public int setAge(){
        return age;
    }

    public void getAge(){
        this.age=age;
    }


    public String setFirstName(){
        return firstName;
    }

    public void getFirstName(){
        this.firstName = firstName;
    }

    public String setLastName(){
        return lastName;
    }

    public void getLastName(){
        this.lastName = lastName;
    }

    public String toString(){
        return firstName + " | " + lastName+ " | " + age;
    }

    public Person(){

        firstName = "undefined";
        lastName = "undefined";
        age = -1;

    }

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;



    }









}


