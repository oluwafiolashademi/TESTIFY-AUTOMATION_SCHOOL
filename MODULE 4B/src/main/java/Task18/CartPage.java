package Task18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.assertEquals;

public class CartPage {
    WebDriver sdriver = null;

    public CartPage(WebDriver driver) {
        sdriver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'Your Cart')]")
    private WebElement cartpage;
    public WebElement getCartpage() {
        return cartpage;
    }
    
    @FindBy(xpath = "//*[@id=\"item_4_title_link\"]/div")
    private WebElement BackPacks;
    public WebElement getBackPacks() {
        return BackPacks;
    }
    public void assertItemsInCart(String expectedItem) {
        String actualItem = sdriver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
        assertEquals(actualItem, expectedItem, "Item in cart does not match!");
    }

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement Checkoutbtn;
    public WebElement getCheckoutbtn() {
        return Checkoutbtn;
        }

}

