package day48_constructor_static;

import java.util.Arrays;

public class CybertekGroups {
    public static void main(String[] args) {

        Group group1 = new Group("CyberBugs"); //dependency injection

        //print size of members
        System.out.println(group1.getMembers().size());
        group1.addMember(("berk"));
        group1.addMember(("orkun"));
        group1.addMember(("ozan"));
        group1.addMember(("bugse"));
        group1.addMember(("hasan"));
        group1.addMember(("okan"));

        System.out.println(group1.getMembers().size());
        System.out.println(group1);

        Group group2 =  new Group("CyberCats");
        group2.setMembers(Arrays.asList("Hakan", "Yusuf", "Ards", "Burak"));
        //print all memebrs - not toString
        System.out.println("group2 members = "+group2.getMembers());

        // use if starement to see if Hakan is group2
        if(group2.getMembers().contains("Hakan")){
            System.out.println("Hakan is a member of group 2");
        }else{
            System.out.println("Hakan is not a part of group2");
        }



    }
}
