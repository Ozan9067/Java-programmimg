package day37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {
        loginVoid("cybertek student", "abc123");
        loginVoid("cybertek", "ifrogto");
        loginVoid("","");


        System.out.println(login("cybertek Student", "abc123"));

        //if(loginVoid("",""))         // WONT WORK

        if (login("cybertek student", "abc123")){
            System.out.println("welcome to cybertek");
            System.out.println("select course to continue");
        }else {
            System.out.println("login failed");
        }

        boolean isSuccessful = login("nadir", "mountain");
        System.out.println("isSuccessful = " + isSuccessful);
    }
    
    
    public static void loginVoid (String username, String password){
        String secretUsername = "cybertek student";
        String secretPassword = "abc123";

        if (username.equalsIgnoreCase(secretUsername) && password.equals(secretPassword)) {
            System.out.println("Log un successful, welcome Cybertek student");
        }else {
            System.out.println("incorrect username or password");
        }
    }

    public static boolean login(String username, String password) {
        String secretUsername = "cybertek student";
        String secretPassword = "abc123";

        if (username.equalsIgnoreCase(secretUsername) && password.equals(secretPassword)) {
            return true;
        } else {

            return false;


        }

    }
}
