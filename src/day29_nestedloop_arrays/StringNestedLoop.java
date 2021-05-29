package day29_nestedloop_arrays;

public class StringNestedLoop {
    public static void main(String[] args) {

        String word = "java";

        for (int i = 0; i < word.length(); i++){

            for (int n = i; n < word.length(); n++){
                System.out.print(word.charAt(n));

            }
            System.out.println();

        }














    }
}
