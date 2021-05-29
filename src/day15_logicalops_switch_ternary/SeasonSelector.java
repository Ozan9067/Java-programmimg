package day15_logicalops_switch_ternary;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class SeasonSelector {
    public static void main(String[] args) {

        char grade = 'C';
        grade = 'A';

        if (grade == 'A' || grade == 'B' || grade == 'C'){
            System.out.println("passed with " + grade);
        }else if (grade == 'D'){
            System.out.println("qualify for a retake, grade = " + grade);
        }else if(grade == 'E'){
            System.out.println("failing grade, grade = " + grade);
        }else{
            System.out.println("invalid grade - " + grade);
        }









    }
}
