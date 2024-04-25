package codingbat.warmup2;

public class warmup2 {
    public static void main(String[] args) {
        // System.out.println(
        //     stringTimes("Hi", 2)); // → "HiHi"
        // System.out.println(
        //     stringTimes("Hi", 3) // "HiHiHi"
        // );
        // System.out.println(
        //     stringTimes("Hi", 1) // "Hi");
        // );

        String answer = frontTimes("Chocolate", 2);

        System.out.println(
            answer // "ChoCho"
        );
        System.out.println(
            frontTimes("Chocolate", 3) // "ChoChoCho"
        );

        System.out.println(
            frontTimes("Abc", 3) //→ "AbcAbcAbc"
        );
    }

    static public String stringTimes(String str, int n) {
        return str.repeat(n);
    }
    
    static String frontTimes(String str, int n) {
        String answer = "";
        int length = str.length() > 3 ? 3 : str.length();
        for (int i = 0; i < length ; i++) {
             answer += str.charAt(i);
        }
        n--;
        System.out.println("answer" + n); 
        if (n >= 0) {
            frontTimes(answer, n);
        } else {
            return answer;
        }
        return answer;
        
    }
    
}
