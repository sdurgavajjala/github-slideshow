package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class elementVisibility_03 {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sdurg\\OneDrive\\Documents\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //Dynamic Wait
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://goodreads.com");

        //isDisplayed - Applicable for all the elements
        Boolean isDisplayed = driver.findElement(By.name("next")).isDisplayed();
        System.out.println(isDisplayed); //true

        //isEnabled
        Boolean isEnabled = driver.findElement(By.name("next")).isEnabled();
        System.out.println(isEnabled); //true

        //isSelected - Applicable for check box, drop down, radio Button
        Boolean isSelected = driver.findElement(By.id("remember_me")).isSelected();
        System.out.println(isSelected);

    }
}
