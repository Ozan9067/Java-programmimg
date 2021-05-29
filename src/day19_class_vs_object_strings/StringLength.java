package day19_class_vs_object_strings;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class StringLength {
    public static void main(String[] args) {
        String word = "Ozan";
        System.out.println(word.length());
        System.out.println("count = " + word.length());

        System.out.println("wooden spoon".length());

        String fullName = "OzanUnal";
        System.out.println(fullName + " - " + fullName.length());

        double count = fullName.length();
        System.out.println(count);





// paswword must be at least 6 characters
        String password = "ab123";
        if (password.length() >= 6){
            System.out.println("valid amazon password");

        }else{
            System.out.println("password is too short");
        }





    }
}
