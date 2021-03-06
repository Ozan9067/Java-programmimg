package day18_conditions_practice_strings_intro;

/*
main method

Winter: 12,1,2
Spring: 3,4,5
Summer: 6,7,8
Fall:   9,10,11

when month = 2;
    OUTPUT:
        "Winter"

when month = 7;
    OUTPUT:
        "Summer"

 */

public class SwitchSeasonFinder {
    public static void main(String[] args) {


        int month = 15;

        if (month ==12 || month == 1 || month == 2){
            System.out.println("winter");
        }else if (month == 4 || month == 3 || month == 5){
            System.out.println("spring ");
        }



        switch(month){
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            default:
                System.out.println("invalid month");
                break;


        }






    }
}
