package testSetup;

import org.testng.annotations.Test;

public class SetupTests {
    @Test
    public void testGetPageURl() {
        String pageURL = "https://opensource-demo.orangehrmlive.com/";
        if (pageURL.equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/")) {
            System.out.println("The webpage URL is"+ pageURL);
        }else {
            System.out.println("Invalid URL. Actual webPage URL is"+pageURL);
        }
    }
}
