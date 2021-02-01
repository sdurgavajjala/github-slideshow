package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseMovement {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sdurg\\OneDrive\\Documents\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.espncricinfo.com");

        //Maximize the window
        driver.manage().window().maximize();

        //delete all the cookies
        driver.manage().deleteAllCookies();

        //Create Actions class object
        Actions action = new Actions(driver);

        //Wait for 2 seconds
        Thread.sleep(2000);

        //will perform the action
        action.moveToElement(driver.findElement(By.linkText("Series"))).build().perform();

        //Click on the desired element
        driver.findElement(By.linkText("IPL 2020")).click();

    }
}
