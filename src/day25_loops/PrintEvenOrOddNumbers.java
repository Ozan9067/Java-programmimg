package day25_loops;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {

        int evenNum = 0;
        int oddNum = 0;


        for (int i = 0; i <=100 ; i+=2){
            System.out.print(i + " ");
            evenNum += i;
        }
        System.out.println("even number = " + evenNum);


        //for (int i = 0; i <100 ; i+=3)

        for (int i = 0; i<=100; i++){
            if (i % 2 != 0){
                System.out.print(i + " ");
            }
        }





    }
}
