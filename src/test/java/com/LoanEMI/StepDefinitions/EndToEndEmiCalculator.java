package com.LoanEMI.StepDefinitions;

import java.io.IOException;
import java.util.Map;

import com.LoanEMI.pageObjects.Locators;
import com.LoanEMI.utils.Helper;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EndToEndEmiCalculator {

	static Locators loc;	//declaring an instance variable for Locators page
	String file = System.getProperty("user.dir") + "/src/test/resources/EndToEndEmiCalculator.xlsx";	//storing the file path
	

	@Given("user opens the emicalculator.net")
	public void user_opens_the_emicalculator_net() {
	    // Write code here that turns the phrase above into concrete actions
		loc = new Locators(Helper.getDriver());	
	}
	
/************************************ SCENARIO 1 Implementation ********************************************/

	@Given("user opens the Car Loan section")
	public void user_opens_the_car_loan_section() {
	    // Write code here that turns the phrase above into concrete actions
		loc.carLoan();
	}

	@Given("user enters the Car loan amount as {string} in input field")
	public void user_enters_the_car_loan_amount_as_in_input_field(String loan) {
	    // Write code here that turns the phrase above into concrete actions
		loc.fillLoanAmount(loan);
	}

	@Given("user enters the interest rate in input field as {string}")
	public void user_enters_the_interest_rate_in_input_field_as(String rate) {
		loc.fillInterestAmount(rate);
	}

	@Given("user enters the loan tenure in input field as {string}")
	public void user_enters_the_loan_tenure_in_input_field_as(String tenure) {
	    // Write code here that turns the phrase above into concrete actions
		loc.fillLoanTenure(tenure);
	}

	@When("user scrolls down to year table and open months table")
	public void user_scroll_down_to_year_on_year_table_and_click_on_current_year() {
	    // Write code here that turns the phrase above into concrete actions
		loc.monthlyData();
	}

	@Then("user fetches the first month interest and principal amount and display it")
	public void user_fetches_the_first_month_data_and_display_it() {
	    // Write code here that turns the phrase above into concrete actions
		loc.displayAmount();
	}

/************************************ SCENARIO 2 Implementation ********************************************/

	@When("user clicks on Calculators on Menu bar")
	public void user_clicks_on_calculators_on_menu_bar() {
	    // Write code here that turns the phrase above into concrete actions	
		loc.clickMenuBar();
	}

	@When("user clicks on the Home Loan EMI calculator from dropdown")
	public void user_clicks_on_the_home_loan_emi_calculator_from_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
		loc.clickOnHomeLoanEMI();
	}

	@When("user fills all relevant details in all required below fields")
	public void user_fills_all_relevant_details_in_all_required_below_fields(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
		Map<String,String> requiredData = dataTable.asMap(String.class,String.class);
		loc.fillingRelevantDetails(requiredData);
	}

	@When("user scroll down to year on year table")
	public void user_scroll_down_to_year_on_year_table() {
	    // Write code here that turns the phrase above into concrete actions
	    loc.scrollYearTable();
	}

	@Then("user captures the year on year data from table and saving it in excel")
	public void user_captures_the_year_on_year_data_from_table_and_saving_it_in_excel() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		loc.fetchData();
	}
/************************************ SCENARIO 3 Implementation ********************************************/
    
    @When("user clicks on the Loan calculator from dropdown")
	public void user_clicks_on_the_loan_calculator_from_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
    	loc.clickOnLoanEmiCalculator();
		
	}

	@When("user enters loan amout in input field")
	public void user_enters_loan_amout_in_input_field() {
	    // Write code here that turns the phrase above into concrete actions
		loc.loanAmountText();
	}

	@Then("loan amount slider should redirect itself according to input amount")
	public void loan_amount_slider_should_redirect_itself_according_to_input_amount() {
	    // Write code here that turns the phrase above into concrete actions
		loc.verifyLoanAmountSlider();
	}

	@When("user enters interest rate in input field")
	public void user_enters_interest_rate_in_input_field() {
	    // Write code here that turns the phrase above into concrete actions
		loc.loanInterestRateText();
	}

	@Then("interst rate slider should redirect itself according to input amount")
	public void interst_rate_slider_should_redirect_itself_according_to_input_amount() {
	    // Write code here that turns the phrase above into concrete actions
		loc.verifyInterestRateSlider();
	}

	@When("user enters loan tenure in input field")
	public void user_enters_loan_tenure_in_input_field() {
	    // Write code here that turns the phrase above into concrete actions
		loc.loanTenureText();
	}

	@Then("loan tenure slider should redirect itself according to input amount")
	public void loan_tenure_slider_should_redirect_itself_according_to_input_amount() {
	    // Write code here that turns the phrase above into concrete actions
		loc.verifyLoanTenureSlider();
	}

	@When("user enters fee & charges in input field")
	public void user_enters_fee_charges_in_input_field() {
	    // Write code here that turns the phrase above into concrete actions
		loc.feeChargeText();
	}

	@Then("fee slider should redirect itself according to input amount")
	public void fee_slider_should_redirect_itself_according_to_input_amount() {
	    // Write code here that turns the phrase above into concrete actions
		loc.verifyFeeChargeSlider();
	}

	
	//LOAN AMOUNT 
	@Given("user clicks on Loan Amount calculator")
	public void user_clicks_on_loan_amount_calculator() {
	    // Write code here that turns the phrase above into concrete actions
		loc.clickOnLoanAmountCalculator();
	}

	@When("user enters EMI in input field")
	public void user_enters_emi_in_input_field() {
	    // Write code here that turns the phrase above into concrete actions
		loc.EMIText();
	}

	@Then("EMI slider should move")
	public void emi_slider_should_move() {
	    // Write code here that turns the phrase above into concrete actions
		loc.verifyEMISlider();
	}

	@When("user gives interest rate in input field")
	public void user_gives_interest_rate_in_input_field() {
	    // Write code here that turns the phrase above into concrete actions
		loc.EMIInterestRateText();
	}

	@Then("interest rate slider should move")
	public void interest_rate_slider_should_move() {
	    // Write code here that turns the phrase above into concrete actions
		loc.verifyEMIInterestRateSlider();
	}

	@When("user gives loan tenure in input field")
	public void user_gives_loan_tenure_in_input_field() {
	    // Write code here that turns the phrase above into concrete actions
	    loc.EmiTenureText();
	}

	@Then("loan tenure slider should move")
	public void loan_tenure_slider_should_move() {
	    // Write code here that turns the phrase above into concrete actions
	    loc.verifyEMILoanTenureSlider();
	}

	@When("user gives fee & charges in input field")
	public void user_gives_fee_charges_in_input_field() {
	    // Write code here that turns the phrase above into concrete actions
	   loc.emifeeChargeText();
	}

	@Then("fee slider should move")
	public void fee_slider_should_move() {
	    // Write code here that turns the phrase above into concrete actions
	   loc.verifyEMIFeeChargeSlider();
	}

	//LOAN TENURE
	@Given("user clicks on Loan Tenure calculator")
	public void user_clicks_on_loan_tenure_calculator() {
	    // Write code here that turns the phrase above into concrete actions
	    loc.clickOnLoanTenureCalculator();
	}

	@When("user gives loan amout in input field")
	public void user_gives_loan_amout_in_input_field() {
	    // Write code here that turns the phrase above into concrete actions
	   loc.loanAmountTenureText();
	}

	@Then("loan amount slider should move itself according to input amount")
	public void loan_amount_slider_should_move_itself_according_to_input_amount() {
	    // Write code here that turns the phrase above into concrete actions
	    loc.verifyLoanAmountTenureSlider();
	}

	@When("user is fills EMI in input field")
	public void user_is_fills_emi_in_input_field() {
	    // Write code here that turns the phrase above into concrete actions
	    loc.tenureEmiAmountText();
	}

	@Then("EMI slider should move itself according to input amount")
	public void emi_slider_should_move_itself_according_to_input_amount() {
	    // Write code here that turns the phrase above into concrete actions
	   loc.verifyTenureEMISlider();
	}
    
	@When("user fills interest rate in input field")
	public void user_fills_interest_rate_in_input_field() {
		loc.tenureInterestRateText();
	}
	@Then("interest rate slider should move itself according to input amount")
	public void interest_rate_slider_should_move_itself_according_to_input_amount() {
	    // Write code here that turns the phrase above into concrete actions
	    loc.verifyTenureInterestRateSlider();
	}

	@When("user fills fee & charges in input field")
	public void user_fills_fee_charges_in_input_field() {
	    // Write code here that turns the phrase above into concrete actions
	    loc.tenurefeeChargeText();
	}

	@Then("fee slider should move itself according to input amount")
	public void fee_slider_should_move_itself_according_to_input_amount() {
	    // Write code here that turns the phrase above into concrete actions
	    loc.verifytenureFeeChargeSlider();
	}
	
	
}