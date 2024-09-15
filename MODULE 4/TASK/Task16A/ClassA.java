package Task16A;

public class ClassA {
    //OVERLOADING: Create a method in a class
    // and Overload in using the 3 different ways of overloading that you know.
    public void playsFootball(String name) {
        System.out.println(name + " finds it always interesting playing Football" );
    }

    public void playsFootball(int number, String text) {
        System.out.println("There are " + number + " players in the team, which is equivalent to  " + text + " in text");
    }

    public void playsFootball(double decimal) {
        System.out.println("If the players count is to be taken in decimal, what will be their number If one of the is injured and one got a red card, can we say: " + decimal);
    }

    public void playsFootball(String text, int number) {
        System.out.println("There are " + number + " players in the team, which is equivalent to  " + text + " in text");
    }

    public static void main(String[] args) {
        ClassA test = new ClassA();

        test.playsFootball("Tunde");
        test.playsFootball(11, "Eleven");
        test.playsFootball(9.5);
        test.playsFootball("Eleven", 11);
    }

}
