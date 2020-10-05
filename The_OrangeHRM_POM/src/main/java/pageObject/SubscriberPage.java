package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SubscriberPage {
    private WebDriver driver;
    public SubscriberPage(WebDriver driver) {
      this.driver=driver;
    }
  //Using By to locate Element on Subscriber page
  private By SubscriberName =By.id("subscriber_name");
    private By SubscriberEmail = By.id("subscriber_email");
    private By SubscribeButton =By.id("btnSubscribe");
    private By DashboardPage = By.xpath("//*[@id=\"menu_dashboard_index\"]/b");
    private By welcome =By.id("welcome");
    private By Logout = By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a");

    public void enterName(String sName){
   //locate SubscriberName and enter SubscriberName
        driver.findElement(SubscriberName).sendKeys(sName);
    }
    public void enterEmail(String spwd){
     //locate SubscriberEmail and enter SubscriberEmail
        driver.findElement(SubscriberEmail).sendKeys(spwd);
    }
    public void clickSubscribeButton(){
      //locate element and click
      driver.findElement(SubscribeButton).click();
    }
    public DashboardPage clickDashboardMenu(){
        driver.findElement(DashboardPage).click();
        return new DashboardPage(driver);
    }
    public void clickWelcome()throws InterruptedException{
        //wait for 10secs before executing
        Thread.sleep(10000);
        driver.findElement(welcome).click();
    }
    private By loginButton = By.id("btnLogin");
    public DashboardPage clickLoginBtn(){
        driver.findElement(By.id("btnLogin")).click();
        return new DashboardPage(driver);
    }

    }
