package day54_abstraction;

public class Pizza extends MenuItem {


    @Override
    public void prepare() {
        System.out.println("prepare the dam pizza");
    }

    @Override
    public void serve() {
        System.out.println("serve the damn pizza ");

    }
}
