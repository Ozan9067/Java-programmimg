package OfficeHours.Practice_06_01_2021;
/*
- create a class called ScrumTeam

               Attributes:
                            PO, BA, SM,
                            ArrayList<Tester> testersList = new ArrayList<>(),
                            ArrayList<Developer> devopsList = new ArrayList<>(),
                            hasSprint, hasMeeting

                Constructor:
                      sets the names of: PO, BA, SM

                Actions:

                   addTester(Tester tester): adds the given tester to the testers arraylist

                   addTesters(Tester[] testers): adds the given testers to the testers arraylist

                   addDeveloper(Developer developer): adds the given developer to the developers arraylist

                   addDevelopers(Developer[] developers): adds the given developers to the developers arraylist

                   removeTester(long employeeID): removes the given tester from the testers arraylist

                   removeDeveloper(long employeeID): removes the developer from the developers arraylist

                   toString(): prints number of tester,& developers,  PO name, SM name, BA name
 */

import java.util.ArrayList;

public class ScrumTeam {
    String PO;
    String BA;
    String SM;

    ArrayList<Tester> allTesters = new ArrayList<>();
    ArrayList<Developer> allDevelopers = new ArrayList<>();


    public ScrumTeam(){
        this.PO = PO;
        this.BA = BA;
        this. BA = BA;
    }


}
