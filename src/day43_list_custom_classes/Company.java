package day43_list_custom_classes;

public class Company {
    public static void main(String[] args) {

        Employee employee1 = new Employee();

        employee1.name = "Ozan";
        employee1.jobTitle = "SDET";
        employee1.work();

        System.out.println(employee1.name);
        System.out.println(employee1.jobTitle);


        Employee emp2 = new Employee();
        emp2.name = "orkun";
        emp2.jobTitle = "full stack developer";
        emp2.work();

        System.out.println(emp2.name);
        System.out.println(emp2.jobTitle);

    }
}
