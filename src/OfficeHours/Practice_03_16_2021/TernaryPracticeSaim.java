package OfficeHours.Practice_03_16_2021;
/*
====================================================
    Ternary
=======================================================

[Eligible to get Loan]

Given two values: yearly salary and credit score determine if you can get a loan.

    To be approve for the loan, print: "Loan Approved":
        Salary: above 60,000
        Credit Score: above 650
    Otherwise print: "Loan Denied"

=======================================================

[Sport]

Given a sport you play at the community center you will have to pay some enterance fee.

    Soccer or Tennis fee is: 100
    Otherwise fee is: 50

 */

public class TernaryPracticeSaim {
    public static void main(String[] args) {

        int salary = 60_000;
        int creditScore = 650;
        
        String loanApp = (salary >= 60_000 && creditScore >= 650)? "loan approved" : "loan denided";
        System.out.println("loanApp = " + loanApp);
        


        //*******************************************************************
        /*
[Sport]

Given a sport you play at the community center you will have to pay some enterance fee.

    Soccer or Tennis fee is: 100
    Otherwise fee is: 50
         */

        String activity = "Soccer or Tennis" ;

        String entranceFee = (activity.equals("Soccer or Tennis"))?"Fee will be 100" : "Fee will be 50";
        System.out.println("Entrance Fee = " + entranceFee);


    }
}
