package day19_class_vs_object_strings;

/*
add new class LoginTest
main method

expUserName = "cybertek"
expPassword = "Abc123"

userName = "CYBERTEK"
password = "Abc123"

userName is not case sensitive
password is case sensitive

WHEN expUserName equals userName AND expPassword equals password
    -> "Pass - user successfully logged in"

OTHERWISE:
    WHEN expUserName NOT equals userName
        -> "Incorrect Username"
    OTHERWISE:
        -> "Incorrect password"
 */

public class LoginTest {
    public static void main(String[] args) {
        String expUserName = "Cybertek";
        String expPassword = "abc123";

        String userName = "CYBERTEK";
        String password = "abc123";

        if (expUserName.equalsIgnoreCase(userName) && expPassword.equals(password)){
            System.out.println("pass - user logged in successfully");
        }else {
            if (!expUserName.equalsIgnoreCase(userName)){
                System.out.println("not able to login ");
            }else {
                System.out.println("not able to log in");
            }



        }




        }

    }
