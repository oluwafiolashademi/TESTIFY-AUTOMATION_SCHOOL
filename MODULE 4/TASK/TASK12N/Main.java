package TASK12N;

import Task12.classA;
import Task12.classB;

public class Main {
    public static void main(String[] args) {
        // Accessing Class A and its public method
        classA aObject = new classA();
        aObject.name(); // This works

        // Accessing Class B
        classB bObject = new classB();
        bObject.callNewName(); // This works
        // bObject.newName(); // This will NOT work because it's package-private
    }
}