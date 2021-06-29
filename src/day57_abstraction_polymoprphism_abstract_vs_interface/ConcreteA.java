package day57_abstraction_polymoprphism_abstract_vs_interface;

public class ConcreteA extends AbstractA implements InterfaceA, InterfaceB {

    @Override
    public void absMethodA(){
        System.out.println("absMethodA implementation is called");
    }

    @Override
    public void methodB(){
        System.out.println("methodB overriden version is called");
    }


    public static void staticMethodC(){
        System.out.println("static methid C hidden version is called");
    }

    @Override
    public void absMethodD(int num){
        System.out.println("");
    }





}
