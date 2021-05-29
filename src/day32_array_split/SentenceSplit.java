package day32_array_split;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence= "java is fun";

        String[] words = sentence.split(" ");
        System.out.println("1st word is - " + words[0]);
        System.out.println("2nd word is - " + words[1]);
        System.out.println("3rd word is - " + words[2]);
        //System.out.println("4th word is - " + words[3]);  OUT OF BOUNDS




        String googleResult = "About 1,810,000 results (0.68 seconds)";

        String[] i = googleResult.split(" ");
        System.out.println("Count = "+i[1]);
        System.out.println("Seconds = "+ i[3].replace("(",""));








    }
}
