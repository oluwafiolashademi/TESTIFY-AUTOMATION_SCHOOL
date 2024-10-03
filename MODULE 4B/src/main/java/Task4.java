import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task4 {
    // Navigate to http://demo.guru99.com/
    //Click on the security Project menu.
    // Input any text in the email and password field.
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

        driver.get("http://demo.guru99.com/");
        Thread.sleep(5000);
        driver.findElement(By.linkText("Security Project")).click();
        //driver.findElement(By.linkText("http://demo.guru99.com/Security/SEC_V1/index.php")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("uid")).sendKeys("Testify");
        Thread.sleep(5000);
        driver.findElement(By.name("password")).sendKeys("Testify01");
        Thread.sleep(5000);
        //
        Task4.closeDriver();

    }
}
