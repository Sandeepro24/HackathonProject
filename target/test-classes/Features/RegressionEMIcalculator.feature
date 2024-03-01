@regression
Feature: EMI Calculator regression

  @regression
  Scenario: Checking functionality of loan amount input field and slider assosiated with it
    Given user should be on url emicalculator.net
    And user clicks on loan EMI calculator
    When user fills loan amout in input field
    Then loan amount slider should move itself
    
  @regression
  Scenario: Checking functionality of interest rate input field and slider assosiated with it
     When user fills interest rate amount in input field
    Then interst rate slider should move itself

  @regression
  Scenario: Checking functionality of loan tenure input field and slider assosiated with it
    When user fills loan tenure amount in input field
    Then loan tenure slider should move itself

  @regression
  Scenario: Checking functionality of fees and charge input field and slider assosiated with it
    When user fills fee in input field
    Then fee slider should move itself
