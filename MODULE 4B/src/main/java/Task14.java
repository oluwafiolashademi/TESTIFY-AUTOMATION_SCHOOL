import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task14 {
    private static WebDriver driver;

    // Close the WebDriver
    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //Navigate to https://www.toolsqa.com/
        //close the dialogue box that pops up after a few seconds
        //Click on the tutorial button on the top left corner of the page

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\folashade.adefiranye\\Documents\\FOLASHADE\\DOCUMENT\\Personal\\TESTIFY\\CODEBASE\\TESTIFY-AUTOMATION_SCHOOL\\MODULE 4B\\src\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Step 1: Navigate to Tools QA
        driver.get("https://www.toolsqa.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

            // Step 2: Close the dialogue box after it appears
        WebElement closeDialog = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Accept')]")));
        closeDialog.click();

            // Step 3: Click on the Tutorials button
        WebElement tutorialsButton = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Tutorials")));
        tutorialsButton.click();

            // Optional: Add a wait to observe the result before closing the browser
        Thread.sleep(5000);
        Task14.closeDriver(); // Ensure the driver closes regardless of the outcome
    }
}
