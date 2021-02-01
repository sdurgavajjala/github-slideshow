package singleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase_1 {
    private static TestBase_1 initDriver = null;
    private WebDriver driver;

    private TestBase_1(){

    }

    public WebDriver openBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sdurg\\OneDrive\\Documents\\Automation\\chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }

    public static TestBase_1 getInstance(){
        if (initDriver==null){
            initDriver = new TestBase_1();
        }
        return initDriver;

    }
}
