package day50_inhertance;

import javax.lang.model.SourceVersion;

public class InheritanceTest {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "Ozan";
        p1.age = 30;

        p1.talk();
        p1.walk();
        p1.work("SDET");

        Teacher t1 = new Teacher();
        t1.teacherId = 1234;
        t1.name ="saim";
        t1.age=25;
        t1.talk();
        t1.talk();
        t1.teach("JAVA");

        System.out.println(p1.name);
        System.out.println(t1.name);


        Student  student = new Student();
        student.name = "Ali";
        student.age = 33;
        student.walk();
        student.talk();
        student.work("Java Programmer");
        student.school = "cybertek";
        student.study("java programming language");

        System.out.println("student = " + student);


    }
}
