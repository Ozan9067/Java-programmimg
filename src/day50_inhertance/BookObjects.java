package day50_inhertance;

public class BookObjects {
    public static void main(String[] args) {

        Book book = new Book();
        book.title = "intro to java";
        book.title = "stavich";
        book.type = "programming";
        book.price = 80.5;

        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.type);
        System.out.println(book.price);

        AudioBook audioBook =  new AudioBook();
        audioBook.author = "Orkun";
        audioBook.length = 60;
        audioBook.narrator= "irina";
        audioBook.price = 44.99;
        audioBook.title = "selenium cookbook";
        audioBook.type = " automation";
        audioBook.listen();

        eBook EBook = new eBook();
        EBook.title = "Java data structures";
        EBook.author = "Savitch";
        EBook.type = "programming";
        EBook.price = 85.0;
        EBook.size = 2;
        EBook.pages = 1000;
        EBook.readBook();




    }
}
