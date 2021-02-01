package singleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver = null;


    public static void init(){
        if (driver==null){
            if (Constants.bName.equalsIgnoreCase("Chrome")){
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\sdurg\\OneDrive\\Documents\\Automation\\chromedriver.exe");
                driver = new ChromeDriver();
            } else if (Constants.bName.equalsIgnoreCase("Firefox")){
                System.setProperty("webdriver.gecko.driver", "C:\\Users\\sdurg\\OneDrive\\Documents\\Automation\\chromedriver.exe");
                driver = new FirefoxDriver();
            }
        }
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(Constants.url);
    }

    public static void quit(){
        System.out.println("Quit the browser");
        driver.quit();
        driver = null;
    }

    public static void close(){
        System.out.println("closing the browser");
        driver.quit();
        driver = null;
    }
}
