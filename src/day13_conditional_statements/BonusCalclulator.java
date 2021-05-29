package day13_conditional_statements;

public class BonusCalclulator {
    public static void main(String[] args) {
        double bonus;
        double salesAmount = 5000.0;

        if (salesAmount <= 1000) {
            System.out.println("good job, you have qualified for a bonus");
            bonus = 50.0;
        } else {
            System.out.println("great job, you have qualified for a full bonus");
            bonus = 100.0;
        }
        System.out.println("your total bonus : $" + bonus);



    }
}
