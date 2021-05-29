package day06_arithmetic_operators;

public class Computer {
    public static void main(String[] args){
        String brand = "Hp";
        String processor = "Intel Core";
        String ramMemory = "32GB";
        String storageMemory = "64GB";
        boolean hasMonitor = true;
        String description = "laptop PC with the latest technology";
        int price = 400;
        String color = "silver";
        byte numberOfMonitors = 1;
        boolean hasUsb3 = true;

        System.out.println("I purchased a " + brand +
                " laptop with a " + processor +
                " processor. It has a ram memory of" + ramMemory +
                " and a storage memory of " + storageMemory + ". It is a  " + color +
                " laptop. I paid " + price + " dollars for it. " );

        System.out.println("Number of Monitors : "+ numberOfMonitors );
        System.out.println("Has USB 3.0 : " + hasUsb3 );



    }
}
