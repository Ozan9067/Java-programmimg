package OfficeHours.Inheritance_practice;
/*
Create a class Twix [Child class]

    * Inherits Candy class

    * constructor that invokes the parent constructor

    * extra: static hiding, final, sub class

 */

public class Twix extends  Candy {


    public Twix(int quantity, boolean hadPeanuts) {
        super("Mars", quantity, hadPeanuts);
    }


}
