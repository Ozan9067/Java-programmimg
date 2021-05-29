package OfficeHours.Practice_03_22_2021;

/*

Given two String variables. One is a full name and the second a last name.
 Check if the full name has the same last name as the other String.
    Ex:
        s: "james bond"
        s: "bond"
        output: Same last name

        s: "alex benji"
        s: "bond"
        output: Not the same last name

 */

public class Practice01 {
    public static void main(String[] args) {
        String fullName = "james bond";
        String firstName = "bond";

        if (fullName.endsWith("bond")){
            System.out.println("Same last name");
        }

    }
}
