package combinedexercises;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Combinedexercises {
    public static void main(String[] args) {
        // first(5);
        // second(5, 8);

        // int[] numbers = {5, 4, 10};
        // int[] numbers2 = {1, 2, 3, 8};
        // int[] numbers3 = {1, 2, 7,8};
        // System.out.println(third(numbers));
        // System.out.println(third(numbers2));
        // System.out.println(third(numbers3));

        //multiplicationTable(5);
        //reverseString("The quick brown fox");
        //printNumBetween();

        //eight(new int [] {5, 4, 10}, new int [] {1, 2, 3});

        //distinctChars("xyyz");

        // int[] numbers = {1, 4, 7};
        // int[] numbers2 = {5, 4, 3};
        // int[] numbers3 = {3, 2, 4};
        // ten(numbers);
        // ten(numbers2);
        // ten(numbers3);

        //11
        //12
        //13
       
        Map<String, Integer> counts = fourteen ("Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");

        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
    }

    private static Map<String, Integer> fourteen(String text) {
        int lettersCount = 0, numbersCount = 0, spacesCount = 0, otherCount = 0;

        char[] charArray = text.toCharArray();

        
        for (char c : charArray) {
            if (Character.isLetter(c)) {
                lettersCount++;
            } else if (Character.isDigit(c)){
                numbersCount++;
            } else if (Character.isSpaceChar(c)) {
                spacesCount ++;
            } else {
                otherCount++;
            }
        }
        
        Map<String, Integer> results = new HashMap<>();
        results.put("letter", lettersCount);
        results.put("numbers", numbersCount);
        results.put("spaces", spacesCount);
        results.put("others", otherCount);
        return results;
    }

    private static void ten(int[] arr) {
        
    }

    private static void distinctChars(String str) {
        char[] chars = str.toCharArray();
        Set<Character> hash_Set = new HashSet<Character>();
        boolean isDistinct = true;

        for (Character character : chars) {
            if (hash_Set.contains(character)) {
                        isDistinct = false;
                    } else {
                        hash_Set.add(character);
                    }
        }
        // for (int i = 0; i < chars.length(); i++) {
        //     if (hash_Set.contains(Character.toString(str.charAt(i)))) {
        //         isDistinct = false;
        //     } else {
        //         hash_Set.add(Character.toString(str.charAt(i)));
        //     }
        // }
        System.out.println(isDistinct);
    }

    private static void eight(int[] arr, int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
                arr[i] = arr[i] * arr2[i];
        }
        System.out.println( Arrays.toString(arr));
    }

    private static void printNumBetween() {
        String three = "Divided by 3:\n"; 
        String five = "Divided by 5:\n"; 
        String threeandfive = "Divided by 3 & 5:\n";

        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                threeandfive += Integer.toString(i) + ", ";
            } else if (i % 3 == 0){
                three += Integer.toString(i) + ", ";
            } else if (i % 5 == 0) {
                five += Integer.toString(i) + ", ";
            }
        }

        System.out.println(three + "\n");
        System.out.println(five + "\n");
        System.out.println(threeandfive + "\n");

    }

    private static void reverseString(String str) {
        String answer = "";
        for (int i = str.length()-1; i >= 0; i--) {
            answer += str.charAt(i);
        }
        System.out.println(answer);
    }

    private static void multiplicationTable(int i) {
        for (int j = 0; j <= 10; j++) {
            System.out.println(i + " X " + j + " = " + i*j);
        }
    }

    public static boolean third(int[]arr) {
        for (int i : arr) {
            if(i == 7 || i == 4) {
                return true;
            }
        }
        return false;
    }

    public static void second(int i, int j) {
        if (i > j) {
            System.out.println(i + " is bigger than " + j);
        } else if ( j > i) {
            System.out.printf("%d is bigger than %d%n", i, j);
        } else {
            System.out.println("They are equal");
        }
    }

    public static void first(int n) {
        System.out.println(n + " + " + n + n + " + " + n + n + n);
    }

    
}
