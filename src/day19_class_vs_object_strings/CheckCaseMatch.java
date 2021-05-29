package day19_class_vs_object_strings;

public class CheckCaseMatch {
    public static void main(String[] args) {
// are all letters uppercase?
        String countryCode ="Turkey";

        if (countryCode.equals(countryCode.toUpperCase())){
            System.out.println("correct");
        }else {
            System.out.println("incorrect");
        }



    }
}
