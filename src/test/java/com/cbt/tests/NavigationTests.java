package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTests {

    public static void main(String[] args) throws Exception {

        openChrome();
        Thread.sleep(3000);
        openFireFox();
        Thread.sleep(3000);
        openSafari();
        Thread.sleep(3000);

    }

    public static void openChrome() {


        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.get("http://google.com");
        String title = driver.getTitle();
        driver.navigate().to("http://etsy.com");
        String title2 = driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquals(driver.getTitle(),title);
        driver.navigate().forward();
        StringUtility.verifyEquals(driver.getTitle(),title2);
    }

//=================================================

    public static void openFireFox() {


        WebDriver driver = BrowserFactory.getDriver("firefox");

        driver.get("http://firefox.com");
        String title = driver.getTitle();
        driver.navigate().to("http://etsy.com");
        String title2 = driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquals(driver.getTitle(),title);
        driver.navigate().forward();
        StringUtility.verifyEquals(driver.getTitle(),title2);

    }
//==================================================
public static void openSafari(){
    WebDriver driver = BrowserFactory.getDriver("safari");

    driver.get("http://safari.com");
    String title = driver.getTitle();
    driver.navigate().to("http://etsy.com");
    String title2 = driver.getTitle();
    driver.navigate().back();
    StringUtility.verifyEquals(driver.getTitle(),title);
    driver.navigate().forward();
    StringUtility.verifyEquals(driver.getTitle(),title2);

}


}
