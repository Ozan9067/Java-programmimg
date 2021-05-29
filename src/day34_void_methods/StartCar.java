package day34_void_methods;

public class StartCar {
    public static void main(String[] args) {
        sitInCar();
        startTheCar();
        shiftToDrive();
        pressGasPedal();

    }

    public static void pressGasPedal() {
        System.out.println("4. Hold steering wheel with two hands and press gas pedal.");
    }



    public static void sitInCar(){
        System.out.println("1. Open the drivers door and sit in the drivers seat.");
    }

    public static void startTheCar(){
        System.out.println("2. Insert key into ignition and turn it clockwise.");
    }

    public static void shiftToDrive(){
        System.out.println("3. Press break pedal and shift to Drive.");
    }




}
