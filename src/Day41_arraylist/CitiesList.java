package Day41_arraylist;

import java.util.ArrayList;

public class CitiesList {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Washington DC");
        cities.add("New York");
        cities.add("Vienna");
        cities.add("Adana");
        cities.add("LA");

        cities.add(0, "Ashgabat");

        System.out.println(cities);


        System.out.println("first city =" + cities.get(0));
        System.out.println("Last city =" + cities.get(cities.size()-1));

        System.out.println("count of items = " + cities.size());

        int size = cities.size();
        System.out.println("there are " + size + " cities in the list");

        for(int i = 0; i <cities.size();i++){
            System.out.print(cities.get(i) + " ");

        }

        System.out.println();

        for(String output :cities){
            System.out.print(output + " ");
        }


        //remove using index
        cities.remove(3);  //means delete vause at index 3

        //remove using object/value
        cities.remove("New York");

        System.out.println("after remove = " + cities);


        //delete/remove all values from list
        cities.clear();
        //make sure its clear , print/spit it out
        System.out.println("size = " + cities);



        //2) using isEmpty
        if (cities.isEmpty()) {
            System.out.println("list is empty");
        }

        //3) check size() == 0
        if(cities.size() == 0) {
            System.out.println("list is empty");
        }






    }




}
