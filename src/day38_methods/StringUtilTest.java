package day38_methods;

import static day38_methods.StringUtils.*;

public class StringUtilTest {
    public static void main(String[] args) {
        String userName = "";

        if (StringUtils.isNullOrEmpty(userName)){
            System.out.println("FAIL= Null or empty");
        }


        if (StringUtils.isPalindrome("civic")){
            System.out.println("is palindrome");
        }else {
            System.out.println("not palindrome");
        }

        System.out.println("isPalindrome(kayak) = " + StringUtils.isPalindrome("kayak"));
        System.out.println("isPalindrome(cybertek) = " + isPalindrome("cybertek"));
        System.out.println("Reverse(java) = " + StringUtils.reverse("java"));




    }
}
