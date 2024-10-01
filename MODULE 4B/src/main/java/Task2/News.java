package Task2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class News {
    private WebDriver driver;

    public static void main(String[] args) {
        News news = new News();
        news.initializeDriver();
//        news.launchBBCNews();
//        news.launchCNNNews();
//        news.launchNYTimes();
        news.closeDriver();
    }

    // Initialize WebDriver
    public void initializeDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\folashade.adefiranye\\Documents\\FOLASHADE\\DOCUMENT\\Personal\\TESTIFY\\CODEBASE\\TESTIFY-AUTOMATION_SCHOOL\\MODULE 4B\\src\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();  // Maximize the browser window
    }

    // Launch BBCNews
    public void launchBBCNews() {
        driver.get("https://www.bbc.com/news");
    }

    // Launch CNNNews
    public void launchCNNNews() {
        driver.get("https://www.cnn.com");
    }

    // Launch NYTimes
    public void launchNYTimes() {
        driver.get("https://www.nytimes.com");
    }

    // Close the WebDriver
    public void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}


