package OfficeHours.Practice_03_16_2021;
/*

BMI: Program will ask user to enter their mass (kilogram) and their height (meters).
Calculate their BMI and then print the appropriate message based on the provided values:
 All numbers taken as doubles
—> BMI Formula: BMI = mass / height^2
—> Values:
Less than 18.5 — Underweight
From 18.5 to 25 — Normal weight
From 25 to 30 — Overweight
More than or equal to 30 — Obese

 */

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class BMI {
    public static void main(String[] args) {

        double mass =62.4;
        double height = 1.65;
        double BMI = mass / (height * height);

        if (BMI < 18.5){
            System.out.println("underweight");
        }else if(BMI >= 18.5 && BMI<25){
            System.out.println("normal weight");
        }else if (BMI >= 25 && BMI < 30){
            System.out.println("over weight");
        }else{
            System.out.println("obese");
        }


    }
}
