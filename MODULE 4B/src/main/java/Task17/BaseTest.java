package Task17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\folashade.adefiranye\\Documents\\FOLASHADE\\DOCUMENT\\Personal\\TESTIFY\\CODEBASE\\TESTIFY-AUTOMATION_SCHOOL\\MODULE 4B\\src\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }

    @AfterClass
    public void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}

