package pageObject;

import SetUp.SetUps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends SetUps {
    private WebDriver driver;
    public LoginPage(WebDriver driver) {
    this.driver=driver;
    }
    //Using By as a locator for login elements

    private By username = By.id("txtUsername");
    public void enterUsername (String uName){
        //find the username element and enter the username.
        driver.findElement(username).sendKeys(uName);
    }
    private By password = By.id("txtPassword");
    public void enterUserPassword(String pwd){
//find password field and enter password
        driver.findElement(password).sendKeys(pwd);
    }
    private By loginButton = By.id("btnLogin");
    public DashboardPage clickLoginBtn(){
        driver.findElement(By.id("btnLogin")).click();
        return new DashboardPage(driver);
    }
}
