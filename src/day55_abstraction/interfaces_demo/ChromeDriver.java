package day55_abstraction.interfaces_demo;

public class ChromeDriver implements WebDriver {


    @Override
    public void get(String url) {
        System.out.println("chrome driver - get method");
    }

    @Override
    public void findElement(String locator) {
        System.out.println("chrome driver 0 findlemeent method");
    }

    @Override
    public void quit() {
        System.out.println("chrome driver - quit method");
    }

    @Override
    public String getTitle() {
        return null;
    }
}
