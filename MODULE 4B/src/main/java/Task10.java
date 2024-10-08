import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task10 {
    //Navigate to https://jqueryui.com/
    //click on the dialog menu from the left pane
    //click on the close icon to close the dialogue box in the middle
    private static WebDriver driver;

    // Close the WebDriver
    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\folashade.adefiranye\\Documents\\FOLASHADE\\DOCUMENT\\Personal\\TESTIFY\\CODEBASE\\TESTIFY-AUTOMATION_SCHOOL\\MODULE 4B\\src\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

            // Navigate to the jQuery UI website
        driver.get("https://jqueryui.com/");
        Thread.sleep(5000);

            // Click on the "Dialog" menu from the left pane
        WebElement dialogLink = driver.findElement(By.linkText("Dialog"));
        dialogLink.click();
        Thread.sleep(5000);

            // Click on the close icon to close the dialog box
        WebElement closeButton = driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]"));
        closeButton.click();

        Thread.sleep(5000);
        Task10.closeDriver();
    }
}
