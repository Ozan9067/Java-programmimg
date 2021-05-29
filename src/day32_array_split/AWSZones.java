package day32_array_split;

import day12_comparison_operators.IfElseStatement;

public class AWSZones {
    public static void main(String[] args) {

        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";

        System.out.println("--------String deployment of  etsy app to AWS zones---------");
        String[] zonesToDeploy = zones.split(",");

        for(String eachZone : zonesToDeploy){

            System.out.println("deploying [" + app+"] to "+ eachZone + "....");
        }













    }
}
