package Task2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ECommerce {
    private WebDriver driver;

//    public static void main(String[] args) {
//        ECommerce ecommerce = new ECommerce();
//        ecommerce.initializeDriver();
//        ecommerce.launchAmazon();
//        ecommerce.launchJumia();
//        ecommerce.launchEbay();
//        ecommerce.closeDriver();
//    }

    // Initialize WebDriver
    public void initializeDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\folashade.adefiranye\\Documents\\FOLASHADE\\DOCUMENT\\Personal\\TESTIFY\\CODEBASE\\TESTIFY-AUTOMATION_SCHOOL\\MODULE 4B\\src\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();  // Maximize the browser window
    }

    // Launch Amazon
    public void launchAmazon() {
        driver.get("https://www.amazon.com");
    }

    // Launch Jumia
    public void launchJumia() {
        driver.get("https://www.jumia.com");
    }

    // Launch eBay
    public void launchEbay() {
        driver.get("https://www.ebay.com");
    }

    // Close the WebDriver
    public void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
