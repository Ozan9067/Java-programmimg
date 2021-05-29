package day35_methods_with_param;

import org.omg.CORBA.PUBLIC_MEMBER;

public class VoidMethods {
    public static void main(String[] args) {

        printAtoZ();

        for (int i = 0; i <10 ; i++) {
            printAtoZ();

        }

        displayUsFlag();

    }

    public static void printAtoZ(){

        for(char i = 'A'; i <= 'Z'; i++ ){
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public static void displayUsFlag(){
        System.out.println("------------flag of USA------------------");
        String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String p2 = "==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(p2);
        }
    }





}
