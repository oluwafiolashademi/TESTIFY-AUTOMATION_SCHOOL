package Task17;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class WidgetTest extends BaseTest {
    @Test
    public void testNavigateToWidget() {
        driver.get("https://demoqa.com/");
        WebElement Widget = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/div/div[3]/h5"));
        try {
            Widget.click();
            System.out.println("Clicked on Widgets."); // Debugging statement
        }
        catch (ElementClickInterceptedException e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Widget);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Widget);
        }

        //Thread.sleep(5000);
        System.out.println("Current URL after clicking: " + driver.getCurrentUrl());
        String WidgetPage = driver.getCurrentUrl();
        System.out.println("Current Page: " + WidgetPage); // Debugging statement

        Assert.assertEquals(WidgetPage, "https://demoqa.com/widgets", "The page url is correct after navigation.");
        System.out.println("Successful, The Widget page url is correct after navigation.");

    }
}
