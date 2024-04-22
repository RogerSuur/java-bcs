package codingbat;

public class CodingBat {
    public static void main(String[] args) {

        // System.out.println(front3("Java"));// "JavJavJav");
        // System.out.println(front3("Chocolate"));// "ChoChoCho");
        // System.out.println(front3("abc"));// "abcabcabc"); 
        
        System.out.println(backAround("cat"));// → "tcatt"
        System.out.println(backAround("Hello"));// → "oHelloo"
        System.out.println(backAround("a"));// → "aaa"
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
    
}
