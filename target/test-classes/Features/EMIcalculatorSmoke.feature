@smoke
Feature: EMI Calculator
  @smoke
  Scenario: EMI Calculator loan amount UI check
    Given user is on https://emicalculator.net/loan-calculator/ url
    When user enters loan amout in input field
    And user clicks on outside of the input field
    Then slider should redirect itself according to input amount
    When user clicks on slider and hold on it
    And user move the slider in right or left direction
    Then amount should be visible in input field according the position of slider
   @smoke
   Scenario: EMI Calculator interest rate UI check
    Given user is on https://emicalculator.net/loan-calculator/ url
    When user enters interest rate in input field
    And user clicks on outside of the input field
    Then slider should redirect itself according to input amount
    When user clicks on slider and hold on it
    And user move the slider in right or left direction
    Then interest rate should be visible in input field according the position of slider
    @smoke
   Scenario: EMI Calculator loan tenure UI check
    Given user is on https://emicalculator.net/loan-calculator/ url
    When user enters loan tenure in input field
    And user clicks on outside of the input field
    Then slider should redirect itself according to input amount
    When user clicks on slider and hold on it
    And user move the slider in right or left direction
    Then loan tenure should be visible in input field according the position of slider
    @smoke
   Scenario: EMI Calculatro fee & charges UI check
    Given user is on https://emicalculator.net/loan-calculator/ url
    When user enters fee & charges in input field
    And user clicks on outside of the input field
    Then slider should redirect itself according to input amount
    When user clicks on fee & charges slider and hold on it
    And user move the slider in right or left direction
    Then amount should be visible in input field according the position of slider
    #UI check of loan amount calculator
    @smoke
    Scenario: Loan Amount Calculator EMI UI check
    When user clicks on Calculators on Menu bar
    And user clicks on Loan Calculator from dropdown
    And user clicks on EMI calculator
    When user enters loan amout in input field
    And user clicks on outside of the input field
    Then slider should redirect itself according to input amount
    When user clicks on slider and hold on it
    And user move the slider in right or left direction
    Then amount should be visible in input field according the position of slider
    When user enters interest rate in input field
    And user clicks on outside of the input field
    Then slider should redirect itself according to input amount
    When user clicks on slider and hold on it
    And user move the slider in right or left direction
    Then interest rate should be visible in input field according the position of slider
    When user enters loan tenure in input field
    And user clicks on outside of the input field
    Then slider should redirect itself according to input amount
    When user clicks on slider and hold on it
    And user move the slider in right or left direction
    Then loan tenure should be visible in input field according the position of slider
    When user enters fee & charges in input field
    And user clicks on outside of the input field
    Then slider should redirect itself according to input amount
    When user clicks on fee & charges slider and hold on it
    And user move the slider in right or left direction
    Then amount should be visible in input field according the position of slider
    #UI Check for Loan Tenure Calculator
    When user clicks on Calculators on Menu bar
    And user clicks on Loan Calculator from dropdown
    And user clicks on EMI calculator
    When user enters loan amout in input field
    And user clicks on outside of the input field
    Then slider should redirect itself according to input amount
    When user clicks on slider and hold on it
    And user move the slider in right or left direction
    Then amount should be visible in input field according the position of slider
    When user enters interest rate in input field
    And user clicks on outside of the input field
    Then slider should redirect itself according to input amount
    When user clicks on slider and hold on it
    And user move the slider in right or left direction
    Then interest rate should be visible in input field according the position of slider
    When user enters loan tenure in input field
    And user clicks on outside of the input field
    Then slider should redirect itself according to input amount
    When user clicks on slider and hold on it
    And user move the slider in right or left direction
    Then loan tenure should be visible in input field according the position of slider
    When user enters fee & charges in input field
    And user clicks on outside of the input field
    Then slider should redirect itself according to input amount
    When user clicks on fee & charges slider and hold on it
    And user move the slider in right or left direction
    Then amount should be visible in input field according the position of slider