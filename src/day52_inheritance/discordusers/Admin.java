package day52_inheritance.discordusers;

public class Admin extends User{

    public Admin(){
        super(); // call super class/user class no-args constructor
        System.out.println("Admin class constructor");
    }

    public Admin(String name, int id){
        super("Admin", name, id);
        System.out.println("admin clas 2 args contructor");
    }




    public String toString(){
        return "Admin{" +
                "role='" + getRole() + '\'' +
                ", name='" + getName() + '\'' +
                ", id=" +getId() +
                '}';

    }

}
