package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args){
        String carModel = "BMW X5";
        String driverName ="Ozan Unal";
        String licenseNum ="6767";
        short speed =55;
        boolean isAutomatic =true;
        char licenseClass ='M';

        // BMW is the car model.

        System.out.println(carModel + " is the car model");
        System.out.println("Car model: " + carModel);
        System.out.println("Driver Name: " + driverName);
        System.out.println(driverName + " is driving the car");
        System.out.println(driverName + " is driving the " + carModel);

        System.out.println("Current speed is " + speed + "mph");

        System.out.println("Is it automatic --> " + isAutomatic);


    }
}
