package OfficeHours.Practice_Replit;

import java.util.Scanner;

public class Dog extends Animal{
    String breed;
    int humanYears;

    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed=breed;
    }

    public String getBreed(){
        return breed;
    }
    public void setBreed(){
        this.breed=breed;
    }


    @Override
    public String toString(){
        return "Name: "+name+"\n" +"Breed: "+breed+"\n"+"Age in calendar years: "+age+"\n" +"Age in human years: "+humanYears;

    }

    @Override
    public int getAgeInHumanYears(){
        if(getAge() <= 2 ){
             setAge(getAge()*11);
        }else {
             setAge(22+ ((getAge()-2) * 5));

        }
        return getAge();

    }

    public boolean equals(Dog otherDog){
        return this.name.equals(otherDog.name)&&
                this.age == otherDog.age &&
                this.breed.equals(otherDog.breed);

    }










}