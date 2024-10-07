import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9 {
    // Navigate to saucedemo.com
    //Login with username and password
    //navigate back to login screen from the homepage
    //print out the Login button attribut "VALUE" to verify that you are back on the login screen
    //navigate forward to the homepage, print out a name of a product to verify that you are back on the homepage
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

        // Navigate to the Sauce Demo login page
        driver.get("https://www.saucedemo.com/");

        // Login with username and password
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(5000);
        // Navigate back to the login screen
        driver.navigate().back();
        Thread.sleep(5000);

        // Print out the Login button attribute "VALUE" to verify that you are back on the login screen
        WebElement loginButton = driver.findElement(By.id("login-button"));
        String loginButtonValue = loginButton.getAttribute("value");
        System.out.println("Login Button Value: " + loginButtonValue);
        Thread.sleep(5000);

        // Navigate forward to the homepage
        driver.navigate().forward();
        Thread.sleep(5000);

        // Print out the name of a product to verify that you are back on the homepage
        WebElement productName = driver.findElement(By.cssSelector(".inventory_item_name"));
        System.out.println("Product Name: " + productName.getText());

        Task9.closeDriver();
    }
}
