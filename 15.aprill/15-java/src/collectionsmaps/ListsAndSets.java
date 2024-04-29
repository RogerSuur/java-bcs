package collectionsmaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ListsAndSets {
    public static void main(String[] args) {
        

        //fruitlist();
        valuelist();
    }

    private static void valuelist() {
        
        List<Integer> numbers = new ArrayList<>(List.of(1,1,2,3,4,4,5,6));
        Integer[] arr = {1,1,2,3,4,4,5,6};

        Set<Integer> setNumbers = new HashSet<>(Arrays.asList(arr));

        setNumbers.add(1);

    }

    private static void fruitlist() {
        
        List <String> fruits = new ArrayList<>(List.of("apple", "pear", "plum"));
    }

    

    
}
