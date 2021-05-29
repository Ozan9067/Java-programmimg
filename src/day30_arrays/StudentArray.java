package day30_arrays;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class StudentArray {
    public static void main(String[] args) {
        String[] student1 = new String[5];
        student1[0] = "AD1234";
        student1[1] = "Adam";
        student1[2] = "Smith";
        student1[3] = "B22";
        student1[4] = "202-324-2332";

        String[] student2 = {"MK4421", "Mike", "Bloomberg", "B22"};

        System.out.println("student id = "  + student1[0] );
        System.out.println("student1 firstname = " + student1[1]);
        System.out.println("student1 lastname = " + student1[2]);
        System.out.println("student1 batch num = " + student1[3]);

        System.out.println("student data length: " + student1.length);


        //check if student1 data array copntains 5 items.
        // if true -  data array has correct nu,ber of length
        //if false - data array has incorrect length

        if (student1.length == 5){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }




        if (student1.length == student2.length){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }


        System.out.print(student1[1].toUpperCase()+" "+ student1[2].toUpperCase());

        String mobileNumber = student1[4];
        System.out.println(mobileNumber.length());
        System.out.println(mobileNumber.startsWith("202"));
















    }
}
