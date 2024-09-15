package Task15;

public class ClassB extends ClassA{
    public void familyReligion(){
        System.out.println("Our family Religion is Christianity");
    }

    public void familyBackground(){
        System.out.println("We are from the Royal Family");
    }

    public static void main(String[] args) {
        // Create an instance of Class B
        ClassB family = new ClassB();

        family.familyName();
        family.familyRace();
        family.familyOccupation();

        // Invoke methods from Class B
        family.familyReligion();
        family.familyBackground();
    }
}
