package OfficeHours.Practice_03_22_2021;

/*
Given a username and password verify they are valid.
    - The password cannot be less than 5 characters
        -> If it is less print: "Password cannot be less than 5 characters"
        -> If it is more then or equal to 5 print: "Valid password"

    - Also the password should not contain the username
        - If the password has the username in it print:
            "Invalid password, username should not be in it"
            -> Also change the password to have the value: "password"

 */

public class Practice03 {
    public static void main(String[] args) {
        String username = "ozan9067";
        String password = "password";

        if (password.length()<= 5){
            System.out.println("Password cannot be less than 5 characters");
        }else {
            System.out.println("Valid password");
        }

        if (password.contains("ozan9067")){
            System.out.println("Invalid password, username should not be in it");
        }




    }
}
