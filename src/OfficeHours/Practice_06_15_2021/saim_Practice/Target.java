package OfficeHours.Practice_06_15_2021.saim_Practice;

/*
create a concrete class Target
 - ingerit shopping anf implement all methods
 */

public class Target extends Shopping{

    @Override
    public void buyItem() {
        System.out.println("buying iterm from taget");
    }

    @Override
    public void returnItem() {
        System.out.println("returning item to target");
    }

}
