package day56_abstraction;

public abstract class Transportation {

    public abstract void transportPeople();
    public abstract void cost(int mile);
    public void start(){
        System.out.println("starting the engine");
    }

    public void sop(){
        System.out.println("shut the engine off");
    }
    }

