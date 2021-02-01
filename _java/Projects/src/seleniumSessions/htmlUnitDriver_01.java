package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

// Test without launching Browser
// Not Suitable for Action Class (Ex: Mouse movement, double click, Drag and Drop)
// Not recommended if HTML structure is complex
// Also Called Ghost Driver or Headless Browser
// Other Headless browsers
// HTML Unit Driver -- with Java
// PhantomJS -- JavaScript


public class htmlUnitDriver_01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sdurg\\OneDrive\\Documents\\Automation\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();

        WebDriver driver = new HtmlUnitDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //Dynamic Wait
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        driver.get("https://goodreads.com");
        System.out.println("Title:"+ driver.getTitle());
        driver.findElement(By.id("userSignInFormEmail")).sendKeys("TestID@gmail.com");
        driver.findElement(By.id("user_password")).sendKeys("TestID");
        driver.findElement(By.xpath("//input[@value=\"Sign in\"]")).click();
        System.out.println("Title:"+ driver.getTitle());
    }
}
