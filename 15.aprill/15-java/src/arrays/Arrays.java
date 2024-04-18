package arrays;

public class Arrays {
    public static void main(String[] args) {
        
        //printCharacters();
        //printEvenNumbers(36);
        defineArray();
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
        String[] arr = new String[] {"apple", "pear", "melon"};
        System.out.println(Arrays.toString(arr));
    }
}
