package com.SP;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test2ForJenkins

{private WebDriver driver;

    @BeforeAll
    static void oneTimeSetUp()
    {
        WebDriverManager.chromedriver().setup();
        String name = System.getProperty("os.name");
        System.out.println("OS name is " + name);
    }

    @BeforeEach
    void setUp()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    void test()
    {
     driver.get("https://spincareer.com/");
     assertTrue(driver.getTitle().contains("Online Academy"));

    }
    @AfterEach
    void tearDown()
    {
        driver.quit();
    }
}
