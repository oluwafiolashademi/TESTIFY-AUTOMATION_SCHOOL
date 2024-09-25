package Task19B;

public class ClassA {
    // STATIC: I want to use the value of a variable in one class in another class at runtime.
    // I also want to access the variable without creating an object of its class.
    // Help me implement this
    public static String sharedValue = "Hello, TESTIFY!";

    public static void main(String[] args) {
        System.out.println("Shared Value: " + sharedValue);
        ClassB.printSharedValue();
    }
}
