package day21_string_manipulation;

public class FirstAndLastTest {
    public static void main(String[] args) {
        String word = "mom";
        char first = word.charAt(0);
        char last = word.charAt(2);

        if (first == last ){
            System.out.println("first and last letter match");
        }else {
            System.out.println("first and last letters do not match");
        }


        if (word.charAt(0) == word.charAt(2)){
            System.out.println("first and last letter match");
        }else {
            System.out.println("first and last letters do not match");
        }

        String friend = "ozan";
        char firstLetter = friend.charAt(0);
        char lastLetter = friend.charAt( friend.length() -1);
        System.out.println(firstLetter);
        System.out.println(lastLetter);

        if (firstLetter == lastLetter){
            System.out.println(friend + "- first and last letters match");
        }else {
            System.out.println(friend + "- first and last do not match");
        }

        String word1 = "javja";
        System.out.println(word1.indexOf("j"));




    }
}
