package OfficeHours;

import java.util.*;

public class Practice02020 {
    public static String merge(String s1, String s2)
    {
        // To store the final string
        StringBuilder result = new StringBuilder();

        // For every index in the strings
        for (int i = 0; i < s1.length() || i < s2.length(); i++) {

            // First choose the ith character of the
            // first string if it exists
            if (i < s1.length())
                result.append(s1.charAt(i));

            // Then choose the ith character of the
            // second string if it exists
            if (i < s2.length())
                result.append(s2.charAt(i));
        }

        return result.toString();
    }

    // Driver code
    public static void fib(int num){
        //WRITE YOUR CODE HERE

        int[] nums = new int[num + 1];

        for(int i  = 2 ; i < nums.length ; i++){
            nums[0] = 0;
            nums[1] = 1;
            nums[i] = nums[i-1]+nums[i-2];

        }
        System.out.println(nums);







    }

}















/*
        int number = 5;
        while (number < 100 ){
            number += number;
        }
        System.out.println(number);

/*
        String s = "the game was tied at 2-2";
        String s2 = s.substring(5);

        int index1 = s.indexOf("game");
        int index2 = s2.indexOf("game");

        if (index1 == index2){
            System.out.println(index1);
        }else {
            System.out.println(index2);
        }

g














        //int n = scan.nextInt();
            //WRITE YOUR CODE HERE


            // double decimal = 13.142;
            // int whole = decimal < 20 ? 20 : 10;

            // System.out.println(whole);

//******************************************************************************************************


/*
Write a return method that can find the frequency of characters

Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */










