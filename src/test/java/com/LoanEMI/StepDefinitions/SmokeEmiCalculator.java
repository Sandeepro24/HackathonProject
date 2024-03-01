package com.LoanEMI.StepDefinitions;
import java.io.IOException;
import java.util.Map;

import com.LoanEMI.pageObjects.Locators;
import com.LoanEMI.utils.Helper;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class SmokeEmiCalculator {
	static Locators loc=new Locators(Helper.getDriver());	//declaring an instance variable for Locators page
	@Given("user is on url emicalculator.net")
	public void user_is_on_url_emicalculator_net() {
	    // Write code here that turns the phrase above into concrete actions
		loc = new Locators(Helper.getDriver());
	}

	@When("user clicks on EMI calculator")
	public void user_clicks_on_emi_calculator() {
	    // Write code here that turns the phrase above into concrete actions
		loc.getPage();
	}

	@Then("user checks if loan amount input field displayed in EMI Calculator")
	public void user_checks_if_loan_amount_input_field_displayed_in_emi_calculator() {
	    // Write code here that turns the phrase above into concrete actions
		loc.loanAmountText();
	}

	@Then("user checks if interest rate input field displayed in EMI Calculator")
	public void user_checks_if_interest_rate_input_field_displayed_in_emi_calculator() {
	    // Write code here that turns the phrase above into concrete actions
		loc.loanInterestRateText();
	}

	@Then("user checks if loan tenure input field displayed in EMI Calculator")
	public void user_checks_if_loan_tenure_input_field_displayed_in_emi_calculator() {
	    // Write code here that turns the phrase above into concrete actions
		loc.loanTenureText();
	}

	@Then("user checks if fee and charges input field displayed in EMI Calculator")
	public void user_checks_if_fee_and_charges_input_field_displayed_in_emi_calculator() {
	    // Write code here that turns the phrase above into concrete actions
		loc.feeChargeText();
	}

	// LOAN AMOUNT 
	@Given("user is on Loan Amount calculator")
	public void user_is_on_loan_amount_calculator() {
	    // Write code here that turns the phrase above into concrete actions
		loc.clickOnLoanAmountCalculator();
	}

	@Given("user checks if EMI input field displayed in Loan Amount Calculator")
	public void user_checks_if_emi_input_field_displayed_in_loan_amount_calculator() {
	    // Write code here that turns the phrase above into concrete actions
		loc.EMIText();
	}

	@Given("user checks if interest rate input field displayed in Loan Amount Calculator")
	public void user_checks_if_interest_rate_input_field_displayed_in_loan_amount_calculator() {
	    // Write code here that turns the phrase above into concrete actions
		loc.EMIInterestRateText();
	}

	@Given("user checks if loan tenure input field displayed in Loan Amount Calculator")
	public void user_checks_if_loan_tenure_input_field_displayed_in_loan_amount_calculator() {
	    // Write code here that turns the phrase above into concrete actions
		loc.EmiTenureText();
	}

	@Given("user checks if fee and charges input field displayed in Loan Amount Calculator")
	public void user_checks_if_fee_and_charges_input_field_displayed_in_loan_amount_calculator() {
		loc.emifeeChargeText();
	}

	
	//LOAN TENURE
	
	@Given("user is on Loan Tenure calculator")
	public void user_is_on_loan_tenure_calculator() {
	    // Write code here that turns the phrase above into concrete actions
		loc.clickOnLoanTenureCalculator();
	}
	
	@Given("user checks if loan amount input field displayed in Loan Tenure Calculator")
	public void user_checks_if_loan_amount_input_field_displayed_in_loan_tenure_calculator() {
	    // Write code here that turns the phrase above into concrete actions
		loc.loanAmountTenureText();
	}

	@Given("user checks if EMI input field displayed in Loan Tenure Calculator")
	public void user_checks_if_emi_input_field_displayed_in_loan_tenure_calculator() {
	    // Write code here that turns the phrase above into concrete actions
		loc.tenureEmiAmountText();
	}

	@Given("user checks if interest rate input field displayed in Loan Tenure Calculator")
	public void user_checks_if_interest_rate_input_field_displayed_in_loan_tenure_calculator() {
	    // Write code here that turns the phrase above into concrete actions
		loc.tenureInterestRateText();
	}

	@Given("user checks if fee and charges input field displayed in Loan Tenure Calculator")
	public void user_checks_if_fee_and_charges_input_field_displayed_in_loan_tenure_calculator() {
	    // Write code here that turns the phrase above into concrete actions
		loc.tenurefeeChargeText();
	}
}
