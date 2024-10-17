import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task13 {
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
        Thread.sleep(5000);

            // Step 1: Navigate to the Selenium blog
        driver.get("https://selenium08.blogspot.com/");
        Thread.sleep(3000);

            // Step 2: Search for "Demo dropdown"
        WebElement searchBox = driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div[1]/div[2]/button"));
        //WebElement searchBox1 = searchBox;
        searchBox.click();
        Thread.sleep(5000);
        WebElement searchBox2 = driver.findElement(By.xpath("//input[@aria-label='Search this blog']"));
        searchBox2.sendKeys("Demo dropdown");
        searchBox2.submit();
        Thread.sleep(5000);

        // Step 3: Click on the dropdown link
        WebElement dropdownLink = driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/article/div/div[2]/div[1]/h3/a"));
        dropdownLink.click();

        // Step 4: Select "Nigeria" from the country dropdown
        WebElement countryDropdown = driver.findElement(By.xpath("//*[@id=\"post-body-4074800055706479627\"]/div/select")); // Replace with actual ID
        Select countrySelect = new Select(countryDropdown);
        countrySelect.selectByVisibleText("Nigeria");

        // Step 5: Select "January," "February," and "March" from the months dropdown
        WebElement monthsDropdown = driver.findElement(By.xpath("//*[@id=\"post-body-4074800055706479627\"]/div/div[3]/select")); // Replace with actual ID
        Select monthsSelect = new Select(monthsDropdown);
        monthsSelect.selectByVisibleText("January");
        monthsSelect.selectByVisibleText("February");
        monthsSelect.selectByVisibleText("March");

        // Sleep to observe the selections
        Thread.sleep(5000);
        // Close the WebDriver
        Task13.closeDriver();
        }
}
