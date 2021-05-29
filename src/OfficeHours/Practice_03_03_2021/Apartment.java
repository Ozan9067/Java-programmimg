package OfficeHours.Practice_03_03_2021;

/*
create a class named Apartment
create a main method

    Create the variables with the most appropriate datatype:

        - address, name of owner, number of units, average size of each unit, monthly rent amount,
         number of washers and driers, allows pets or not, has a pool, length of lease,
         total number of residents in building, phone number of owner,
         is near a gas station, number of floors, has a basement, has available units for rent,
          has air conditioning, number of parking spaces, has wheel chair access,
           number of review stars (out of 5)
 */
public class Apartment {
    public static void main(String[] args){
        String address = "2323 goat rd, Ellicott City MD";
        String owner = "Ozan Unal";
        int numberOfunits = 4;
        int avarageSizeOfUnits = 1050;
        int monthlyRent = 2000;
        int numOfWasherDryers = 4;
        boolean allowsPets = false;
        boolean hasPool = false;
        int lenghtOfLease = 24;
        int totalNumOfResidents = 11;
        String ownerPhoneNum = "4109177773";
        boolean isNearGasStation = true;
        byte numberOfFloors = 2;
        boolean hasBasement = false;
        boolean hasAvailableUnit = false;
        boolean hasAirConditioning = true;
        int numberOfParking = 17;
        boolean hasWheelchairAccess = true;
        byte reviewStars = 5;

        double monthlyRentAfter3Years = ((-0.10 * monthlyRent) + monthlyRent);
        double monthlyRentAfter6Years = ((-0.20 * monthlyRent) + monthlyRent);
        double avarageNumberOfResidents = (totalNumOfResidents / numberOfunits);
        double avarageNumOfParkingPerUnit = (numberOfParking / numberOfunits );
        double avarageNumOfUnitsPerFloor = (numberOfunits / numberOfFloors);

        System.out.println (monthlyRentAfter3Years);
        System.out.println (monthlyRentAfter6Years);
        System.out.println(avarageNumberOfResidents);
        System.out.println(avarageNumOfParkingPerUnit);
        System.out.println(avarageNumOfUnitsPerFloor);




    }
}
