package OfficeHours.Practice_03_16_2021;
/*
TeslaNestedIf

char model = 'S';
trim -> "Long range"


when model 'S'
    if trim is "long range":

        "range: 412"
        "top speed: 155 mph"
        "0-60- 3.1sec"
    if trim is "Plaid":

        "range: 412"
        "top speed: 155 mph"
        "0-60- 3.1sec"
    if trim is "Plaid+":

        "range: 412"
        "top speed: 155 mph"
        "0-60- 3.1sec"
when model is '3'
    ....
 */

public class TeslaPractice {
    public static void main(String[] args){

        char carModel = 'S';
        String carTrim = "plaid";


        if (carModel=='S'){
            System.out.println("model  = " + carModel);

            if (carTrim.equals("long range")){
                System.out.println("trim = " + carTrim);
                System.out.println("range: 412, top speed: 155 mph, 0-60- 3.1sec ");

            }else if(carTrim.equals("plaid")){
                System.out.println("trim = " + carTrim);
                System.out.println("range: 415, top speed: 155 mph, 0-60- 3.1sec ");

            }else if (carTrim.equals("plaid+")) {
                System.out.println("trim = " + carTrim);
                System.out.println("range: 415, top speed: 155 mph, 0-60- 3.1sec ");

            }
        }



    }
}
