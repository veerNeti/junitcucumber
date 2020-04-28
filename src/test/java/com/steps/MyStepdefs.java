package com.steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @When("^I search for \"([^\"]*)\"$")
    public void iSearchFor(String arg0) throws Throwable {
        System.out.println("search Keyword: "+arg0 );
    }

    @Given("^I am on the Google search page$")
    public void iAmOnTheGoogleSearchPage() {
        System.out.println( "I am on the Google search page");
    }

    @Then("^the page title should start with \"([^\"]*)\"$")
    public void thePageTitleShouldStartWith(String arg0) throws Throwable {
        System.out.println( "Then the page title should start with :"+arg0);
    }


}
