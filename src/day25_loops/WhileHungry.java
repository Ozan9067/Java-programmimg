package day25_loops;

public class WhileHungry {
    public static void main(String[] args) {

        boolean isHungry = true;
        int bananas = 0;
        int countToFull = 3;

        while(isHungry ) {
            bananas++;
            System.out.println("eating a banana: " + bananas);

            if (bananas == countToFull) {
                System.out.println(!isHungry);
                isHungry = false;
            }
        }

        System.out.println("had enough bananas, lets get back to studying");




    }
}
