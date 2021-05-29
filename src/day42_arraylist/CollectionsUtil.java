package day42_arraylist;
import java.util.*;
public class CollectionsUtil {
    public static void main(String[] args) {

        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j', 'a', 'v', 'a', 'i', 's', 'f', 'u', 'n'));

        System.out.println("size = " + letters.size());
        System.out.println(letters);


        Collections.reverse(letters);
        System.out.println(letters);

        //Collections.frequency(letters, 'a');
        System.out.println(Collections.frequency(letters, 'a'));

        int vCount = Collections.frequency(letters, 'v');
        System.out.println("vCount = " + vCount);

        System.out.println("max char = " + Collections.max(letters));
        System.out.println("min char = " + Collections.min(letters));



        Collections.reverse(letters);
        Collections.replaceAll(letters, 'a','u');
        Collections.replaceAll(letters, 'i','j');
        System.out.println("after replacAll  = " + letters);

        Collections.sort(letters);
        System.out.println("after sort = " + letters);

        List<Integer> nums = Arrays.asList(23, 1, 43, 43, 6, 4, 5);

        System.out.println("nums = " + nums);
        Collections.reverse(nums);
        System.out.println("reversed nums =" +  nums);

        int max = Collections.max(nums);
        System.out.println("max = " + max);
        
        int min = Collections.min(nums);
        System.out.println("min = " + min);

        Collections.shuffle(nums);
        System.out.println("nums after shufle  = " + nums);





    }
}
