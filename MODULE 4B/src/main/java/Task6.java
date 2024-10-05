import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {

    private static WebDriver driver;

    // Close the WebDriver
    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\folashade.adefiranye\\Documents\\FOLASHADE\\DOCUMENT\\Personal\\TESTIFY\\CODEBASE\\TESTIFY-AUTOMATION_SCHOOL\\MODULE 4B\\src\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to https://www.saucedemo.com/
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(5000);

        //Login using username and password.
        driver.findElement(By.cssSelector("input[name = 'user-name']")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("input[name = 'password']")).sendKeys("secret_sauce");
        Thread.sleep(5000);

        //Click on the login button,
        driver.findElement(By.cssSelector("input[name = 'login-button']")).click();
        Thread.sleep(5000);

        //click on the "add to cart" button of any product (Add only one item)
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(5000);

        //click the cart icon on the top right.
        driver.findElement(By.cssSelector("#shopping_cart_container")).click();
        Thread.sleep(5000);

        //Click on checkout.  USE ONLY CSS  LOCATION STRATEGY
        driver.findElement(By.cssSelector("#checkout")).click();
        Thread.sleep(5000);
        Task6.closeDriver();

    }
}

