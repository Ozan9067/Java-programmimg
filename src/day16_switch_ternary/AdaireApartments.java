package day16_switch_ternary;

public class AdaireApartments {
    public static void main(String[] args) {

        System.out.println("WELCOME TO ADAIRE APARTMENTS");

        int numberOfBedrooms = 0;
        double startingPrice = 0;

        switch (numberOfBedrooms) {
            default:
                System.out.println(numberOfBedrooms + " bedroom currently unavailable");
                break;
            case 0:
                System.out.println("studio apartment");
                startingPrice = 1454.0;
                break;
            case 1:
                System.out.println("one bedroom apartment");
                startingPrice = 1725.0;
                break;
            case 2:
                System.out.println("two bedroom apartment");
                startingPrice = 2899.0;
                break;
            }

        System.out.println("starting price: $" + startingPrice);




        }
    }

