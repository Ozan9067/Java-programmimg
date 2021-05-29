package OfficeHours.Practice_04_21_2021;

/*
An array inhabitants represents cities and their respective populations. For example,
the following arrays shows 8 cities and their respective populations:

[3, 6, 0, 4, 3, 2, 7, 1]

Some cities have a population of 0 due to a pandemic zombie disease that is wiping out the human lives.
After each day, every city will lose half of its population.

Write a program to loop though each city population and make it lose half of its population
until all cities have no humans left. Make updates to each element in the array And print the array like below
for each day:

Day 0 [3, 6, 0, 4, 3, 2, 7, 1]
Day 1 [1, 3, 0, 2, 1, 1, 3, 0]
Day 2 [0, 1, 0, 1, 0, 0, 1, 0]
Day 3 [0, 0, 0, 0, 0, 0, 0, 0]
---- EXTINCT ----
 */

import java.util.Arrays;

public class ZombieAttack2 {
    public static void main(String[] args) {

        int[]  inhabitants = {3,6,0,4,3,2,7,0};
        int days = 0;

        System.out.println("day: " + days++ + Arrays.toString(inhabitants));

        while (!Arrays.equals(inhabitants, new int[8])) {

            int [] temp = Arrays.copyOf(inhabitants, inhabitants.length);

            for(int i = 0; i < inhabitants.length; i++){

                if(inhabitants[i] == 0){

                    if(i ==0){
                        temp[i +1]= temp[i+1]/2;
                    }else if(i == inhabitants.length-1){
                        temp[i +1]= temp[i+1]/2;
                        temp[i -1]= temp[i-1]/2;

                    }


                }

            }

            inhabitants = Arrays.copyOf(temp, temp.length);
            System.out.println("day = " + days++ + " " + Arrays.toString(inhabitants));


        }



    }
}
