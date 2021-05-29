package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args){

        String city = "Ankara";

        System.out.println(city.equals("Ankara"));
        System.out.println(city.equals("ankara"));
        System.out.println(city.equals("Ankara "));


        System.out.println(city.equalsIgnoreCase("ankara"));
        System.out.println(city.equalsIgnoreCase("ANKARA"));






    }
}
