package day24_loops;
import java.util.*;
public class GuessTheNumber {
    public static void main(String[] args) {

        Random randomNum = new Random();
        //System.out.println(randomNum.nextInt(101));


        Scanner scan = new Scanner(System.in);

        int secretNumber = randomNum.nextInt(101);
        int guessingNumber;

        do {
            System.out.println("guess the number");
            guessingNumber = scan.nextInt();

            if (guessingNumber > secretNumber){
                System.out.println("your number is too large");
            }else if(guessingNumber < secretNumber){
                System.out.println("number is too small ");
            }


        } while(secretNumber != guessingNumber);

        System.out.println("congrats you won");










    }
}
