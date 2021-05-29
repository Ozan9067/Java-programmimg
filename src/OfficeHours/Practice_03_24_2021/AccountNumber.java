package OfficeHours.Practice_03_24_2021;

public class AccountNumber {
    public static void main(String[] args) {
        String accountNumber = "50000";

        if (accountNumber.startsWith("2")){

            if (accountNumber.length() == 7){
                System.out.println("valid 7 digit account number");
            }else
                System.out.println("not a 7 digit account number");

        }else if (accountNumber.startsWith("5")){

            if (accountNumber.length() == 10){
                System.out.println("valid 10 digit account number");
            }else
                System.out.println("not a valid 10 digit account number");

        }else {
            System.out.println("not a valid account number");
        }



    }
}
