package Task13;

public class ClassB {
    public static void main(String[] args) {
        ClassA object1 = new ClassA("Folashade");
        ClassA object2 = new ClassA("John", 10);
        ClassA object3 = new ClassA("Tolani", 15, "Lagos");


        object1.displayInfo();
        object2.displayInfo();
        object3.displayInfo();
    }

}
