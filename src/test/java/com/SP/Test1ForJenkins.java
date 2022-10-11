package com.SP;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test1ForJenkins
{
    private WebDriver driver;

    @BeforeAll
    static void oneTimeSetUp()
    {
        WebDriverManager.chromedriver().setup();
    }
    @BeforeEach
    void setUp()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @Test
    void openSeleniumSite()
    {
        driver.get("https://www.selenium.dev/");
        assertEquals("Selenium", driver.getTitle());
    }

    @AfterEach
    void tearDown()
    {
        driver.quit();
    }
}
