package Task19C;

public class ClassB extends ClassA{
    String name = "Anderson";

    public static void main(String[] args) {
        ClassB object = new ClassB();

        object.printNames();
    }

    public void printNames() {
        System.out.println("My Class name is " + this.name);

        System.out.println("My Parent class name is " + super.name);
    }
}
