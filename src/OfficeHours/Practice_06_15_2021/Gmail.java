package OfficeHours.Practice_06_15_2021;

public class Gmail extends Email {

    static String domain;


    static {
        domain = "Gmail";
    }



    public Gmail(String address, int numberOfEmail) {
        super(address, numberOfEmail);
    }

    public static void sendSuperEmail(){
        Email.sendEmail();
    }




}
