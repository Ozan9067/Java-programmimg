package day50_inhertance;

public class AudioBook extends Book{

    int length;
    String narrator;




    public void listen(){
        System.out.println("listening to AudioBook");
        System.out.println("title = " + title);
        System.out.println("author = " + author);
        System.out.println("length = " + length);
        System.out.println("price = " + price);
        System.out.println("narrator = " + narrator);

    }


}
