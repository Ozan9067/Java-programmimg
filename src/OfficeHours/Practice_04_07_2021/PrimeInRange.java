package OfficeHours.Practice_04_07_2021;

/*
[IQ] Prime in range
Given a number. Print out all the prime numbers from 2 to that number A prime number is a number that is only divisible by 1 and itself.
Ex:
Input: 50
Output:
2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
 */

public class PrimeInRange {
    public static void main(String[] args) {

        int number = 13;
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;

            }
        }
        System.out.println(isPrime);


    }
}
