package Task14;

public class ClassB {
    public static void main(String[] args) {
        ClassA square = new ClassA();

        square.setShapeLength(5.0);
        square.setShapeBreadth(5.0);

        double length = square.getShapeLength();
        double breadth = square.getShapeBreadth();

        double area = square.calculateArea();

        System.out.printf("The area of a square of length: %.2f and breadth: %.2f is %.2f%n", length, breadth, area);
    }
}