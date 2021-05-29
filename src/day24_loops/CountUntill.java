package day24_loops;

import java.util.*;

public class CountUntill {
    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter a number");

        int numberToStop = scan.nextInt();
        int start = 1;

        while (start <= numberToStop){
            System.out.print(start+" ");
            start++;
            Thread.sleep(1000);
        }






    }
}
