package day14_multibranch_if_statements;

public class DayActivity {
    public static void main(String[] args){

        String weather = "sunny";

        if (weather.equals("sunny")){
            System.out.println(weather + " - go to the park, hiking , and code java");
        }else if (weather.equals (weather + " - rainy")){
            System.out.println(weather + " - stay home, drink tea, and code java");
        }else if(weather.equals ("snowy")){
            System.out.println(weather + " - clean the car, build snowman and code java");
        }else if (weather.equals ("windy")){
            System.out.println(weather + " - Get ready for power loss, fly a kite, and code java");
        }else {
            System.out.println("just keep coding java");
        }
    }
}
