package day30_arrays;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {

        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};

        String[] countries = {"Brazil",
                "China",
                "Cuba",
                "Sweden",
                "France",
                "Vietnam",
                "Albania",
                "Brazil",
                "Portugal",
                "China",
                "Philippines",
                "Philippines",
                "China",
                "Philippines",
                "China",
                "Armenia",
                "Philippines",
                "China",
                "Colombia",
                "Philippines",
                "Honduras",
                "Indonesia",
                "Brazil",
                "China",
                "United States",
                "Russia"};

        // print all numbers from prices array that are more than 100

        System.out.println("---------- prices more than 100 -----------");

      for (double eachPrice : prices){

          if (eachPrice > 100.0){
              System.out.print(eachPrice + " ");

          }

      }

        System.out.println("\n---------- Prices between 10 and 70 inclusive-----------");

      for (double eachPrice: prices){

          if (eachPrice >= 10 && eachPrice <=70){

              System.out.print(eachPrice + " ");

          }


      }


        System.out.println("\n-------- count of the prices more than 50------------");
      // count  7
        int count = 0;

        for (double eachPrice : prices){

            if (eachPrice >50){
                count++;
            }
        }
        System.out.println("count is = " + count);








        System.out.println("\n--------countries with name length more than 7-------------");

        for(String  i: countries){


            if (i.length()>=7 ){
                System.out.print(i + " ");


            }
        }






        System.out.println("\n-----------------------prices less than 50---------------------");

        for(double cheapPrice : prices){

            if (cheapPrice <=50){
                System.out.println("Prices below 50 are = " + cheapPrice);
            }

        }






        System.out.println("\n---------------count of the prices less than 50--------------");
        int counter = 0;
        for(double i : prices ){

            if (i <= 50){
                counter++;

            }
        }
        System.out.println("number of prices under 50 = "+counter);













    }
}
