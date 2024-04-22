package arrays;
import java.util.Arrays;

public class ArraysAndLoops {
    public static void main(String[] args) {
        
        //printCharacters();
        //printEvenNumbers(36);
        //defineArray();
        // existsInArray(["pear", "apple", "melon", "banana"], "banana");
        // String[] fruits = {"pear", "apple", "melon", "banana"};
        // String deleteValue = "pear";
        //String[] result = deleteFromArray(new String[]{"pear", "apple", "melon", "banana"}, "pear");
        //System.out.println(Arrays.toString(result));
        char[] charArray = populateArray();
        Arrays.sort(charArray);
        System.out.println(Arrays.toString(charArray));

    }
    
    public static void printCharacters() {
        String[] s = {"a", "b", "c", "d"};
        String word = "abcd";
        // for (int i = 0; i < s.length; i++) {
        //     printString(s[i]);
        // }

        // for (String letter : s) {
        //     printString(letter);
        // }
        for (int i = 0; i < word.length(); i++) {
        System.out.println("Character: " + word.charAt(i));
        }
    }

    public static void printString(String s) {
        System.out.printf("Character: %s%n", s);
    }

    public static void printEvenNumbers(int n) {
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void defineArray() {
        String[] arr = {"apple", "pear", "melon"};
        //System.out.println(Arrays.toString(arr));
    }

    public static void existsInArray(String[] array, String value) {
        for (String str : array) {
            if (str == value) {
                System.out.println(str);
            } 
        }
    }

    public static String[] deleteFromArray(String[] array, String value) {
        String [] result = new String[array.length];

        // array puhul on vaja konkreetset asukohta
        // for (String el : array) {
        //     if (!el.equals(value)) {
        //         System.out.println(el);
        //         //add to newarray
        //         //result += value
                
        //     }
        // }

        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(value)) {
                   // System.out.println(array[i]);
                    result[i] = array[i];
            }
        }

        return result;
    }

    public static char[] populateArray() {
        char[] charArr = new char[10];
        //String[] givenStrings = new String{"v", "k", "a", "s", "d"};
        char[] givenChars = {'v', 'k', 'a', 's', 'd'};

        for (int i = 0; i < 10; i++) {
            if( i > 4) {
                charArr[i] = givenChars[i-5];
            } else {
                charArr[i] = givenChars[i];
            }
        }
        //System.out.println(Arrays.toString(charArr));
        return charArr;
    }
}

