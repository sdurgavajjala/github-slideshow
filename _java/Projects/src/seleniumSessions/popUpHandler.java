package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class popUpHandler {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sdurg\\OneDrive\\Documents\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://popuptest.com/");

        driver.manage().window().maximize();

        driver.findElement(By.linkText("Come & Go Test")).click();
        Thread.sleep(2000);
        Set<String> handler =   driver.getWindowHandles();

        Iterator<String> itr =  handler.iterator();

        String ParentWindowID = itr.next();
        System.out.println("Parent Window ID: "+ParentWindowID);

        String  ChildWindowID = itr.next();
        System.out.println("Child Window ID:"+ChildWindowID);

        driver.switchTo().window(ChildWindowID);
        Thread.sleep(2000);
        System.out.println("Child Window Popup Title:" +driver.getTitle());
        driver.close();

        driver.switchTo().window(ParentWindowID);
        Thread.sleep(2000);
        System.out.println("Parent Window Popup Title:" +driver.getTitle());
        driver.close();



    }
}
