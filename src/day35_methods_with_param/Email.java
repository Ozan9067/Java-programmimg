package day35_methods_with_param;

public class Email {
    public static void main(String[] args) {
        buildEmail("Ozan", "Cybertek");
        buildEmail("Muro ward", "verizon");
        workEmail("Ozan Orkun", "Unal" );

    }

    public static void buildEmail(String name, String domain){
        name = name.replace(" ", "_").toLowerCase();
        domain = domain.toLowerCase();
        String email = (name + "@" + domain + ".com");

        System.out.println(email);
    }

    public static void workEmail (String name, String company){
        name = name.replace(" ", "_").toLowerCase();
        company = company.toLowerCase();
        String email = (name + "@" + company + ".com");

        System.out.println(email);


    }

}
