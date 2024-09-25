public class Task19A {
    // FINAL: create 3 variables of a class A, ballSize, ballColour, ballTexture.
    // and make it impossible to change the value the ballSize in any method in that class

    private final int ballSize;
    private String ballColour;
    private String ballTexture;

    public Task19A(int size, String colour, String texture) {
        this.ballSize = size;
        this.ballColour = colour;
        this.ballTexture = texture;
    }

    public int getBallSize() {
        return ballSize;
    }

    public String getBallColour() {
        return ballColour;
    }

    public String getBallTexture() {
        return ballTexture;
    }

    public static void main(String[] args) {
        Task19A ball = new Task19A(5, "Red", "Smooth");

        // Access and print the values
        System.out.println("Ball Size: " + ball.getBallSize());       // Prints: Ball Size: 5
        System.out.println("Ball Colour: " + ball.getBallColour());   // Prints: Ball Colour: Red
        System.out.println("Ball Texture: " + ball.getBallTexture()); // Prints: Ball Texture: Smooth
    }
}