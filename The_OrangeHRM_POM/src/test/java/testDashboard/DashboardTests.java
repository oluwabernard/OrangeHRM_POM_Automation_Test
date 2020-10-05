package testDashboard;

import org.testng.annotations.Test;
import pageObject.DashboardPage;
import pageObject.SubscriberPage;
import testLogin.LoginTests;

public class DashboardTests extends LoginTests {
    private DashboardPage dashboardPage;

    @Test
    public void testDashboard()throws InterruptedException{
  loginPage.enterUsername("Admin");
  loginPage.enterUserPassword("admin123");
        DashboardPage dashboardPage=loginPage.clickLoginBtn();
    }
    @Test (priority = 1)
    //This class extends to the SetupTests as the SetupTests class contains all the setup requirements to run our test
    public void  testLogout() throws InterruptedException
    {
        //Handler for dashboard page
        dashboardPage.clickWelcome ();
        dashboardPage.clickLogout ();}




    }
