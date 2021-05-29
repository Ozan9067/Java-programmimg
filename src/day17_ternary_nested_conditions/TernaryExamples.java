package day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {


        int score = 28;
        String result1 ;
        
        if (score > 60){
            result1 = "pass";
        }else {
            result1 = "fail";
        }

        System.out.println("result1 = " + result1);
        
        String result = (score>60)? "pass" : "fail";  //TERNARY

        System.out.println("result = " + result);
        
        
        //***************************************************************************************
        
        
        

        String quality ="good";
        int x = (quality.equals("good"))? 100 :0;




        //******************************************************************************************
        char grade =(score>90) ? 'A' : 'B';





        //************************************************************************************
        String evenOdd = (score%2==0)? "even" : "odd";

        





    }
}
