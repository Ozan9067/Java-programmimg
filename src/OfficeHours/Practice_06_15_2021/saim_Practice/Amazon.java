package OfficeHours.Practice_06_15_2021.saim_Practice;

public class Amazon extends OnlineShopping implements AllowUserToSell{


    @Override
    public void viewCart() {
        System.out.println("viewing amazon cart");
    }

    @Override
    public boolean payForShipping(double price) {
        return price < 50;
    }

    @Override
    public void buyItem() {

        System.out.println("buying amazon item");
    }

    @Override
    public void returnItem() {

        System.out.println("retutning amazon item");
    }

    @Override
    public void uploadProduct() {

    }
}
