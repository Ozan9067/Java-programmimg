package day57_abstraction_polymoprphism_abstract_vs_interface;

public interface InterfaceA {


    public static final String TYPE = "Interface";
    double MAX_COUNT= 500; //this is also public static final

    //interface cannot have a constructor





    public abstract void absMethodD(int num);


    public static void staticMethodE(String str){
        System.out.println("static method E is called with str - " + str);
    }

    public default void defaultMethodF(){
        System.out.println("defaultMethodF is called");
    }


}
