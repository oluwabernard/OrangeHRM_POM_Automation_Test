package testLogin;

import SetUp.SetUps;
import org.testng.annotations.Test;
import pageObject.DashboardPage;
import pageObject.SubscriberPage;

public class LoginTests extends SetUps {
    //testNG annotation
    @Test
    public void testLogin() throws InterruptedException {

        loginPage.enterUsername("Admin");
        loginPage.enterUserPassword("admin123");
        //Handle for DashboardPage
        DashboardPage dashboardPage = loginPage.clickLoginBtn();
        dashboardPage.clickWelcome();
        loginPage = dashboardPage.clickLogout();
    }
}
