package day53_inheritance.Tesla;

public class Roadster extends  ElectricCar{

    public Roadster(String make, String model, double price, int year, int range) {
        super("Tesla", model, price, year, range);
    }
}
