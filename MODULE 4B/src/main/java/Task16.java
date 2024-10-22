import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class Task16 {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\folashade.adefiranye\\Documents\\FOLASHADE\\DOCUMENT\\Personal\\TESTIFY\\CODEBASE\\TESTIFY-AUTOMATION_SCHOOL\\MODULE 4B\\src\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    @Test
    public void verifyContactDetails() throws InterruptedException {
        // Navigate to Testify website
        driver.get("https://www.testifyltd.com/");

        Thread.sleep(5000);

        WebElement contactDetailsElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/section/div/div[1]/div[1]/div/p")));
        String contactDetails = contactDetailsElement.getText();

        // Split the contact details into email and phone number
        String[] parts = contactDetails.split("\\s.*\\.\\s*"); 
        String email = parts[0].trim();
        String phone = parts[1].trim();
        System.out.println(email);
        System.out.println(phone);

        // Get the location
        WebElement locationElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/section/div/div[2]/div[1]/p")));
        String location = locationElement.getText();
        System.out.println(location);

        // Verify the email details
        try {
            assertEquals(email, "info@testifyltd.co.uk", "Email does not match!"); // Expected value
        } catch (AssertionError e) {
            System.err.println("Assertion Failed: " + e.getMessage());
            System.err.println("Expected: info@testifyltd.co.uk, Actual: " + email);
        }

        try {
            assertEquals(phone, "(+234)905-882-0971", "Phone number matches!");
            System.err.println("Assertion Passed: " + phone);
            System.err.println("Expected: (+234)905-882-0971, Actual: " + phone);
        } catch (AssertionError e) {
            System.err.println("Assertion Failed: " + e.getMessage());
            System.err.println("Expected: (+234)905-882-0971, Actual: " + phone);
        }

        try {
            assertEquals(location, "Nigeria", "Location does not match!");
        } catch (AssertionError e) {
            System.err.println("Assertion Failed: " + e.getMessage());
            System.err.println("Expected: Nigeria, Actual: " + location);
        }
    }

    @AfterClass
    public void closeDriver() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
