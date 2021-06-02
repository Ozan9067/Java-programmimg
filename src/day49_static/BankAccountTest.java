package day49_static;

public class BankAccountTest {
    public static void main(String[] args) {
        MyBankAccount me = new MyBankAccount();
        me.user = "ozan";
        me.showBalance();
        me.spend(100);
        me.showBalance();

        MyBankAccount wife = new MyBankAccount();
        wife.user = "wife";
        wife.showBalance();
        wife.spend((223));
        wife.showBalance();


    }
}
