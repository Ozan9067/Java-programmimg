package day03_escape_sequence;


  public class OzanPractice {
      public static void main(String[] args) {
          System.out.println(" _______________");
          System.out.println("|\t\t\t\t|");
          System.out.println("|\t(\t*\t\t|");
          System.out.println("|\t\t\t\t|");
          System.out.println(" ---------------");
          System.out.println("TURKISH FLAG");

          String carModel = "BMW X5";
          String driverName ="Ozan Unal";
          String licenseNum ="6767";
          short speed =55;
          boolean isAutomatic =true;
          char licenseClass ='M';

          System.out.println(licenseClass +" - "+isAutomatic);

          String pizza ="hawaiian";
          int slices =8;
          int people = 4;
          int slicesPerPerson = slices/people ;
          //there are 2 slices per person
          //we ordered hawaiian pizza with 8 slices, 4 people ate 2 slices each

          System.out.println("there are " + slicesPerPerson + " slices per person");


          System.out.println("we ordered " + slices +
                  " slices of " + pizza + " pizza." + people +
                  " people ate " + slicesPerPerson + " slices per person");



          System.out.println("Q");











      }

  }
