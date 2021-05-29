package day48_constructor_static;

import java.util.ArrayList;
import java.util.List;

public class CustomerObjects {
    public static void main(String[] args) {

        Customer cs1 = new Customer();
        System.out.println(cs1);
        cs1.setId(1);
        cs1.setName("Bob");
        System.out.println(cs1);

        Customer cs2 = new Customer("Mike", 2);
        Customer cs3 = new Customer("John Ward III",23 );
        System.out.println(cs2);
        System.out.println(cs3);

        //array of customers
        Customer[] todaysCustomers = {cs1, cs2, cs3, new Customer("Ozan", 17)};

        //arraylist of customer objects
        List<Customer> customersList = new ArrayList<>();
        customersList.add(cs1);
        customersList.add(cs2);
        customersList.add(cs3);
        customersList.add(new Customer("orkun", 10));
        customersList.add(new Customer("ozi", 11));

        //print info of first customer objectb in array and arraylist
        System.out.println(todaysCustomers[0]);
        System.out.println(customersList.get(0));

        System.out.println(customersList);

        System.out.println("------for loop-------");
        for(int i = 0 ; i< customersList.size() ; i++){
            System.out.println(customersList.get(i));
        }

        System.out.println("------for each loop-------");
        for(Customer eachCustomer : customersList){
            System.out.println(eachCustomer);
        }


        //print all names of customers in the list
        System.out.println("------names only---------");
        for(Customer customerName : customersList){
            System.out.println(customerName.getName());
        }

        //lampda
        System.out.println("----lampda-----");
        customersList.forEach(each -> System.out.println(each.getName()));




    }
}
