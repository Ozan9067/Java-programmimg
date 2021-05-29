package day38_methods;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println(isNullOrEmpty("hello"));
        String word = null;

        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));
        word = "";
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));


    }

    public static boolean isNullOrEmpty(String str){
        //return (str ==null || str.isEmpty());        //same thing

        if (str==null || str.length()==0){
            return true;
        }
        return false;

    }

    public static boolean isPalindrome(String str){
        boolean palindrome = false;
        for (int i = 0 ; i < str.length()/2;i++) {

            if(str.toLowerCase().charAt(i) != str.toLowerCase().charAt(str.length()-1-i)) {
                return false;

            }
        }
        return true;
    }


    public static String reverse(String str){
        String strReverse = "";

        for (int i = str.length()-1 ; i >= 0 ;i--  ){
            strReverse += str.charAt(i);
        }
        return strReverse;


    }




}
