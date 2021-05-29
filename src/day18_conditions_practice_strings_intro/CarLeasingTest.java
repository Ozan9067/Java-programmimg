package day18_conditions_practice_strings_intro;

/*
add new class CarLeasingTest

Make => Mercedes
    Model =>  E
        leasePrice = 500
    Model => A
        leasePrice = 400

Make => Audi
    Model =>  SQ5
        leasePrice = 552
    Model => A3
        leasePrice = 412
 */

public class CarLeasingTest {
    public static void main(String[] args) {

        String make = "auidi";
        String model = "SQ5";
        double leasePrice = 0.0;


        if (make.equals("auidi")){
            if (model.equals("SQ5")){
                leasePrice = 552.0;
            }else if(model.equals("A3")){
                leasePrice = 412.0;
            }
        }else{
            System.out.println("invalid make ");
        }


        System.out.println("make = " + make);
        System.out.println("model = " + model);
        System.out.println("leasing price = " + leasePrice);





    }
}
