package day50_inhertance;

public class eBook extends Book{

    int size;
    int pages;


    public void readBook(){
        System.out.println("Reading book: ");
        System.out.println("Title = " + title);
        System.out.println("author = " + author);
        System.out.println("size = " + size);
        System.out.println("pages = " + pages);
    }

}
