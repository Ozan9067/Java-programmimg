package day18_conditions_practice_strings_intro;

import javax.xml.bind.SchemaOutputResolver;

public class Authentication {
    public static void main(String[] args) {


        int last4SSN = 1234;
        int pinCode = 1234;

        int expLast4SSN = 1234;
        int expPinCode = 1235;

        if (last4SSN == expLast4SSN && pinCode == expPinCode){
            System.out.println("Authentication successfull");
        }else{
            System.out.println("Unsuccessfull");
            if (last4SSN != expLast4SSN){
                System.out.println("SSN does not match");
            }else {

            }

                if (pinCode != expPinCode){
                System.out.println("Pincode does not match");
            }





        }



    }
}
