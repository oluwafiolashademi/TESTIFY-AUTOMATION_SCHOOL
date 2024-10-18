import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task15 {
    //Structure your TestNG file to run Navigate to google and search for testify.
    //close the browser
    //Navigate to https://www.mcdonalds.com/us/en-us.html .
    // print out the colour - code of the order now button.
    // All test should be done in one class and utilize your knowledge of tesNG annotation)
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\folashade.adefiranye\\Documents\\FOLASHADE\\DOCUMENT\\Personal\\TESTIFY\\CODEBASE\\TESTIFY-AUTOMATION_SCHOOL\\MODULE 4B\\src\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
            wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test(priority = 1)
    public void navigateToGoogleAndSearch() {
        // Navigate to Google
        driver.get("https://www.google.com");

          // Search for "testify"
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
        searchBox.sendKeys("testify");
        searchBox.submit();

        // Optional: Wait for search results to load
        wait.until(ExpectedConditions.titleContains("testify"));

        // Optional: Wait for search results to load
        wait.until(ExpectedConditions.titleContains("testify"));
    }

    @Test(priority = 2)
    public void navigateToMcDonaldsAndPrintOrderNowColor() {
        // Navigate to McDonald's website
        driver.get("https://www.mcdonalds.com/us/en-us.html");

        // Find the "Order Now" button
        WebElement orderNowButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='button-ordernow']")));
        // Get the color code of the button
        String color = orderNowButton.getCssValue("background-color");
        System.out.println("Color code of the 'Order Now' button: " + color);
    }

    @AfterClass
    public void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
