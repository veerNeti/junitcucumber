Feature: feature sample

  @Tag1
  Scenario: Finding some cheese
    Given I am on the Google search page
    |https://google.com/ncr|
    When I search for "Cheese!"
    Then the page title should start with "cheese"