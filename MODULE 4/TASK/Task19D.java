public class Task19D {
    // THIS https://i.imgur.com/aRkRDPa.png You have a class with a method printName.
    // write a code in the printName method that will print the instance member which is "Delta"
    // and whatever name the user enter when invoking the method
    String name = "Delta";

    public void printName(String userInput) {
        System.out.println("Instance member name: " + this.name);
        System.out.println("User entered name: " + userInput);
    }

    public static void main(String[] args) {
        Task19D newName = new Task19D();
        newName.printName("UserName");
    }
}
