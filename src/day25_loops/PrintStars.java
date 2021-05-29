package day25_loops;

public class PrintStars {
    public static void main(String[] args) {

        for (int star = 0;star <=15;star++){
            System.out.print("* ");
        }

        System.out.println("");


        String myStars = "";
        for (int i = 0; i<=5;i++){
            //myStars=myStars + "* ";      SAME THING
            myStars+= "* ";
        }

        System.out.println(myStars);






    }
}
