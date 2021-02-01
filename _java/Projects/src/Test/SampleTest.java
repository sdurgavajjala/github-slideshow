package Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import singleton.Constants;
import singleton.TestBase;

public class SampleTest {
//    @BeforeClass
//    public void setUp(){
//        TestBase.init();
//    }

    @BeforeMethod
    public void setUp(){
        TestBase.init();
    }

    @Test(priority = 1)
    public void verifyTitle(){
        String actTitle= TestBase.driver.getTitle();
        System.out.println("Actual Title is "+ actTitle);
        Assert.assertEquals(actTitle, Constants.expTitle);

    }

    @Test(priority=2)
    public void verifyLogo(){
        Assert.assertEquals(TestBase.driver.findElement(By.linkText("Duolingo")).isDisplayed(), true);
    }

    @AfterMethod
    public void tearDown(){
        TestBase.quit();
    }

//    @AfterClass
//    public void tearDown(){
//        TestBase.quit();
//    }
}
