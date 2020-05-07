package com.hooks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleContains;

/**
 * Created by IntelliJ IDEA.
 * User: Veeresh Bikkaneti
 * Date: 05-06-2020
 * Time: 09:32 PM
 */
public class WaitLogic {
    private WebDriver driver;
    private Duration time;

    public WaitLogic(WebDriver driver, Duration time) {
        this.driver = driver;
        this.time = time;
    }

    private WebDriverWait waitfor() {
        return new WebDriverWait(this.driver, time);
    }

    public WebElement elementisLocatedBy(By by) {
        return waitfor( ).until(presenceOfElementLocated(by));
    }

    public Boolean titleIsmatching(String title) {
        return waitfor( ).until(titleContains(title));
    }

}
