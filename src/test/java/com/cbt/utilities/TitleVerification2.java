package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {

    public static void main(String[] args) throws  Exception{

        List<String> urls = Arrays.asList("http://luluandgeorgia.com", "http://wayfair.com/",
                                                 "http://walmart.com", "http://westelm.com/");

        WebDriver driver = BrowserFactory.getDriver("chrome");

        for (int x = 0; x < urls.size() ; x++) {
            driver.get(urls.get(x));
            String title = driver.getTitle().replace(" ","").toLowerCase();

            if(urls.get(x).contains(title)){
                System.out.println("TEST PASSED: "+ urls.get(x) +title);
            }else{
                System.out.println("TEST FAILED:  "+ urls.get(x)+ title);
            }

        }

        driver.quit();


    }
}
