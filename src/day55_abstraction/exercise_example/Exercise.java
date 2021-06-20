package day55_abstraction.exercise_example;

public abstract class Exercise {



    public void start(){  //non abstract method
        System.out.println("warming up and starting to exercise");
    }


    //
    public abstract void perform(); // abstract method -  method without body, just signature(implementation)

    public abstract int getCaloriesCount(int minutes);

}
