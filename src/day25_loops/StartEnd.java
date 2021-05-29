package day25_loops;
import java.util.*;

public class StartEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter start number:");

        int start = scan.nextInt();

        int end = scan.nextInt();


        if (start > end){
            System.out.println("not supported");
        }

        for (int i = start ; i <=end ; i++){
            System.out.println(i + "");

            }










    }
}
