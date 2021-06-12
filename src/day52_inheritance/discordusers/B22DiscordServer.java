package day52_inheritance.discordusers;

public class B22DiscordServer {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setId(1234);
        user1.setName("Ozan");
        user1.setRole("student");

        System.out.println("=======================================================");

        Admin admin1=  new Admin();
        admin1.setId(17);
        admin1.setName("Orkun");
        admin1.setRole("Admin");

        System.out.println("=======================================================");


        System.out.println(user1);
        System.out.println(admin1);

        Admin admin2 = new Admin("Gullia", 4138);
        System.out.println(admin2.toString());





    }
}
