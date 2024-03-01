@smoke
Feature: EMI Calculator Smoke

  #EMI caluclator input all fields testing
  @smoke
  Scenario: EMI calculator loan amount input field displayed
    Given user is on url emicalculator.net
    When user clicks on EMI calculator
    Then user checks if loan amount input field displayed in EMI Calculator

  @smoke
  Scenario: EMI calculator interest rate input field displayed
    Given user is on url emicalculator.net
    When user clicks on EMI calculator
    Then user checks if interest rate input field displayed in EMI Calculator

  @smoke
  Scenario: EMI calculator loan tenure input field displayed
    Given user clicks on EMI calculator
    When user clicks on EMI calculator
    Then user checks if loan tenure input field displayed in EMI Calculator

  @smoke
  Scenario: EMI calculator fee and charges input field displayed
    Given user is on url emicalculator.net
    When user clicks on EMI calculator
    Then user checks if fee and charges input field displayed in EMI Calculator

  #  LOAN AMOUNT caluclator input all fields testing
  @smoke
  Scenario: Loan Amount calculator EMI input field displayed
    Given user is on Loan Amount calculator
    Then user checks if EMI input field displayed in Loan Amount Calculator

  @smoke
  Scenario: Loan Amount calculator interest rate input field displayed
    Given user is on Loan Amount calculator
    And user checks if interest rate input field displayed in Loan Amount Calculator

  @smoke
  Scenario: Loan Amount calculator loan tenure input field displayed
    Given user is on Loan Amount calculator
    And user checks if loan tenure input field displayed in Loan Amount Calculator

  @smoke
  Scenario: Loan Amount calculator fee and charges input field displayed
    Given user is on Loan Amount calculator
    Then user checks if fee and charges input field displayed in Loan Amount Calculator

  #LOAN TENURE caluclator input all fields testing
  @smoke
  Scenario: Loan Tenure calculator loan amount input field displayed
    Given user is on Loan Tenure calculator
    Then user checks if loan amount input field displayed in Loan Tenure Calculator

  @smoke
  Scenario: Loan Tenure calculator EMI input field displayed
    Given user is on Loan Tenure calculator
    Then user checks if EMI input field displayed in Loan Tenure Calculator

  @smoke
  Scenario: Loan Tenure calculator interest rate input field displayed
    Given user is on Loan Tenure calculator
    Then user checks if interest rate input field displayed in Loan Tenure Calculator

  @smoke
  Scenario: Loan Tenure calculator fee and charges input field displayed
    Given user is on Loan Tenure calculator
    Then user checks if fee and charges input field displayed in Loan Tenure Calculator
