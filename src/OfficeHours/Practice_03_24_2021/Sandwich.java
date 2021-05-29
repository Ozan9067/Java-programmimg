package OfficeHours.Practice_03_24_2021;
//get whatever is in between the breads
public class Sandwich {
    public static void main(String[] args) {

        String str = "breadjambread";

        if (str.contains("bread")){
            int firstBread =  str.indexOf("bread");
            int lastBread = str.lastIndexOf("bread");
            System.out.println(str.substring(firstBread + 5 , lastBread));

        }else {
            System.out.println("nothing");
        }










    }
}
