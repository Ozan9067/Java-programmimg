package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        //location, salary, remote, hasBenefits

        String location = "DC";
        double salary = 120_000.0;
        boolean isRemote = true;
        boolean hasBenefits = true;


        if (location.equals("DC") && salary >= 120_000.0 && isRemote && hasBenefits){
            System.out.println("Sure, I will accept this offer");
        }else {
            System.out.println("Lets negotiate");
        }



    }
}
