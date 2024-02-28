Feature: EMI Calculator

  Scenario Outline: EMI Calculator for Car
    Given user opens the emicalculator.net
    And user opens the Car Loan section
    And user enters the Car loan amount as "<loan>" in input field
    And user enters the interest rate in input field as "<rate>"
    And user enters the loan tenure in input field as "<tenure>"
    When user scrolls down to year table and open months table
    Then user fetches the first month interest and principal amount and display it

    Examples: 
      | loan    | rate | tenure |
      | 1500000 |  9.5 |      1 |

  Scenario: Home Loan EMI calculator
    When user clicks on Calculators on Menu bar
    And user clicks on the Home Loan EMI calculator from dropdown
    And user fills all relevant details in all required below fields
      | homeValue         | 1500000 |
      | downPayment       |      20 |
      | loanInsurance     |   20000 |
      | homeLoanInterest  |       9 |
      | homeLoanTenure    |      10 |
      | loanFees          |    0.25 |
      | oneTimeExpense    |       8 |
      | propertyTax       |     0.2 |
      | homeInsurance     |    0.02 |
      | maintenanceCharge |    2000 |
    And user scroll down to year on year table
    Then user captures the year on year data from table and saving it in excel

  Scenario: UI check for EMI calculator
    When user clicks on Calculators on Menu bar
    And user clicks on the Loan calculator from dropdown
    When user enters loan amout in input field
    Then loan amount slider should redirect itself according to input amount
    When user enters interest rate in input field
    Then interst rate slider should redirect itself according to input amount
    When user enters loan tenure in input field
    Then loan tenure slider should redirect itself according to input amount
    When user enters fee & charges in input field
    Then fee slider should redirect itself according to input amount

  Scenario: UI check for Loan Amount calculator
    Given user clicks on Loan Amount calculator
    When user enters EMI in input field
    Then EMI slider should move
    When user gives interest rate in input field
    Then interest rate slider should move
    When user gives loan tenure in input field
    Then loan tenure slider should move
    When user gives fee & charges in input field
    Then fee slider should move

  Scenario: UI check for Loan Tenure  calculator
    Given user clicks on Loan Tenure calculator
    When user gives loan amout in input field
    Then loan amount slider should move itself according to input amount
    When user is fills EMI in input field
    Then EMI slider should move itself according to input amount
    When user fills interest rate in input field
    Then interest rate slider should move itself according to input amount
    When user fills fee & charges in input field
    Then fee slider should move itself according to input amount
