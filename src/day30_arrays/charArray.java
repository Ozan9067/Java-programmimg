package day30_arrays;

public class charArray {
    public static void main(String[] args) {
        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};

        for (char i : letters){
            System.out.print(i);

        }

        String sentence = new String(letters);  // only works when converting char into string
        System.out.println("\nsentence  = " + sentence);


        String item = "wooden spoon";
        char[] itemArray = item.toCharArray();
        System.out.println("itemArray.length = " + itemArray.length);
        System.out.println("item.length() = " + item.length());

        String[] fruits = {"bananas", "apples", "kiwi", "mango", "papaya", "strawberry"};


     for(String each : fruits) {
         System.out.print(each + "-");
     }






    }
}
