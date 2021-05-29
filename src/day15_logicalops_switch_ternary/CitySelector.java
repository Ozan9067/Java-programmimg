package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {

        String city = "Ankara";

        // ankara or tampa

        if (city.equals("Ankara") || city.equals("Tampa")){
            System.out.println("willing to relocate");
        }else {
            System.out.println("not considering");
        }



        String teacher = "Murodil";



        if (teacher.equals("Saim") || teacher.equals("Murodil")){
            System.out.println("java class with " + teacher);
        }else if (teacher.equals("Nadir")){
            System.out.println("soft skills class with " + teacher);
        }else {
            System.out.println("some other class with " + teacher );
        }


        String company=  "Google";
        double salary= 120_000.0;

        if(company.equals("Google") || salary >= 120_000.0){
            System.out.println("accept offer from " + company);
        }else {
            System.out.println("decline the offer " + company);
        }








    }
}
