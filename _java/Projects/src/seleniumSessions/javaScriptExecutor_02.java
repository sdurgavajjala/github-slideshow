package seleniumSessions;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class javaScriptExecutor_02 {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sdurg\\OneDrive\\Documents\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //Dynamic Wait
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://goodreads.com");

        WebElement signIn = driver.findElement(By.xpath("//input[@value=\"Sign in\"]"));
        WebElement poetry = driver.findElement(By.linkText("Life quotes"));
//        highlight(signIn,driver);
//        drawBorder(signIn,driver);
        //take Screenshot and share output as file format
//        File sample = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        //oopy the screenshot to the desired location
//        FileHandler.copy(sample, new File("C:\\Automation\\src\\Screenshots\\bug_092620_081823.png"));

        //generate the Alert: User Defined Alerts
//        generateAlert(driver,"There is an issue with SignIn Button in Login Page");

        //CLick on Sign In button using Java Script
//        clickElement(signIn,driver);

        //Refresh the browser
        //1. By using Selenium
//        driver.navigate().refresh();

        //2. Using Java Script Executor
//        refreshBrowser(driver);

        //Get Title of the Page using Java Script Executor
//        System.out.println(getTitle(driver));

        //Get Inner Text from the page
//        System.out.println(getInnerText(driver));

        //Scroll to the bottom of the page
//        scrollPage(driver);

        //Scroll Into
        scrollIntoView(poetry,driver);
    }
    public static void highlight(WebElement ele, WebDriver driver ){
        //Cast the driver to JavaScriptExecutor
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        String color = ele.getCssValue("backgroundColor");
        for (int i=0;i<1;i++){
            changeColor("rgb(0,200,0)",ele,driver);
            changeColor(color,ele,driver);
        }
    }

    public static void changeColor(String color, WebElement ele, WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        //used to execute Java Script Code
        js.executeScript("arguments[0].style.backgroundColor='"+color+"'",ele);

        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){

        }
    }

    public static void drawBorder(WebElement ele, WebDriver driver) throws IOException {
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].style.border='3px solid red'",ele);

    }
    public static void generateAlert(WebDriver driver, String msg){
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("alert('"+msg+"')");

    }

    public static void clickElement(WebElement ele, WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].click()",ele);
    }

    public static void refreshBrowser(WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("history.go(0)");
    }

    public static String getTitle(WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        String title = js.executeScript("return document.title;").toString();
        return title;
    }

    public static String getInnerText(WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        String text = js.executeScript("return document.documentElement.innerText;").toString();
        return text;
    }

    public static void scrollPage(WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    public static void scrollIntoView(WebElement ele, WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true);",ele);
    }
}
