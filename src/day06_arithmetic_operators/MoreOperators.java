package day06_arithmetic_operators;

public class MoreOperators {
    public static void main(String[] args){
        int toyotas = 431;
        int honda = 233;
        int VW = 2;
        int tesla = 20;
        int nissan = 1;
        int BMW = 155;

        int totalParkedCars = toyotas + honda + VW + tesla + nissan + BMW;

        System.out.println("There are " + totalParkedCars +" cars in the parking lot");

        String pizza ="hawaiian";
        int slices =8;
        int people = 4;
        int slicesPerPerson = slices/people ;
        //there are 2 slices per person
        //we ordered hawaiian pizza with 8 slices, 4 people ate 2 slices each

        System.out.println("there are " + slicesPerPerson + " slices per person");


        System.out.println("we ordered " + slices +
                " slices of " + pizza + " pizza.");

    }
}
