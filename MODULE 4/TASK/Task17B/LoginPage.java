package Task17B;

public class LoginPage implements LoginTest {
    @Override
    public void testUsername(String username) {
        // Example test implementation
        if (username != null && !username.isEmpty()) {
            System.out.println("Username test passed: " + username);
        }
        else {
            System.out.println("Username test failed: Username is invalid.");
        }
    }

    @Override
    public void testPassword(String username, String password) {
        String correctPassword = "password123";
        if ("Admin".equals(username) && correctPassword.equals(password)) {
            System.out.println("Password is correct: " + password);
        }
        else {
            System.out.println("Incorrect Password, verify that username and Password are correct: " + username);
        }
    }

    @Override
    public void testLogin(String username, String password) {
        if ("Admin".equals(username) && "password123".equals(password)) {
            System.out.println("Login test passed: Successfully logged in to the dashboard.");
        }
        else {
            System.out.println("Login test failed: Invalid credentials.");
        }
    }

    public static void main(String[] args) {
        LoginPage tester = new LoginPage();

        // Testing the login process
        String testUsername = "Admin";
        String testPassword = "password123";

        tester.testUsername(testUsername);
        tester.testPassword(testUsername, testPassword);
        tester.testLogin(testUsername, testPassword);
    }
}
