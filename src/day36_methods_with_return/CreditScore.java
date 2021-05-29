package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {

        CheckEligible(720);
        CheckEligible(400);
        System.out.println(getCreditScore());
        System.out.println("Score = " + getCreditScore());
        int score = getCreditScore();
        System.out.println("score = " + score);


    }

    public static void CheckEligible (int creditScore){
        if(creditScore >= 700){
            System.out.println("you are eligible to lease this car");
        }else {
            System.out.println("sorry, uou are not eligible to lease this car");
        }

    }

    public static int getCreditScore(){
        return 800;

    }







}
