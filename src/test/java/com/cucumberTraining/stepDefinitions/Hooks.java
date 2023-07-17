package com.cucumberTraining.stepDefinitions;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.UtilityFunctions;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static pages.Login.driver;

public class Hooks {
    @AfterAll
    public static void closeBrowser() {
        try {
            driver.close();
            System.out.println("The driver has been closed.");
        } catch (Exception e) {
            System.out.println("No driver found !!!!");
        }
    }

    @Before(order = 0)
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Before(order = 1, value = "@taggedHook")
    public void checkTaggedHooks() {
        System.out.println("Before tagged Hook executed !!!!");
    }

    @BeforeAll
    public static void checkBeforeAll() {
        Properties prop = new Properties();
        try {
            prop.load(new FileReader(System.getProperty("user.dir") + "/src/test/resources/config.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Before All Hook executed !!!!");
        System.out.println("Runtime system property :" + System.getProperty("BrowserVersion"));
        System.out.println("Runtime system property :" + prop.getProperty("env"));
        System.out.println("Todays date in given format :" + UtilityFunctions.getTodaysDateInyyyymmddFormat());
    }
}
