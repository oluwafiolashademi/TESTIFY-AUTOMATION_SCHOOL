package Task18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.assertEquals;

public class CheckoutPage {
    WebDriver sdriver = null;

    public CheckoutPage(WebDriver driver) {
        sdriver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstName;
    public WebElement getFirstName() {
        return firstName;
    }

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastName;
    public WebElement getLastName() {
        return lastName;
    }

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement postalCode;
    public WebElement getPostalCode() {
        return postalCode;
    }

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueCheckout;
    public WebElement getContinueCheckout() {
        return continueCheckout;
    }

    @FindBy(xpath = "//*[@id=\"item_4_title_link\"]/div")
    private WebElement checkoutItemName;
    public WebElement getCheckoutItemName() {
        return checkoutItemName;
    }
    public void assertItemsInCart(String expectedItem) {
        String actualCheckoutItem = sdriver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
        assertEquals(actualCheckoutItem, expectedItem, "Item in cart does not match!");
    }

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finishCheckout;
    public WebElement getFinishCheckout() {
        return finishCheckout;
    }
}
