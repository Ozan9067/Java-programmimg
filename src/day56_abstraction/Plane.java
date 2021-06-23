package day56_abstraction;

public class Plane extends  Transportation implements SelfDrivable, Greeting{
    @Override
    public void hi() {
        System.out.println("welcome to our flight ");

    }

    @Override
    public void bye() {
        System.out.println("thank you for flying with us ");

    }

    @Override
    public void autoPiloting() {

        System.out.println("fying on autopilot");
    }

    @Override
    public void transportPeople() {
        System.out.println("flying pieple from a to b  ");

    }

    @Override
    public void cost(int mile) {

    }
}
