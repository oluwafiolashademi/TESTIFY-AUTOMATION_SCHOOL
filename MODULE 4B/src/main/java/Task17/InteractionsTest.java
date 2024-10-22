package Task17;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InteractionsTest extends BaseTest {
    @Test
    public void testNavigateToInteractions() {
        driver.get("https://demoqa.com/");
        WebElement interaction = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[5]/div/div[3]/h5"));
        try {
            interaction.click();
            System.out.println("Clicked on Interactions Button."); // Debugging statement
        }
        catch (ElementClickInterceptedException e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", interaction);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", interaction);
        }

        //Thread.sleep(5000);
        System.out.println("Current URL after clicking: " + driver.getCurrentUrl());
        String interactionPage = driver.getCurrentUrl();
        System.out.println("Current Page: " + interactionPage); // Debugging statement

        Assert.assertEquals(interactionPage, "https://demoqa.com/interaction", "The page url is correct after navigation.");
        System.out.println("Successful, The interaction page url is correct after navigation.");

    }
}
