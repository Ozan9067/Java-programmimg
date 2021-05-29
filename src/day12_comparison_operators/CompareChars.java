package day12_comparison_operators;

public class CompareChars {
    public static void main(String[] args){
        char letter1 = 'O';
        char letter2 ='U';
        System.out.println(letter1 == letter2);
        System.out.println(letter1 > letter2);
        System.out.println(letter2 > letter1);

        char grade = 'A';
        boolean pass = grade <= 'D';
        System.out.println("did you pass the exam? " + pass);


    }
}
