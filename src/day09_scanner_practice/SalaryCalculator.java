package day09_scanner_practice;

// WITHOUT SCANNER

public class SalaryCalculator {
    public static void main(String[] args){
        System.out.println("Enter hourly rate: ");
        double hourlyRate = 50.0;
        double weeklyPay = hourlyRate * 40;
        double monthlyPay = weeklyPay * 52 /12;
        double annualPay = monthlyPay *12;


        System.out.println("weekly pay: " + weeklyPay);
        System.out.println("monthly pay : " + monthlyPay);
        System.out.println("annual pay: " + annualPay);

    }
}
