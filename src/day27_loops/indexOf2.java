package day27_loops;

public class indexOf2 {
    public static void main(String[] args) {
        String word = "gitghub";
        char letter = 'g';
        int index = -1;

        for (int n = 0; n < word.length(); n++) {
            //System.out.println(n + "-" + word.charAt(n));
            if (word.charAt(n)==letter){
                index = n;
                System.out.println(letter + " is found at index " + index);
                break;  //exits loop
            }

        }


        if (index == -1){
            System.out.println(letter + " is not present ");
        }












    }
}
