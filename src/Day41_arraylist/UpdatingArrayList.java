package Day41_arraylist;

import java.util.ArrayList;
import java.util.*;


public class UpdatingArrayList {
    public static void main(String[] args) {
        //cars list
        List<String> myCars = new ArrayList<>();


        myCars.add("toyota");
        myCars.add("mazda");
        myCars.add("ford");
        myCars.add("moskvich");
        myCars.add(0, "jeep");
        myCars.add(1, "lada");
        myCars.add(2, "yugo");


        System.out.println(myCars);
        String allCarsIn1St = myCars.toString(); // saves all cars 1 string variable  

        System.out.println("allCarsIn1St = " + allCarsIn1St);

        //change index 0 to lambo
        myCars.set(0,"lamborghini");
        System.out.println("after set = " + myCars);


        // change index 4 to honda
        myCars.set(4, "honda");
        System.out.println(myCars);

        //if it was array it would be  |  myCars[4] = "honda"

        
        // find index number of ford
        System.out.println("index of ford = " + myCars.indexOf("ford"));

        int moskvichIndex = myCars.indexOf("moskvich");
        System.out.println("moskvichIndex = " + moskvichIndex);


        //change moskvich to jiguli
        myCars.set(moskvichIndex,"jiguli");
        System.out.println(myCars);

        // replace ford with trabant
        myCars.set(myCars.indexOf("ford"), "trabant");
        System.out.println("after set to trabant = " + myCars);


        // change lada to bugatti
        //if myCars contains lada, find index and change to bugatti

        if(myCars.contains("lada")){
            myCars.set(myCars.indexOf("lada"),"bugatti");
        }else {
            System.out.println("lada is not present");
        }

        System.out.println("after st to bugatti = " + myCars.toString());

        for(int i = 0; i<myCars.size()-1; i++){

            if(myCars.get(i).equals("lamborghini")){
                //change to prius
                myCars.set(i, "prius");
            }else if (myCars.get(i).equals("toyota")){
                myCars.set(i,"lexus");
            }else if(myCars.get(i).equals("trabant")){
                myCars.set(i, "auidi");
            }
            System.out.println("after loop = "+myCars);

        }





















    }
}
