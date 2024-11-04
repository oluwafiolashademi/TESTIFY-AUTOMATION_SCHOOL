package Project4B;

import Task18.CartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Main {
    WebDriver driver = null;

    @Test
    public void main() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\folashade.adefiranye\\Documents\\FOLASHADE\\DOCUMENT\\Personal\\TESTIFY\\CODEBASE\\TESTIFY-AUTOMATION_SCHOOL\\MODULE 4B\\src\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(" https://parabank.parasoft.com/");
        Thread.sleep(3000);

        LoginPage loginPage = new LoginPage(driver);
        //To click on Register
        loginPage.getRegister().click();

        //Registering Data
        loginPage.getFirstName().sendKeys("Opeyemi");
        loginPage.getLastName().sendKeys("Ogunmodede");
        loginPage.getAddress().sendKeys("10, Lateef Jakande Road");
        loginPage.getCity().sendKeys("Ikeja");
        loginPage.getState().sendKeys("Lagos");
        loginPage.getZipCode().sendKeys("100273");
        loginPage.getPhone().sendKeys("07075467890");
        loginPage.getSSN().sendKeys("AA-GG-SSSS");
        loginPage.getUsername().sendKeys("OpeyemiOgunmodede");
        loginPage.getPassword().sendKeys("Opeyemi@18");
        loginPage.getConfirmPassword().sendKeys("Opeyemi@18");
        Thread.sleep(3000);
        loginPage.getRegisterBtn().click();
        Thread.sleep(5000);

        //To assert that the registration was successful
        String actualresult = loginPage.getRegistersuccesspage().getText();
        assertEquals(actualresult , "Your account was created successfully. You are now logged in.", "Error!");
        System.out.println("Result: " + actualresult );
        Thread.sleep(5000);

        //Click on Open New Account
        AccountOpening accountOpening = new AccountOpening(driver);
        //To click on Register
        accountOpening.getOpenNewAccount().click();


        //Signing In
        loginPage.getUsernameSignIn().sendKeys("OpeyemiOgunmodede");
        loginPage.getPasswordSignIn().sendKeys("Opeyemi@18");
        Thread.sleep(3000);
        loginPage.getLoginBtn().click();

//        ProductPage productPage = new ProductPage(driver);
//        productPage.getAddtocart().click();
//        productPage.getCart().click();
//        Thread.sleep(5000);
//
//        // Assert items in cart
//        CartPage cartPage = new CartPage(driver);
//        String actualItem = cartPage.getBackPacks().getText(); // Get the text from WebElement
//        assertEquals(actualItem, "Sauce Labs Backpack", "Item in cart does not match!"); // Compare the texts
//        System.out.println("Item name is " + actualItem);
//        Thread.sleep(5000);
//
//        CartPage cartPage1 = new CartPage(driver);
//        cartPage1.getCheckoutbtn().click();
//        Thread.sleep(3000);
//
//        CheckoutPage checkoutPage = new CheckoutPage(driver);
//        checkoutPage.getFirstName().sendKeys("Folashade");
//        checkoutPage.getLastName().sendKeys("Ayorinde_Akinola");
//        checkoutPage.getPostalCode().sendKeys("100273");
//        checkoutPage.getContinueCheckout().click();
//        Thread.sleep(5000);
//
//        String actualCheckoutItem = checkoutPage.getCheckoutItemName().getText(); // Get the text from WebElement
//        assertEquals(actualCheckoutItem, "Sauce Labs Backpack", "Item in cart does not match!"); // Compare the texts
//        System.out.println("Item name is " + actualCheckoutItem);
//
//        checkoutPage.getFinishCheckout().click();
    }

    @AfterClass
    public void CloseDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}