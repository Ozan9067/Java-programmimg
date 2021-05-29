package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i"));

        System.out.println(company.contains("ital"));


        if (company.contains(" ")){
            System.out.println("multiple words");
        }else {
            System.out.println("single word");
        }


        String etsyTitle = "Wooden Spoon | etsy";
        System.out.println(etsyTitle.contains(" | "));


        String firstName = "ahmed";
        if (firstName.contains("a") && firstName.contains("e")){
            System.out.println("both a and e are present ");
        }else {
            System.out.println("a and e not included");
        }


        firstName = "Nadir";
        if (firstName.contains("k") || firstName.contains("i")){
            System.out.println("a or i is present");

        }else {
            System.out.println("a or i is not present");
        }


        String email = "ozanunal@gmail.com";
        if (email.contains("@") && email.endsWith(".com")){
            System.out.println("email has @ and ends with .com");
        }else {
            System.out.println("invalid email");
        }

        if (email.toLowerCase().contains("g")){   //METHOD CHAINING
            System.out.println("v");
        }









    }
}
