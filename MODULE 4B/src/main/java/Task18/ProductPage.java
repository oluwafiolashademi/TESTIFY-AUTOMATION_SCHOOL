package Task18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage{
    WebDriver sdriver = null;

    public ProductPage(WebDriver driver) {
        sdriver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement addtocart;
    public WebElement getAddtocart() {
        return addtocart;
    }

    @FindBy(xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")
    private WebElement cart;
    public WebElement getCart() {
        return cart;
    }

}
