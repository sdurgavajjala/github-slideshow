package seleniumSessions;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class explicitWait {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sdurg\\OneDrive\\Documents\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://duolingo.com");
        
        //Explicitly wait is for any specific element
        //Page load doesn't guarantee all the elements to be loaded
        clickOn(driver, driver.findElement(By.linkText("I ALREADY HAVE AN ACCOUNT")),20);
//        driver.quit();

    }

    public static void clickOn(WebDriver driver, WebElement locator,int timeout) throws InterruptedException {
        new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
        locator.click();
        Thread.sleep(2000);
    }
}
