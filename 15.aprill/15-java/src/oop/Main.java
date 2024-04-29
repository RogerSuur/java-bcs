package oop;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(6);
        double area = circle.calculateArea();
        double perimeter = circle.calculatePerimeter();
        System.out.println(area);
        System.out.println(perimeter);
        System.out.println(circle.getRadius());

        Cat miisu = new Cat("Miisu", "Roger");
        miisu.roll();
        miisu.greet();
        miisu.speak();
        Cat kiisu = new Cat("Miisu", "Roger");

        System.out.println(miisu.equals(kiisu));
        System.out.println(kiisu.toString());

        Student student = new Student("Roger", "kood/johvi", false);
        student.doHomeWork();
        student.switchUniversity("Taltech");
    }
}
