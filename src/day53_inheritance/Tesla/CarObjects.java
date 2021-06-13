package day53_inheritance.Tesla;

public class CarObjects {
    public static void main(String[] args) {

        ElectricCar ec1 = new ElectricCar("day53_inheritance/Tesla", "Model Y", 48190.0, 2021, 326 );
        ec1.drive(50);
        System.out.println(ec1.toString());

        System.out.println("ec make = " + ec1.getMake());
        System.out.println("ec model = " + ec1.getModel());
        System.out.println("ec price = " + ec1.getPrice());
        System.out.println("ec year = " + ec1.getYear());
        System.out.println("ec Range = " + ec1.getRange());

        if(ec1.getPrice() > 10000){
            System.out.println(ec1.getMake() + " - " + ec1.getModel() + " is out of my budget");
        }else {
            System.out.println("purchasing " + ec1.toString());
        }

        System.out.println(ElectricCar.getCount());

        ElectricCar ec2 = new ElectricCar("tesla", "cybertruck", 59900.0, 2021, 300);
        System.out.println(ec2.toString());
        System.out.println("count = " + ec2.getCount());
        System.out.println("count = " + ElectricCar.getCount());

        Roadster roadster = new Roadster("Roadsrer","roadser", 200000, 2022, 620);
        System.out.println(roadster.toString());
        roadster.drive(1000);
        roadster.drive(600);
        System.out.println(roadster.getCount());

        ModelX myModelX = new ModelX("Tesla", "Model X", 89990.0, 2021, 360);
        System.out.println(myModelX.toString());
        myModelX.drive(10);
        System.out.println("Having lunch");
        myModelX.drive(10);
        System.out.println("range remaining = " + myModelX.getRange());
        System.out.println("total electric cars count = " + ElectricCar.getCount());



    }
}
