package day50_inhertance;

public class StaticBlockTest {
    public static void main(String[] args) {
        StaticBlockDemo str1 = new StaticBlockDemo();
        StaticBlockDemo str2 = new StaticBlockDemo();
        StaticBlockDemo str3 = new StaticBlockDemo();
        System.out.println(StaticBlockDemo.num);
        StaticBlockDemo st4 = new StaticBlockDemo(50);
        System.out.println(StaticBlockDemo.num);


    }
}
