package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    //create a webDriver object for this
    private WebDriver driver;
    //create a constructor
    public DashboardPage(WebDriver driver){
        this.driver=driver;
    }
    //Locate element
    private By welcome=By.id("welcome");
    private By subscribe =By.id("Subscriber_link");
    private By logout = By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a");


    //function to interact with the element
    public void clickWelcome()throws InterruptedException{
        //wait for 10secs before executing
        Thread.sleep(10000);
        driver.findElement(welcome).click();
    }
    public SubscriberPage clickSubscribe()throws InterruptedException{
        driver.findElement(subscribe).click();
        return new SubscriberPage(driver);
    }
    public LoginPage clickLogout()throws InterruptedException{
//wait for 3secs before executing
        Thread.sleep(3000);
        driver.findElement(logout).click();
        return new LoginPage(driver);
    }






}
