package singleton;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTest_1 {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        TestBase_1 instanceDriver = TestBase_1.getInstance();
        instanceDriver.openBrowser();
    }

    @Test
    public void testMethod1(){
        driver.get("https://www.duolingo.com");
        System.out.println(driver.getTitle());
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
