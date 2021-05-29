package day13_conditional_statements;
import java.util.Scanner;
public class ATMPincodeProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("*** Welcome to TD Bank ATM ***");

        int inputPincode = scan.nextInt();

        int secretPincode = 1234;

        if (secretPincode == inputPincode){
            System.out.println("Welcome to your accout\nYou can withdraw, check balance, deposit");
        }else{
            System.out.println("Incorrect Pincode\nPlease try again." + secretPincode);
        }

        System.out.println("thank you for using TD bank ATM");



    }
}
