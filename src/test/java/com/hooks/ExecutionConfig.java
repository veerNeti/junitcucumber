package com.hooks;


import com.base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecutionConfig extends BaseTest {
    public static WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver( ).setup( );
        driver = new ChromeDriver( );
        System.out.println("I Start HERE");
    }

    @After
    public void quit() {
        driver.close( );
        driver.quit( );

        System.out.println("I Start Quit");
    }

}
