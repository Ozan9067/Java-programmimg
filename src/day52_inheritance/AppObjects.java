package day52_inheritance;

public class AppObjects {
    public static void main(String[] args) {

        MobileApp mobileApp = new MobileApp();
        mobileApp.setName( "youtube");
        mobileApp.useTheApp(10);

        System.out.println("================================================================");

        Instagram instagram = new Instagram();
        instagram.setName("Instagram");
        instagram.useTheApp(20);
        instagram.download();


        System.out.println("================================================================");


        Discord b22Discord = new Discord();
        b22Discord.setName("Discord");
        b22Discord.setVersion(6.234);
        b22Discord.useTheApp(100);
        b22Discord.download();
        b22Discord.printInfo();


        System.out.println(b22Discord.getName());


    }
}
