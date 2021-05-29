package OfficeHours.Practice_03_30_2021;

public class PracticingLoops02 {
    public static void main(String[] args) {
        String word = "Kurt";
        char letter = 'r';
        int index  = -1;

        for (int i = 0; i<word.length(); i++){

            if (word.charAt(i)==letter){
                index = i;
                System.out.println(letter + " is found at index " + index);
                break;
            }

        }








    }
}
