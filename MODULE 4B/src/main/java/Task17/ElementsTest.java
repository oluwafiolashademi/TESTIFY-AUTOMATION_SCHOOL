package Task17;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ElementClickInterceptedException;
import org.testng.Assert;
import org.testng.annotations.Test;
//import java.time.Duration;

public class ElementsTest extends BaseTest {

    @Test(priority = 1, groups = {"Home Page"})
    public void testNavigateToElements() {
        driver.get("https://demoqa.com/");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5"));
        try {
            element.click();
            System.out.println("Clicked on Elements."); // Debugging statement
        }
        catch (ElementClickInterceptedException e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        }

        //Thread.sleep(5000);
        System.out.println("Current URL after clicking: " + driver.getCurrentUrl());
        String elementPage = driver.getCurrentUrl();
        System.out.println("Current Page: " + elementPage); // Debugging statement

        Assert.assertEquals(elementPage, "https://demoqa.com/elements", "The page url is correct after navigation.");
        System.out.println("Successful, The Element page url is correct after navigation.");

    }
}
