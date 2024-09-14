package TASK12N;

import Task12.classA;
import Task12.classB;

public class Main {
    public static void main(String[] args) {
        // Accessing Class A and its public method
        classA aObject = new classA();
        aObject.name();

        // Accessing Class B
        classB bObject = new classB();
        bObject.newName();
    }
}