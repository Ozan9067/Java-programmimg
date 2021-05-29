package OfficeHours.Practice_04_21_2021;

public class PalindromeNumber {
    public static void main(String[] args) {

        //System.out.println(112 % 1 );
        //System.out.println(112 % 10);  //will always give you the last digit
        //System.out.println(112 % 100);

        System.out.println(isPalindrome(1234321));


    }
    public static boolean isPalindrome(int number){

        System.out.println(number % 10);

        int reverse = 0;
        int tempNumber = number;

        while (tempNumber != 0){

            int lastDigit = tempNumber % 10;
            reverse = (reverse * 10) + lastDigit;
            tempNumber /= 10;
            System.out.println(reverse);



        }

        return reverse == number;


    }


}
