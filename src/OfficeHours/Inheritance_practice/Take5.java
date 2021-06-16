package OfficeHours.Inheritance_practice;
/*

Create a class Take5 [Child class]

    * Inherits Candy class

    * constructor that invokes the parent constructor

    * extra: static hiding, final
 */


public class Take5 extends  Candy{

    public Take5( int quantity, boolean hadPeanuts) {
        super("Reese", quantity, hadPeanuts);
    }



}
