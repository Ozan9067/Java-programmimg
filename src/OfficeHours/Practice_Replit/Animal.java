package OfficeHours.Practice_Replit;

public abstract class Animal {

    String name ;
    int age ;

    public Animal(String name, int age){
        this.name=name;
        this.age=age;
    }

    public abstract int getAgeInHumanYears();





    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }







}
