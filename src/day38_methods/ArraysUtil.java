package day38_methods;

public class ArraysUtil {
    public static void main(String[] args) {

    }
    public static void printArray(int[] nums){
        for(int num : nums){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int sum(int[] nums){
        int sum = 0;

        for(int n : nums){
            sum += n;
        }
        return sum;

    }

    public static boolean contains(int[] nums2, int num){

        for(int i = 0; i <= nums2.length-1 ; i++){

            if (nums2[i] == num){
                return true;


            }
        }
        return false;


    }

    public static boolean equals(int[] nums1, int[] nums2){

        if(ArraysUtil.equals(nums1, nums2)){
            return true;
        }
        return false;

    }




}
