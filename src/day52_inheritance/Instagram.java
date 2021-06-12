package day52_inheritance;

public class Instagram extends MobileApp{
    public void postPhoto(){
        System.out.println("posting photo on instagram");
    }

    @Override
    public void useTheApp(int minutes){
        System.out.println("using instagram app features");
        postPhoto();
    }


}
