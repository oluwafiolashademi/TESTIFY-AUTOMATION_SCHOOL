package Task2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Education {
    private WebDriver driver;

//    public static void main(String[] args) {
//        Education education = new Education();
//        education.initializeDriver();
//        education.launchUdemy();
//        education.launchCoursera();
//        education.launchAlison();
//        education.closeDriver();
//    }

    // Initialize WebDriver
    public void initializeDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\folashade.adefiranye\\Documents\\FOLASHADE\\DOCUMENT\\Personal\\TESTIFY\\CODEBASE\\TESTIFY-AUTOMATION_SCHOOL\\MODULE 4B\\src\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();  // Maximize the browser window
    }

    // Launch Udemy
    public void launchUdemy() {
        driver.get("https://www.udemy.com");
    }

    // Launch Coursera
    public void launchCoursera() {
        driver.get("https://www.coursera.org");
    }

    // Launch Alison
    public void launchAlison() {
        driver.get("https://www.alison.com");
    }

    // Close the WebDriver
    public void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}

