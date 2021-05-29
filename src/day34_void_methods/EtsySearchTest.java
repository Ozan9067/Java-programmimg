package day34_void_methods;
/*
openBrowser
navigateToEtsyUrl
searchForWoodenSpoon
verifyResultsAreDisplayed
 */

public class EtsySearchTest {
    public static void main(String[] args) {
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultAreDisplayed();
        checkWave();


    }

    public static void openBrowser(){
        System.out.println("1. Open browser to get to a search website.");
    }

    public static void navigateToEtsyUrl(){
        System.out.println("2. Go to etsy website to search.");
    }

    public static void searchForWoodenSpoon(){
        System.out.println("3. Search for wooden spoons on the Etsy website.");
    }

    public static void verifyResultAreDisplayed(){
        System.out.println("4. Make sure the results from the search are displayed.");
    }

    public static void checkWave (){
        System.out.println("5. checking to make sure it works");
    }


}
