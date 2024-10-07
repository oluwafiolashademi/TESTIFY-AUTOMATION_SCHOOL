import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Task7 {

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

        //try {
            // Navigate to the World Weather Information Service homepage
        driver.get("https://worldweather.wmo.int/en/home.html");
        Thread.sleep(5000); // Wait for the page to load

            // Search for the city in the search field
        driver.findElement(By.cssSelector("#q_search")).sendKeys("Madagascar");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#q_search")).submit(); // Submit the search
        Thread.sleep(5000); // Wait for the results to load

            // Locate the weather results
        List<WebElement> results = driver.findElements(By.cssSelector(".fav_city_fc_block_mask .row")); // Adjust the selector if necessary

            // Iterate through the results and print the day and weather description
        for (WebElement result : results) {
            String day = result.findElement(By.cssSelector(".date")).getText(); // Adjust the selector as needed
            String weatherDescription = result.findElement(By.cssSelector(".weather")).getText(); // Adjust the selector as needed
            System.out.println("Date: " + day + " - Weather: " + weatherDescription);
        }
        Task7.closeDriver();
    }
}
