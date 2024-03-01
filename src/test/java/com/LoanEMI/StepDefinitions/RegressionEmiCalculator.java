package com.LoanEMI.StepDefinitions;

import java.io.IOException;
import java.util.Map;

import com.LoanEMI.pageObjects.Locators;
import com.LoanEMI.utils.Helper;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class RegressionEmiCalculator {
	static Locators loc;	//declaring an instance variable for Locators page
	@Given("user should be on url emicalculator.net")
	public void user_should_be_on_url_emicalculator_net() {
	    // Write code here that turns the phrase above into concrete actions
		loc = new Locators(Helper.getDriver());
	}
	
	@When("user clicks on loan EMI calculator")
	public void user_clicks_on_loan_emi_calculator() {
	    // Write code here that turns the phrase above into concrete actions
		loc.getPage();
	}

	@When("user fills loan amout in input field")
	public void user_fills_loan_amout_in_input_field() {
	    // Write code here that turns the phrase above into concrete actions
		loc.loanAmountText();
	}

	@Then("loan amount slider should move itself")
	public void loan_amount_slider_should_move_itself() {
	    // Write code here that turns the phrase above into concrete actions
		loc.verifyLoanAmountSlider();
	}

	@When("user fills interest rate amount in input field")
	public void user_fills_interest_rate_amount_in_input_field() {
	    // Write code here that turns the phrase above into concrete actions
		loc.loanInterestRateText();
	}

	@Then("interst rate slider should move itself")
	public void interst_rate_slider_should_move_itself() {
	    // Write code here that turns the phrase above into concrete actions
		loc.verifyInterestRateSlider();
	}

	@When("user fills loan tenure amount in input field")
	public void user_fills_loan_tenure_amount_in_input_field() {
	    // Write code here that turns the phrase above into concrete actions
		loc.loanTenureText();
	}

	@Then("loan tenure slider should move itself")
	public void loan_tenure_slider_should_move_itself() {
	    // Write code here that turns the phrase above into concrete actions
		loc.verifyLoanTenureSlider();
	}

	@When("user fills fee in input field")
	public void user_fills_fee_in_input_field() {
	    // Write code here that turns the phrase above into concrete actions
		loc.feeChargeText();
	}

	@Then("fee slider should move itself")
	public void fee_slider_should_move_itself() {
	    // Write code here that turns the phrase above into concrete actions
		loc.verifyFeeChargeSlider();
	}
}
