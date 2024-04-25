package codingbat.warmup;

public class Warmup {
    public static void main(String[] args) {

        // System.out.println(front3("Java"));// "JavJavJav");
        // System.out.println(front3("Chocolate"));// "ChoChoCho");
        // System.out.println(front3("abc"));// "abcabcabc"); 
        
        // System.out.println(backAround("cat"));// → "tcatt"
        // System.out.println(backAround("Hello"));// → "oHelloo"
        // System.out.println(backAround("a"));// → "aaa"
        
        // System.out.println(close10(8,13));// → "8"
        // System.out.println(close10(13,8));// → "8"
        // System.out.println(close10(13,7));// → "0"
        // System.out.println(close10(7, 13)); //→ 0

        // System.out.println(in3050(30,31));// → true
        // System.out.println(in3050(30,41));// → false
        // System.out.println(in3050(40,50));// → true


        // System.out.println(max1020(11,19));// 19
        // System.out.println(max1020(19,11));// 19
        // System.out.println(max1020(11,9));// 11


        System.out.println(loneTeen(13, 99));// → true
        System.out.println(loneTeen(21, 19));// → true
        System.out.println(loneTeen(13, 13));// → false   
    }

    static public StringBuffer missingChar(String str, int n) {
        StringBuffer sb = new StringBuffer(str);  
        return sb.deleteCharAt(n);
    }

    static public String frontBack(String str) {
        if (str.length() > 1) {
        char firstS = str.charAt(0);
        char lastS = str.charAt(str.length()-1);
        String mid = str.substring(1, str.length()-1);
        return lastS + mid + firstS;
            } else {
        return str;    
        }
    }
    
    static public String front3(String str) {
        String firstThree = str.substring(0, str.length() > 3 ? 3 : str.length());
        return firstThree + firstThree + firstThree;
    }
    
    static public String backAround(String str) {
        char lastChar = str.charAt(str.length()-1);

        return lastChar + str + lastChar;
    }
    
    static public int close10(int a, int b) {
        if ((10 - a) < Math.abs(10 -b)) {
            return a;
        } else if (Math.abs(10 - a) == Math.abs(10 -b)){
            return 0;
        } else {
            return b;
        }
    }

    static public boolean in3050(int a, int b) {
        if (a >= 30 && b >= 30 && a<= 40 && b<=40) {
            return true;
        } else if (a >= 40 && b >= 40 && a<= 50 && b<=50){
            return true;
        } else {
            return false;
        }
    }

    static public int max1020(int a, int b) {
        // Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
        // or return 0 if neither is in that range.
        if (a>b && a>=10 && a<=20) {
            return a;
        } else if ((a<b && b>=10 && b<=20)){
            return b;
        } else {
            return 0;
        }
    }

    static public boolean loneTeen(int a, int b) {
        boolean answer = false;
        if (a >= 13 && a <= 19 ) {
            answer = !answer;
        }
         if (b >= 13 && b <= 19 ) {
            answer = !answer;
        }
        return answer;
    }
}
