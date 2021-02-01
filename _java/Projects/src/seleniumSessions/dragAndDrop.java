package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sdurg\\OneDrive\\Documents\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("https://jqueryui.com/droppable/");

        //Switch to the desired Frame
        driver.switchTo().frame(0);

        //Create Actions class to drag and drop
        Actions action = new Actions(driver);
        //
        action.clickAndHold(driver.findElement(By.xpath("//*[@id = \"draggable\"]")))
                .moveToElement(driver.findElement(By.xpath("//*[@id = \"droppable\"]")))
                .release()
                .build()
                .perform();
    }

}
