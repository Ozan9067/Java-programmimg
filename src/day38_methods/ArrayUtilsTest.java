package day38_methods;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int [] nums = {5,23,1,90,543};
        ArraysUtil.printArray(nums);

        ArraysUtil.printArray(new int[] {1,2,3,4,5,6,7,8,9});


        System.out.println("sum = " + ArraysUtil.sum(nums));
        System.out.println("sum = " + ArraysUtil.sum(new int[] {1,2,3,4,5,6,7,8,9}));

        int[] nums2 = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(ArraysUtil.contains(nums2, 3));


    }
}
