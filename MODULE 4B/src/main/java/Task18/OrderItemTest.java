package Task18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;


public class OrderItemTest {
    WebDriver driver = null;

    @Test
    public void OrderItem() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\folashade.adefiranye\\Documents\\FOLASHADE\\DOCUMENT\\Personal\\TESTIFY\\CODEBASE\\TESTIFY-AUTOMATION_SCHOOL\\MODULE 4B\\src\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(3000);
    }

    @Test(priority = 5, groups = {"Home Page"})
    public void Login() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getUsername().sendKeys("standard_user");
        loginPage.getPassword().sendKeys("secret_sauce");
        Thread.sleep(3000);
        loginPage.getLogin().click();
        Thread.sleep(5000);
    }

    public void Product() throws InterruptedException {
        ProductPage productPage = new ProductPage(driver);
        productPage.getAddtocart().click();
        productPage.getCart().click();
        Thread.sleep(5000);
    }

    public void Cart() throws InterruptedException {
        // Assert items in cart
        CartPage cartPage = new CartPage(driver);
        String actualItem = cartPage.getBackPacks().getText(); // Get the text from WebElement
        assertEquals(actualItem, "Sauce Labs Backpack", "Item in cart does not match!"); // Compare the texts
        System.out.println("Item name is " + actualItem);
        Thread.sleep(5000);

        CartPage cartPage1 = new CartPage(driver);
        cartPage1.getCheckoutbtn().click();
        Thread.sleep(3000);
    }

    public void Checkout() throws InterruptedException {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.getFirstName().sendKeys("Folashade");
        checkoutPage.getLastName().sendKeys("Ayorinde_Akinola");
        checkoutPage.getPostalCode().sendKeys("100273");
        checkoutPage.getContinueCheckout().click();
        Thread.sleep(5000);

        String actualCheckoutItem = checkoutPage.getCheckoutItemName().getText(); // Get the text from WebElement
        assertEquals(actualCheckoutItem, "Sauce Labs Backpack", "Item in cart does not match!"); // Compare the texts
        System.out.println("Item name is " + actualCheckoutItem);

        checkoutPage.getFinishCheckout().click();
    }

    @AfterClass
    public void CloseDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
//Using your knowledge of POM, organize your order item test case below:
//Navigate to saucedemo.com
//Login with the username and password on the Login screen.
//Add to items to cart. Click on the cart icon on the top right.
//assert that the items you clicked and added to cart are what are displayed on the "YOUR CART" page.
//Click on the checkout button. 6. Input first name last name and postal code and click on continue.
//Assert that the item showed on the CHECKOUT: OVERVIEW page is the item that was added to cart from the first page.
//Click on the "Finish" button. Assert that user sees an success message "THANK YOU FOR YOUR ORDER".
