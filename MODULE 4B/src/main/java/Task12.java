import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task12 {
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
        Thread.sleep(3000);

        // Step 2: Click on the "Resizable" menu from the left pane
        WebElement resizableLink = driver.findElement(By.linkText("Resizable"));
        resizableLink.click();
        Thread.sleep(3000);

        // Step 3: Switch to the iframe containing the resizable box
        driver.switchTo().frame(0);

        // Step 4: Locate the resizable box
        WebElement resizableBox= driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
        Thread.sleep(5000);

        // Step 5: Resize the box by dragging it
        Actions action;
        action = new Actions(driver);
        action.clickAndHold(resizableBox)
                .moveByOffset(100, 100)
                .release().
                perform();

        // Step 6: Sleep for a while to observe the resizing
        Thread.sleep(5000);
        Task12.closeDriver();
    }
}
