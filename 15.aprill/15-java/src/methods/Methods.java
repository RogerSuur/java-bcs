package methods;

public class Methods {
    public static void main(String[] args) {
        // printGreeting("Roger");
        // printSum(5.1,6.0);
        // double essasumma = getSum(9981, 44489);
        // double tessasumma = getSum(3349,10992);
        // System.out.println(essasumma/tessasumma);
        System.out.println(
            calculateTriangleArea(12, 6)
        );
        System.out.println(calculateCircleArea(3));

        System.out.println(calculateRectangleArea(3.0, 2.0));
    }

    public static void printGreeting(String name) {
        System.out.printf("Good afternoon Mr.%s!%n", name);   
        System.out.println("Good afternoon Mr." + name + "!");
        System.out.format("Good afternoon Mr.%s!%n", name);
    }

    public static void printSum(double a, double b) {
        System.out.println(a+b);
    }

    public static double getSum(double a, double b) {
        return a+b;
    }

    public static double calculateTriangleArea(double height, double base) {
        return (height*base) /2;
    };

    public static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double calculateRectangleArea(double width, double height) {
        return width * height;
    }
}
