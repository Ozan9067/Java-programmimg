package OfficeHours.Practice_06_15_2021;

public class EmailObject {
    public static void main(String[] args) {

        Email email = new Email("Ozan@cybertek.com", 7);
        //email.ADDRESS = "EMAIL"; ADDRESS is final so it cannot be changed
        System.out.println(email);
        System.out.println(Gmail.domain);
        System.out.println(Email.domain);
        System.out.println();

        Gmail gmail = new Gmail("Orkun@gmail.com", 17);
        System.out.println(gmail);
        System.out.println(Gmail.domain);
        System.out.println(Email.domain);
        System.out.println();

        Yahoo yahoo = new Yahoo("gul@gmail.com", 10);
        System.out.println(yahoo);
        System.out.println(Yahoo.domain);
        System.out.println(Gmail.domain);
        System.out.println(Email.domain);


        Yahoo.domain = "generic";
        Email email2 = new Email("hasan@gmail.com", 5);


        System.out.println();
        System.out.println(Yahoo.domain);
        System.out.println(Gmail.domain);
        System.out.println(Email.domain);

        Gmail.sendEmail();
        Email.sendEmail();
        Gmail.sendSuperEmail();






    }



}
