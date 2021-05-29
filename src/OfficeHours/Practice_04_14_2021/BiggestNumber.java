package OfficeHours.Practice_04_14_2021;

public class BiggestNumber {
    public static void main(String[] args) {

        int[] nums = {4,3,1,4,5,2,4,8,4,8};
        int max = nums[0];
        int secondMax = nums[0];

        for( int each : nums ){

            if(each > max ){
                secondMax = max;
                max = each;
            }
            if(each >secondMax && each < max){
                secondMax = each;
            }

        }

        System.out.println("secondMax = " + secondMax);
        System.out.println("max = " + max);

    }
}
