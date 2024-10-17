import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class Task11 {

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

        // Step 1: Go to Google
        driver.get("https://www.google.com");

            // Step 2: Search for "testify ltd"
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("testify ltd");
        searchBox.submit();

            // Step 3: Click on the Testify website link
        Thread.sleep(3000);
        WebElement testifyLink = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/span/a/h3"));
        testifyLink.click();

//            // Step 4: Scroll down to the LinkedIn icon
        Actions actions = new Actions(driver);
        WebElement linkedInIcon = driver.findElement(By.cssSelector("a[href*='linkedin.com']"));
        actions.moveToElement(linkedInIcon).perform();
        Thread.sleep(5000);
//
//            // Step 5: Click on the LinkedIn icon
        linkedInIcon.click();
        Thread.sleep(3000);

            // Step 6: Get window handles and switch to the LinkedIn tab
        String originalWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for (String window : allWindows) {
            if (!window.equals(originalWindow)) {
                driver.switchTo().window(window);
                Thread.sleep(5000);
                break;
            }
        }
        driver.findElement(By.cssSelector("icon[class='contextual-sign-in-modal__modal-dismiss-icon lazy-loaded'] svg")).click();
        Thread.sleep(5000);

//            // Step 7: Get the description text
        WebElement descriptionElement = driver.findElement(By.xpath("//span[@class='line-clamp-2']"));
        String descriptionText = descriptionElement.getText();
        System.out.println("Description: " + descriptionText);
        Thread.sleep(5000);

        Task11.closeDriver();
    }
}
