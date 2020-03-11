package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) {

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        List<String> titles = new ArrayList<>();

        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver = new ChromeDriver();

        for (int x = 0; x < urls.size() ; x++) {
            driver.get(urls.get(x));
            titles.add(driver.getTitle());
            if(driver.getCurrentUrl().startsWith("http://practice.cybertekschool.com")){
                System.out.println("URL of "+driver.getCurrentUrl()+" start with http://practice.cybertekschool.com");
            }else{
                System.out.println("TEST FAILED");
            }

        }

        for (int i = 0; i < titles.size()-1 ; i++) {
            StringUtility.verifyEquals(titles.get(i) , titles.get(i+1));
        }

        driver.quit();

    }
}
