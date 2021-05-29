package OfficeHours.Practice_03_30_2021;

public class PracticingLoops01 {
    public static void main(String[] args) {

        String word = "Ozan";
        char letter = 'z';
        int index = -1;



        for (int n = 0; n<word.length() ; n++){

            if(word.charAt(n)==letter){
                index = n;
                System.out.println(letter + " is found at index " + index);
            }



        }

    }
}
