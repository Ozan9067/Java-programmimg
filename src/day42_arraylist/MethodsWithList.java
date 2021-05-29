package day42_arraylist;

import java.util.*;
import java.util.List;


public class MethodsWithList {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("java"); words.add("html"); words.add("slenium");
        words.add("a"); words.add("input");


        List<Integer> nums = Arrays.asList(23,54,235,4,4,6,8,11);
        int sum = sumIntegerlist(nums);
        System.out.println("sum = " + sum);



        /**
         * methodName = printStrList
         * param = list of strings
         * return void
         * prtints all values seperated by space in same line
         */
    }

    public static void printStrList(List<String> stringList){

        for (String str : stringList){
            System.out.println(str + " ");
        }
        System.out.println();

    }

    public static int sumIntegerlist(List<Integer> nums) {

        int sum = 0;

        for(int i : nums){
            sum += i;

        }


        return sum;
    }


}

