package OfficeHours.Practice_05_18_2021;

import java.util.ArrayList;

public class RemoveLongStrings {
    public static void main(String[] args) {


    }

    public static ArrayList<String> removeLongStrings(ArrayList<String> list, int minLength){

        ArrayList<String> validStrings = new ArrayList<>();

        for(String word : list){
            if(word.length() >= minLength ){
                validStrings.add(word);
            }
        }
        return validStrings;
    }

    public static  ArrayList<String> removeLongStrings2 (ArrayList<String> list, int minLength){

        list.removeIf( each -> each.length() < minLength);
        return list;
    }


}