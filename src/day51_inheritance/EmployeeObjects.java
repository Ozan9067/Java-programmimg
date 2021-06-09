package day51_inheritance;

import com.sun.javafx.scene.control.ControlAcceleratorSupport;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.naming.ldap.Control;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee developer = new Employee();

        developer.jobTitle = "java developer";
        System.out.println("developer.calculateSalary(55.0) = " + developer.calculateSalary(55.0));

        double annualDevSalary = developer.calculateSalary(60.0);
        System.out.println("annualDevSalary = " + Math.round(annualDevSalary));

        Contractor sdetContractor = new Contractor();
        sdetContractor.jobTitle = "SDET";
        double sdetSalary =sdetContractor.calculatorSalary(65);
        System.out.println("sdetContractor = " + sdetSalary);

        System.out.println(developer.toString());
        System.out.println(sdetContractor);


    }
}
