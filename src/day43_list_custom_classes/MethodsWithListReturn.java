package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;

public class MethodsWithListReturn {
    /**
     * getIntegerLIst
     * return List<Integer></Integer>
     */

    public static void main(String[] args) {

        long start = System.nanoTime();


        List<Integer> mlsNums = getIntegerList(); //returns ready ArrayList object
        //System.out.println(mlsNums);

        long end = System.nanoTime();
        System.out.println("ArrayList time = " + (end - start));





        long st = System.nanoTime();
        int[] arr =getIntegerArray();
        long en = System.nanoTime();
        System.out.println("Array time = " + (en - st));




    }

    public static List<Integer> getIntegerList(){

        List<Integer> nums = new ArrayList<>();

        for(int i = 0 ; i <100000 ;i++){
            nums.add(i);
        }
        return nums;
    }

    /**
     * get integerarray
     * no prarms
     *return int
     * loop from 0 100_000
     */



    public static int[] getIntegerArray() {
        //declare empty array with size - 1_000_001
        int[] nums = new int[1_000_001];
        //loop and assign numbers
        for(int i = 0; i <= 1_000_000; i++) {
            nums[i] = i;
        }
        return nums; //return
    }

    /**
     * getDays
     *
     */





}
