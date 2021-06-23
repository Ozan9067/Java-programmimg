package day55_abstraction.interfaces_demo;

public class DriverObjects {
    public static void main(String[] args) {
       // WebDriver driver = new WebDriver() ;// CANNOT create object of interface
        ChromeDriver driver1 = new ChromeDriver();
        FirefoxDriver driver2= new FirefoxDriver();
        WebDriver driver3  = new ChromeDriver();

        driver1.get("https://www.google.com");
        driver1.findElement("//input[@name='q']");
        System.out.println("title = " + driver1.getTitle());


    }

}
