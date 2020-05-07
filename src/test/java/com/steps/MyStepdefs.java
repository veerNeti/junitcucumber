package com.steps;

/*
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;*/

import com.base.BaseTest;
import com.hooks.ExecutionConfig;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class MyStepdefs extends BaseTest {
    @When("^I search for \"([^\"]*)\"$")
    public void iSearchFor(String arg0) throws Throwable {
        driver.get("https://google.com/ncr");
        driver.findElement(By.name("q")).sendKeys("cheese" + Keys.ENTER);
        WebElement firstResult = wait.elementisLocatedBy(By.cssSelector("h3>div"));
        System.out.println(firstResult.getAttribute("textContent"));
        System.out.println("search Keyword: "+arg0 );
    }

    @Given("^I am on the Google search page$")
    public void iAmOnTheGoogleSearchPage(DataTable dataTable) {
        System.out.println("Testdata: "+dataTable.row(0) );
        System.out.println( "I am on the Google search page");
    }

    @Then("^the page title should start with \"([^\"]*)\"$")
    public void thePageTitleShouldStartWith(String arg0) throws Throwable {
        System.out.println( "Then the page title should start with :"+arg0);
    }


}
