package OfficeHours.Practice_03_16_2021;
/*
[Baking contest]

You are in a baking contest. Your cookies will be rated by 3 judges. The 3 scores from the judges will be averaged and compared with the 2 other people in the contest.

Use variables: judge score 1, judge score 2, judge score 3, other person score 1, other persons score 2

If your score is more than both of the other people then print "First place!"
If your score is more then one other person then print "Second place"
If your score is less than both of the other people then print "Third place"
 */
import java.util.Scanner;

public class BakingContest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int judge = 1;


        System.out.println("enter judge " + judge++ + " score");
        int scoreOne = input.nextInt();
        System.out.println("enter judge " + judge++ + " score");
        int scoreTwo = input.nextInt();
        System.out.println("enter judge " + judge++ + " score");
        int scoreThree = input.nextInt();
        System.out.println("enter other persons 1's score ");
        int otherPerson1 = input.nextInt();
        System.out.println("enter other persons 2's score ");
        int otherPerson2 = input.nextInt();






    }
}
