package day24_loops;

import java.util.*;

public class PinCodeDoWhile {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int secretPinCode = 1234;
        int pinCode;   //MUST DECLARE VARIABLE OUTSIDE OF LOOP. or else it will only work in loop

        do {
            System.out.println("enter pincode");
            pinCode = scan.nextInt();
        }while (pinCode != secretPinCode);




    }
}
