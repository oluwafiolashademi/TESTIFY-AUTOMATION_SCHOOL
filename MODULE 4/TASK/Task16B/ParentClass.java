package Task16B;

public class ParentClass {
    // OVERRIDING: Create two methods in a parent class with arguments.
    // write a print statement in the method body,
    // Override the 2 methods in the child class
    // and write a different print statement in the body of the overriding method
    public void familyName(String name){
        System.out.println("Our family name is " + name);
    }
    public void familyRace(boolean race) {
        System.out.println("We are Black!");
    }
}
