import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {
    // Navigate to https://idorenyinankoh.github.io/loginPage/
    //check if the " create account" button is enabled"
    //fill all the fields
    //check if the "create account"is enabled
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

            // Navigate to the login page
        driver.get("https://idorenyinankoh.github.io/loginPage/");

            // Check if the "Create Account" button is enabled before filling the fields
        WebElement createAccountButton = driver.findElement(By.cssSelector("button[type='submit']"));
        System.out.println("Is 'Create Account' button enabled? " + createAccountButton.isEnabled());

            // Fill all fields
        driver.findElement(By.name("firstName")).sendKeys("Folashade");
        driver.findElement(By.name("lastName")).sendKeys("Ayorinde-Akinola");
        Thread.sleep(5000);

        driver.findElement(By.name("email")).sendKeys("folashadeayorindeakinola@gmail.com");
        //driver.findElement(By.cssSelector("input[type='radio'][value='female']")).click();
        Thread.sleep(5000);

        driver.findElement(By.cssSelector("input#female.radio")).click();
        driver.findElement(By.name("password")).sendKeys("Password123");
        Thread.sleep(5000);

        driver.findElement(By.name("confirmPass")).sendKeys("Password123");
        driver.findElement(By.name("xpLevel")).sendKeys("I am a Test Automation Engineer.");

            // Check if the "Create Account" button is enabled after filling the fields
        //Boolean createAccount =
        System.out.println("Is 'Create Account' button enabled after filling fields? " + createAccountButton.isEnabled());

        Task8.closeDriver();
    }
}
