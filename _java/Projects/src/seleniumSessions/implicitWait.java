package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class implicitWait {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sdurg\\OneDrive\\Documents\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.espncricinfo.com");

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //Wait for page to be loaded for 40 seconds -
        //Maximum Time out is 40 seconds - Gives error if the page is not loaded in 40 seconds
        //If the page is loaded in 2 seconds - the remaining 38 seconds are ignored
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

        //It is for the elements. It is global wait - applicable for all the elements in the page
        //Page is loaded but some elements are not available/visible.
        //Dynamic Wait
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }
}
