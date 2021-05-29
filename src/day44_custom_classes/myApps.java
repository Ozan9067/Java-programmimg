package day44_custom_classes;

public class myApps {
    public static void main(String[] args) {

        App app1 = new App();
        System.out.println(app1.name);
        System.out.println(app1.version);
        app1.open();
        System.out.println("---------------------------------");
        app1.version = 3.5;
        app1.name = "Uber";
        app1.open();

    }
}
