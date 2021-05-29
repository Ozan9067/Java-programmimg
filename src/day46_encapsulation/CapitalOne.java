package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {

        CheckingAccount acc = new CheckingAccount();
        acc.setAccountNumber(4324235435l);
        acc.setBalance(250.50);
        acc.setAccountHolder("Mike Smith");
        acc.setTyoe("360 checking");

        System.out.println("acc = " + acc.toString());

    }
}
