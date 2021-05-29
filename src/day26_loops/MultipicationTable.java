package day26_loops;


//MULTIPICATION TABLE
public class MultipicationTable {
    public static void main(String[] args) {

        int number = 11;


        if (number < 1 || number >10){
            System.out.println("ERROR: Invalid Input");
            return;   //STOP /EXIT
        }


        for (int i = 1; i <= 10; i++) {

            System.out.println(number + " x " + i + " = " + (number * i));

        }




    }
}
