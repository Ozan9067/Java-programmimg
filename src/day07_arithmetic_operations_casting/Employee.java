package day07_arithmetic_operations_casting;

public class Employee {
    public static void main(String[] args){
        String firstName = "Ozan";
        String lastName = "Unal";
        String companyName = "KW";  // KELLER WILLIAMS
        int salary = 75;
        String startDate = "January 1st";
        int startYear = 2016;
        boolean areTheyFulltime = true;
        String jobTitle = "Realtor";
        String officeAddress  = "23 goat ct, md 21043";
        int startMonth = 1;

        // declaring new variables

        String fullName= (firstName +" "+ lastName);
        String fullStartDate = (startDate + " " + startYear);
        String email = (firstName + lastName + "@" + companyName + ".com");
        String salaryAfter3Years = ("" + salary + (startMonth *1000));


        System.out.println(fullName);
        System.out.println(fullStartDate);
        System.out.println(email);
        System.out.println(salaryAfter3Years);




    }
}
