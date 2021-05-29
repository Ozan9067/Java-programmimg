package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;

        String response  = (hourlyRate>45)?"accept": "reject"; //ternary




        String todaysClass = "java";

        String teacher = (todaysClass.equals ("java"))? "saim/murodil": "nadir";
        System.out.println("teacher = " + teacher);


        
        
        boolean isEligibleToDrive = true;
        
        String driving =(isEligibleToDrive) ?"has DL and can drive" : "no DL, cannot drive";
        System.out.println("driving = " + driving);
        
        



    }
}
