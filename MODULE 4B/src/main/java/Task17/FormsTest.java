package Task17;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FormsTest extends BaseTest {
    @Test
    public void testNavigateToForms() {
        driver.get("https://demoqa.com/");
        WebElement form = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[3]/h5"));
        try {
            form.click();
            System.out.println("Clicked on Forms."); // Debugging statement
        }
        catch (ElementClickInterceptedException e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", form);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", form);
        }

    //Thread.sleep(5000);
        System.out.println("Current URL after clicking: " + driver.getCurrentUrl());
        String formPage = driver.getCurrentUrl();
        System.out.println("Current Page: " + formPage); // Debugging statement

        Assert.assertEquals(formPage, "https://demoqa.com/forms", "The page url is correct after navigation.");
        System.out.println("Successful, The Form page url is correct after navigation.");

    }
}