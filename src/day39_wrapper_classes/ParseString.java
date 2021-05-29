package day39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {


        String total = "345";
        int count = Integer.parseInt(total);
        System.out.println(count);

        String strPrice = "123.99";
        double count1 = Double.parseDouble(strPrice);
        System.out.println(strPrice);



        String sentence = "I wrote 100 lines of java code";
        String[] sep = sentence.split(" ");
        int linesOfCode = Integer.parseInt(sep[2]);
        System.out.println(sep[2]); //100
        System.out.println(linesOfCode); //100






    }
}
