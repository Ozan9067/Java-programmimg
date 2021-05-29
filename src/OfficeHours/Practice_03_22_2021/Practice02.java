package OfficeHours.Practice_03_22_2021;

/*
Given a String variable with a message. You will check if the message contains any of these bad words:
 “idiot, dumb, heck”
    -> If the message contains any of those words print: “Message not sent”.
    -> If the message is bad word free print “Message sent”
 */

public class Practice02 {
    public static void main(String[] args) {

        String sentence = "random sentence put together";

        if (sentence.contains("idiot") || sentence.contains("dumb") || sentence.contains("heck")){
            System.out.println("Message not sent");
        }else {
            System.out.println("Message sent");
        }

    }
}
