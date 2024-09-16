package Task17A;

public abstract class AbstractLogin {
    // You are required to build the blueprint for your company's login page.
    // From the discussions with the product team,
    // all login pages will have a username field, password field, forgot password field, and sign-in button
    // while other elements like remember me checkbox, continue to homePage, OAuth button will not be applicable to all login pages.
    // with your knowledge of Abstract classes,
    // Create a class that others developers will have to inherit from.

    public abstract void enterUsername(String username);
    public abstract void enterPassword(String password);
    public abstract void clickSignIn();
    public abstract void forgotPassword();

    // Concrete method for displaying the common elements
    public void displayCommonElements() {
        System.out.println("Displaying login elements:");
        System.out.println("- Username field");
        System.out.println("- Password field");
        System.out.println("- Forgot Password link");
        System.out.println("- Sign-In button");
    }
}
