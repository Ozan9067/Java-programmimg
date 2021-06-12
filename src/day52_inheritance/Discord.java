package day52_inheritance;

public class Discord extends MobileApp{
    public void chat(String someone){
        System.out.println("chatting with " + someone + " on discord ");
    }




    @Override
    public void useTheApp(int minutes){
        super.useTheApp(minutes);
        chat("ozan");
    }

    public void printInfo(){
        System.out.println("app name  = " + getName());
        System.out.println("app version = " + getVersion());
    }


}
