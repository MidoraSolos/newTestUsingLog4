package Tester;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class extendReports {
    public static void main(String[] args){
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent1.html");

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        ExtentTest test = extent.createTest("Google Search Test", "a test to validate if google search works properly");

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ahmed\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        test.log(Status.INFO,"Starting TestCase");
        driver.get("https://www.google.com");
        test.pass("Navigated to google");
        driver.findElement(By.name("q")).sendKeys("testcase");
        test.pass("Entered Test in searchbox");
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
        test.pass("Clicked to send on google");
        driver.close();
        driver.quit();
        test.pass("Closed Browser");
        test.info("Test Completed");
        extent.flush();




    }
}
