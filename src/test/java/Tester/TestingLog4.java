package Tester;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class TestingLog4 {
    private static Logger logger = LogManager.getLogger(TestingLog4.class);


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ahmed\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.crunchyroll.com/");
        driver.findElement(By.xpath("//*[@id=\"header_userpanel_beta\"]/ul/li[1]")).click();
        logger.info("Clicked login");




        System.out.println("Done");
    }

//    @Test
//    public void check() {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ahmed\\Downloads\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.crunchyroll.com/");
//        driver.findElement(By.className("userpanel-item login")).click();
//        logger.info("Clicked login");
//    }
}
