package day29_nestedloop_arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        int[] nums = new int[3];
        nums[0] = 4;
        nums[1] = 8;
        nums[2] = 22;

        System.out.println(nums[0]);
        System.out.println("value at index 1 = " + nums[1]);


        int i = 0;  // we can also use int variable to specify index number
        System.out.println(nums[i]);
        i++;
        System.out.println(nums[i]);



        //how to find out the size of the array
        System.out.println("number of elements = " + nums.length);


        //store length of array to len
        int len = nums.length;


        //change values in the array
        nums[0] = 100;
        System.out.println(nums[0]);


        //read the value of index 1 and assign to index 2
        nums[2] = nums[1];
        System.out.println(nums[2]);








    }
}
