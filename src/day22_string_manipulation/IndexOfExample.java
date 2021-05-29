package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {

        String technologies = "java, html, css, selenium, testng, maven, cucumber";

        System.out.println(technologies.indexOf(","));  //first comma

        System.out.println(technologies.lastIndexOf(","));


        int indexOfJava =  technologies.indexOf("java");
        System.out.println("java is at index " + indexOfJava);

        int idxOfCss = technologies.indexOf("css");
        System.out.println("idxOfCss = " + idxOfCss);
        
        
        int indexOfCucumber = technologies.indexOf("cucumber");
        System.out.println("indexOfCucumber = " + indexOfCucumber);
        
        int indexOfSql = technologies.indexOf("sql");
        System.out.println("indexOfSql = " + indexOfSql);






    }
}
