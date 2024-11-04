package Task18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPage {
    WebDriver sdriver = null;

    public LoginPage(WebDriver driver) {
        sdriver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement username;
    public WebElement getUsername() {
        return username;
    }

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;
    public WebElement getPassword() {
        return password;
    }

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement login;
    public WebElement getLogin() {
        return login;
    }

}
