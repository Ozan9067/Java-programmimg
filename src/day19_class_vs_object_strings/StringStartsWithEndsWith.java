package day19_class_vs_object_strings;

public class StringStartsWithEndsWith {
    public static void main(String[] args) {
        String word = "area code";

        System.out.println(word.startsWith("a")); //true

        System.out.println("java".startsWith("j")); // true

        System.out.println(word.endsWith("ode"));   //true

        System.out.println(word.endsWith("k"));    // false




        String firstName = "Mr Ozan";

        if (firstName.startsWith("Mr")){
            System.out.println("Man");
        }else if (firstName.startsWith("Dr")){
            System.out.println("Doctor");
        }else if (firstName.startsWith("Mrs")){
            System.out.println("Married Woman");
        }else if(firstName.startsWith("Ms")){
            System.out.println("Single woman");
        }else if (firstName.startsWith("Sr")){
            System.out.println("Senior");
        }else {
            System.out.println("general name");
        }


        /*
        String url = "https://www.stockoverflow.com"
        .com = commercial
        .ru   = russian website
        .gov = government website
        .edu = education web
        .org =
         */











    }
}
