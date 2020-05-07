package com.base;

import com.hooks.ExecutionConfig;
import com.hooks.WaitLogic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

/**
 * Created by IntelliJ IDEA.
 * User: Veeresh Bikkaneti
 * Date: 05-06-2020
 * Time: 09:22 PM
 */
public class BaseTest {
    private Duration MAX_TIMEOUT = Duration.ofSeconds(10);
    protected WebDriver driver;
    protected WaitLogic wait;

    public BaseTest() {
        this.driver = ExecutionConfig.driver;
        this.wait = new WaitLogic(this.driver, MAX_TIMEOUT);
    }

    public void click(By by) {
        this.wait.elementisLocatedBy(by).click( );
    }

    public void typeText(By by, String text) {
        this.wait.elementisLocatedBy(by).sendKeys(text);
    }


    public String readText(By by) {
        return this.wait.elementisLocatedBy(by).getText( );
    }
}
