package day51_inheritance;

public class Contractor extends Employee{


     // 1- lets everyone know that ur overriding
     //2 - ensures that this method is being overriden, if not shows error


    public double calculatorSalary(double hourlyRate){



        return 50 *40 * hourlyRate;

    }

}
