package day54_abstraction;

public class OnlineStudent extends Student{

    @Override
    public void attendClass(){
        System.out.println("online student is attending the class using zoom");
    }

}
