package day57_abstraction_polymoprphism_abstract_vs_interface;

public abstract class AbstractA {

    int num1;
    private double price;
    public static int count;
    public final String type = "abstract";
    public static final String  LANGUAGE = "java";

    public AbstractA(){
        System.out.println("abstract a constructor");
    }



    public abstract void absMethodA();
    public void methodB(){
        System.out.println("method B is called");
    }

    public static void staticMethodC(){
        System.out.println("ststic method C is called");
    }


}
