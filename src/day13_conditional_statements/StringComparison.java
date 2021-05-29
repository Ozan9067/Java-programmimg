package day13_conditional_statements;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class StringComparison {
    public static void main(String[] args) {

        String city = "los angeles";

        if (city.equals("los angeles")){
            System.out.println("it is LA");
        }else{
            System.out.println("it is not LA");
        }

        String weather ="sunny";

        if (weather.equals("sunny")){
            System.out.println("nice weather");
        }else{
            System.out.println("bad weather");
        }




    }
}
