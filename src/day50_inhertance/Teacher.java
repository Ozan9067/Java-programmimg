package day50_inhertance;

public class Teacher  extends Person{

    int teacherId;

    public void teach(String topic){
        System.out.println("teacher is teaching "+ topic);
    }



}
