package day30_arrays;

public class ForLoopArray {
    public static void main(String[] args) {
        int[] data ={2,5,23,124,66,32,77,7,90,68,97} ;

        for (int i : data){
            System.out.print(i + " ");
        }



        System.out.println();



        for (int i = 0; i<data.length ; i++){

            System.out.print(data[i] + " ");

        }


        // print last value in array without using .length

        System.out.println(data[data.length-1]);



        for (int idx = data.length -1 ; idx >= 0 ; idx--){
            System.out.println(data[idx]);
        }









    }
}
