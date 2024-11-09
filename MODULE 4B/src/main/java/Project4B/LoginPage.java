package Project4B;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.assertEquals;

public class LoginPage {
    WebDriver sdriver = null;

    public LoginPage(WebDriver driver) {
        sdriver = driver;
        PageFactory.initElements(driver, this);
    }

    //Get Register
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    private WebElement register;
    public WebElement getRegister() {
        return register;
    }

    //Get First Name
    @FindBy(xpath = "//input[@id='customer.firstName']")
    private WebElement firstName;
    public WebElement getFirstName() {
        return firstName;
    }

    //Get Last Name
    @FindBy(xpath = "//input[@id='customer.lastName']")
    private WebElement lastName;
    public WebElement getLastName() {
        return lastName;
    }

    //Get Address
    @FindBy(xpath = "//input[@id='customer.address.street']")
    private WebElement address;
    public WebElement getAddress() {
        return address;
    }

    //Get City
    @FindBy(xpath = "//input[@id='customer.address.city']")
    private WebElement city;
    public WebElement getCity() {
        return city;
    }

    //Get State
    @FindBy(xpath = "//input[@id='customer.address.state']")
    private WebElement state;
    public WebElement getState() {
        return state;
    }

    //Get Zipcode
    @FindBy(xpath = "//input[@id='customer.address.zipCode']")
    private WebElement zipCode;
    public WebElement getZipCode() {
        return zipCode;
    }

    //Get Phone Number
    @FindBy(xpath = "//input[@id='customer.phoneNumber']")
    private WebElement phone;
    public WebElement getPhone() {
        return phone;
    }

    //Get SSN
    @FindBy(xpath = "//input[@id='customer.ssn']")
    private WebElement ssn;
    public WebElement getSSN() {
        return ssn;
    }

    //Get Username
    @FindBy(xpath = "//input[@id='customer.username']")
    private WebElement username;
    public WebElement getUsername() {
        return username;
    }

    //Get Password
    @FindBy(xpath = "//input[@id='customer.password']")
    private WebElement password;
    public WebElement getPassword() {
        return password;
    }

    //Confirm Password
    @FindBy(xpath = "//input[@id='repeatedPassword']")
    private WebElement confirmPassword;
    public WebElement getConfirmPassword() {
        return confirmPassword;
    }

    //Click on Register button
    @FindBy(xpath = "//tbody/tr[13]/td[2]/input[1]")
    private WebElement registerBtn;
    public WebElement getRegisterBtn() {
        return registerBtn;
    }

    //
    @FindBy(xpath = "//p[contains(text(),'Your account was created successfully. You are now')]")
    private WebElement registersuccesspage;
    public WebElement getRegistersuccesspage() {
        return registersuccesspage;
    }
    public void assertRegisterSuccess(String expectedItem) {
        String actualresult  = sdriver.findElement(By.xpath("//p[contains(text(),'Your account was created successfully. You are now')]")).getText();
        assertEquals(actualresult , expectedItem, "Error!");
    }

    //Sign in with Username
    @FindBy(xpath = "//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[1]/input[1]")
    private WebElement usernameSignIn;
    public WebElement getUsernameSignIn() {
        return usernameSignIn;
    }

    //Sign in with Password
    @FindBy(xpath = "//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[2]/input[1]")
    private WebElement passwordSignIn;
    public WebElement getPasswordSignIn() {
        return passwordSignIn;
    }

    //Click On Login Button
    @FindBy(xpath = "//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[3]/input[1]")
    private WebElement loginBtn;
    public WebElement getLoginBtn() {
        return loginBtn;
    }


    //Click on Open New Account
    //-Open a new a savings account
    //- Verify/assert that an account ID is created
    //- Click on ‘Transfer Funds’ and perform a transaction of $100 into the newly
    //created account
    //- Click on Bill Pay and perform a transaction of any amount
    //- Click on Find transaction
    //- Scroll to the Find by amount section and search for $100 and for an amount you
    //have not used to perform any transactions
    //- Assert in each instance that a transaction history is returned for $100 and that
    //no history is returned for the unknown amount
    //- Click on update contact info
    //- Delete the zip code
    //- Copy the last 5 digits of your phone number and paste it on the ZIP code field
    //- Click on ‘Enter’ to ‘Update Profile’
    //Section B
    //- Without terminating the current window, launch another window and visit

}
