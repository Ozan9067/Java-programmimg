package OfficeHours;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MjPractice {


    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE

        for(int i =0; i<nums.length ; i++){

            boolean isUnique = true;

            for( int x = 0 ; x<nums.length ;i++){

                if(i!=x && nums[i]==nums[x]){
                    isUnique = false;
                }

            }

            if (isUnique)
                System.out.println(nums[i]);

        }






    }




    }



