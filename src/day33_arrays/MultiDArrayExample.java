package day33_arrays;
import java.util.*;

public class MultiDArrayExample {
    public static void main(String[] args) {
        String[][] users = new String[3][2];
        users[0][0] = "Teadora Tsvetanov";
        users[0][1] = "TeadprasPWD12";
        users[1][0] = "Anna Ziyayeva";
        users[1][1] = "AnnaAlmaty123";
        users[2][0] = "Parvin Altae";
        users[2][1] = "ParvinViena123";

        String[][]  userData = { {"Teadora Tsvetanov","TeadprasPWD12" },
                {"Anna Ziyayeva","AnnaAlmaty123" },
                {"Parvin Altae","ParvinViena123" }};


        System.out.println(userData[0][0].split(" ")[0]);
        System.out.println(userData[1][0]);
        System.out.println(userData[2][0]);

        System.out.println(userData[0][1]);
        System.out.println(userData[1][1]);
        System.out.println(userData[2][1]);

        System.out.println(Arrays.deepToString(userData));






    }
}
