package day55_abstraction.interfaces_demo;

public class FirefoxDriver implements WebDriver {


    @Override
    public void get(String url) {
        System.out.println("firefox driver - get method ");
    }

    @Override
    public void findElement(String locator){

        System.out.println("firefox driver - findElement method ");

    }

    @Override
    public void quit() {
        System.out.println("firefox QUIt method ");

    }

    @Override
    public String getTitle() {
        return null;
    }
}
