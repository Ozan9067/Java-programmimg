package OfficeHours.Practice_06_15_2021.saim_Practice;

public class Ebay extends OnlineShopping implements AllowUserToSell{
    @Override
    public void viewCart() {
        System.out.println("viewing ebay cart");
    }

    @Override
    public boolean payForShipping(double price) {
        return price < 100 ;
    }

    @Override
    public void buyItem() {
        System.out.println("buying ebay item");
    }

    @Override
    public void returnItem() {
        System.out.println("retutning ebay item");
    }

    @Override
    public void uploadProduct() {

    }
}
