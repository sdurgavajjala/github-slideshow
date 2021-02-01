package seleniumSessions;

//import net.thucydides.core.model.TakeScreenshots;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class takeScreenShot {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sdurg\\OneDrive\\Documents\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://Duolingo.com");

        driver.manage().window().maximize();

        //take Screenshot and share output as file format
        File sample = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        //oopy the screenshot to the desired location
        FileHandler.copy(sample, new File("C:\\Automation\\src\\Screenshots\\sample_091920_075623.png"));
//        FileUtils.copyFile(sample, new File("C:\\CollectionsSessions\\Screenshots\\sample.png"));
    }
}
