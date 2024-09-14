package Task13;

public class ClassA {
    //Create 3 different constructors of a class A.
    // Create 3 objects of Class A in class B and use the 3 different constructors
    // when creating each of the objects of class A in class B
    public String name;
    public int age;
    public String state;

    public ClassA(String name) {
        this.name = name;
    }

    public ClassA(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public ClassA(String name, int age, String state) {
        this.name = name;
        this.age = age;
        this.state = state;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", State: " + state);
    }

}
