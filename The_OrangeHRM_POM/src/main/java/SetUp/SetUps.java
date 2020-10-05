package SetUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObject.LoginPage;

public class SetUps {
    //create a WebDriver object
    private WebDriver driver;
    //create Login page Object
    protected LoginPage loginPage;
    @BeforeTest
    public void setUp(){
        //selenium WebDriver needs this executable in order to know which browser to run the test.
        //Browser setup for chrome
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        // Instantiate WebDriver Object
        driver = new ChromeDriver();
        //maximize project window
        driver.manage().window().maximize();
        //Launch project URl
        driver.get("https://opensource-demo.orangehrmlive.com/");
        //Instantiate login page after Launching the browser -Handle
        loginPage = new LoginPage(driver);
    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}


