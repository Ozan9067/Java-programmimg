package OfficeHours.Practice_03_30_2021;

public class PrefixAgain {
    public static void main(String[] args) {


        String str = "abXYabc";
        int n = 1;

        String preFix = str.substring(0,n);
        String remaining = str.substring(n);

        System.out.println(remaining.contains(preFix));



    }
}
