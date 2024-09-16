package Task17A;

public class Login extends AbstractLogin{
    @Override
    public void enterUsername(String username) {
        System.out.println("Username entered: " + username);
    }

    @Override
    public void enterPassword(String password) {
        System.out.println("Password entered: " + password);
    }

    @Override
    public void clickSignIn() {
        System.out.println("Sign-In button clicked.");
    }

    @Override
    public void forgotPassword() {
        System.out.println("Forgot Password link clicked.");
    }

    public static void main(String[] args) {
        Login loginPage = new Login();
        loginPage.displayCommonElements();

        loginPage.enterUsername("user123");
        loginPage.enterPassword("password123");
        loginPage.clickSignIn();
        loginPage.forgotPassword();
    }
}
