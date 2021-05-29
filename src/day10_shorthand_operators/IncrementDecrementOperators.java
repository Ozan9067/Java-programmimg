package day10_shorthand_operators;

public class IncrementDecrementOperators {
    public static void main(String[] args){

        int i = 1;
        System.out.println("i = " + i);
        i++;
        System.out.println("i = " + i);

        ++i;
        ++i;
        i++;
        i++;
        System.out.println("i = " + i);


        int LinesOfCode = 15;
        System.out.println("linesOfCode = " + LinesOfCode);
        LinesOfCode++;
        ++LinesOfCode;
        LinesOfCode = LinesOfCode + 1;
        LinesOfCode +=1;

        System.out.println("linesOfCode = " + LinesOfCode);


        LinesOfCode--;
        --LinesOfCode;
        LinesOfCode = LinesOfCode - 1;
        LinesOfCode -=1;
        System.out.println("linesOfCode = " + LinesOfCode);


        char letter = 'a';
        System.out.println("letter equals = " + letter);
        letter--;
        System.out.println("letter equals = " + letter);
        letter--; letter--; letter--;
        System.out.println("letter equals = " + letter);















    }


}
