package com.LoanEMI.pageObjects;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.LoanEMI.utils.DataReader;
import com.LoanEMI.utils.Helper;

public class Locators extends BasePage {

    
	public Locators(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
/************************************ ALL XPATHS Implementation ********************************************/
	//Scenario 1
	@FindBy(id="car-loan")
	public static WebElement carLoan;
	@FindBy(xpath = "//input[@id='loanamount']")
	public static WebElement loanAmount;	
	@FindBy(xpath="//input[@id='loaninterest']")
	public static WebElement interestRate;
	@FindBy(xpath="//input[@id='loanterm']")
	public static WebElement loanTenure;
	@FindBy(xpath="//div[@id='emipaymenttable']/table/tbody/tr[2]/td[1]")
	public static WebElement yearTable;
	@FindBy(xpath="//*[@id='monthyear2024']/td/div/table/tbody/tr[1]/td[2]")
	public static WebElement principalAmount;
	@FindBy(xpath="//*[@id='monthyear2024']/td/div/table/tbody/tr[1]/td[3]")
	public static WebElement interestAmount;
	
	//Scenario 2
	@FindBy(xpath="//a[@id='menu-item-dropdown-2696']")
	public static WebElement menuBar;
	@FindBy(xpath="//*[@id='menu-item-3294']/a")
	public static WebElement homeLoanEMI;
	@FindBy(id="homeprice")
	public static WebElement homeValue;
	@FindBy(id="downpayment")
	public static WebElement downPayment;
	@FindBy(id="homeloaninsuranceamount")
	public static WebElement loanInsurance;
	@FindBy(id="homeloaninterest")
	public static WebElement homeLoanInterest;
	@FindBy(id="homeloanterm")
	public static WebElement homeLoanTenure;
	@FindBy(id="loanfees")
	public static WebElement loanFees;
	@FindBy(id="onetimeexpenses")
	public static WebElement oneTimeExpense;
	@FindBy(id="propertytaxes")
	public static WebElement propertyTax;
	@FindBy(id="homeinsurance")
	public static WebElement homeInsurance;
	@FindBy(id="maintenanceexpenses")
    public static WebElement maintenanceCharge;
	
	//Scenario 3
	@FindBy(id="menu-item-2423")
	public static WebElement loanCalculator;
	@FindBy(id="emi-calc")
	public static WebElement emiCalculator;
	@FindBy(id="loan-amount-calc")
	public static WebElement loanAmountCalculator;
	@FindBy(id="loan-tenure-calc")
	public static WebElement loanTenureCalculator;
	@FindBy(xpath="//*[@id='loanamountslider']/span") 
	public static WebElement loanAmountSlider;
	@FindBy(xpath="//*[@id='loaninterestslider']/span")
	public static WebElement interestRateSlider;
	@FindBy(xpath="//*[@id='loantermslider']/span")
	public static WebElement loanTenureSlider;
	@FindBy(xpath="//*[@id='loanfeesslider']/span")
	public static WebElement loanfeeSlider;
	@FindBy(id="loanemi")
	public static WebElement loanemi;
	@FindBy(xpath="//*[@id='loanemislider']/span")
	public static WebElement emiSlider;
	
	JavascriptExecutor js = (JavascriptExecutor) driver;	//instantiating the javascriptExecutor

	

/************************************ SCENARIO 1 Implementation ********************************************/
	//method for opening car loan section
	public void carLoan() {
		carLoan.click();
	}
	
	public void fillLoanAmount(String loan) {
		loanAmount.sendKeys(Keys.chord(Keys.CONTROL, "a"));//pressing cntrl+a select content in input field
		loanAmount.sendKeys(Keys.BACK_SPACE);//using backspace to delete
		loanAmount.sendKeys(loan);
	}
	
	public void fillInterestAmount(String rate){
		
		interestRate.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		interestRate.sendKeys(Keys.BACK_SPACE);
		interestRate.sendKeys(rate);
	}
	
	public void fillLoanTenure(String tenure) {
		loanTenure.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		loanTenure.sendKeys(Keys.BACK_SPACE);
		loanTenure.sendKeys(tenure);
		carLoan.click();//clicking one more time on screen so that slider get updated
	}

	public void monthlyData() {
		js.executeScript("arguments[0].scrollIntoView(true)", yearTable);
		yearTable.click();
		
	}
	
	public void displayAmount() {
		System.out.println("Principal Amount is "+ principalAmount.getText()+" and interest amount is "+ interestAmount.getText());
	}
	
	/************************************ SCENARIO 2 Implementation ********************************************/
	
	public void clickMenuBar() {
		menuBar.click();
	}
	
	public void clickOnHomeLoanEMI() {
		homeLoanEMI.click();
	}
	
	public void fillingRelevantDetails(Map<String,String> dataMap) {
		for(String s: dataMap.values()) {
			System.out.println(s);
		}
		//filling homevalue amount
		homeValue.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		homeValue.sendKeys(Keys.BACK_SPACE);
		homeValue.sendKeys(dataMap.get("homeValue"));
		
		//filling downpayment input section
		downPayment.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		downPayment.sendKeys(Keys.BACK_SPACE);
		downPayment.sendKeys(dataMap.get("downPayment"));
		
		//filling loan insurance section
		loanInsurance.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		loanInsurance.sendKeys(Keys.BACK_SPACE);
		loanInsurance.sendKeys(dataMap.get("loanInsurance"));
		
		//filling interest rate section
		homeLoanInterest.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		homeLoanInterest.sendKeys(Keys.BACK_SPACE);
		homeLoanInterest.sendKeys(dataMap.get("homeLoanInterest"));
		
		//filling home loan tenure details
		homeLoanTenure.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		homeLoanTenure.sendKeys(Keys.BACK_SPACE);
		homeLoanTenure.sendKeys(dataMap.get("homeLoanTenure"));
		
		//filling home loan tenure details
		loanFees.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		loanFees.sendKeys(Keys.BACK_SPACE);
		loanFees.sendKeys(dataMap.get("loanFees"));
		
		//Filling one time expenses section
	    oneTimeExpense.sendKeys(Keys.chord(Keys.CONTROL,"a"));	
	    oneTimeExpense.sendKeys(Keys.BACK_SPACE);
	    oneTimeExpense.sendKeys(dataMap.get("oneTimeExpense"));
	    
	    
	    propertyTax.sendKeys(Keys.chord(Keys.CONTROL,"a"));	
	    propertyTax.sendKeys(Keys.BACK_SPACE);
	    propertyTax.sendKeys(dataMap.get("propertyTax"));
	    
	    homeInsurance.sendKeys(Keys.chord(Keys.CONTROL,"a"));	
	    homeInsurance.sendKeys(Keys.BACK_SPACE);
	    homeInsurance.sendKeys(dataMap.get("homeInsurance"));
	    
	    
	    maintenanceCharge.sendKeys(Keys.chord(Keys.CONTROL,"a"));	
	    maintenanceCharge.sendKeys(Keys.BACK_SPACE);
	    maintenanceCharge.sendKeys(dataMap.get("maintenanceCharge"));
		 
	    
	}
	
	public void scrollYearTable() {
		 js.executeScript("arguments[0].scrollIntoView(true)",driver.findElement(By.xpath("//th[@id='yearheader']")));
	}
	
	public void fetchData() throws IOException {
		//Setting titles in excel file
		try {
			List<WebElement> Titles= driver.findElements(By.xpath("//tr[@class='row no-margin']/th"));
			String xlfile = System.getProperty("user.dir")+"\\src\\test\\resources\\yearOnYearData.xlsx";
		    int col=0;
	 		 for(WebElement title: Titles) {
	 			// System.out.println(title.getText());
	 			 DataReader.setCellData(xlfile, "sheet1", "0", col++, title.getText());
	 		 }
	 		 
	 		 //Setting the data in respective row &columns
	 		for(int i=1;i<=11;i++) {
				 for(int j=1;j<=7;j++) {
					 String path="//tr[@class='row no-margin yearlypaymentdetails\']["+i+"]/td["+j+"]";
					 String entry = driver.findElement(By.xpath(path)).getText();
					// System.out.println(entry);
					 DataReader.setCellData(xlfile, "sheet1", Integer.toString(i), j-1, entry);
				 }
				// System.out.println("");
			 }
		}catch(Exception e) {
			
		}
		
	}

/************************************ SCENARIO 3 Implementation ********************************************/
	Actions act= new Actions(driver);
	public void clickOnLoanEmiCalculator() {
		loanCalculator.click();
	}
	
	public void loanAmountText(){
		boolean flag = loanAmount.isDisplayed();
		Assert.assertTrue(flag);
		Assert.assertEquals(flag, true,"Text Box is not working");
	}
	
	public void verifyLoanAmountSlider() {
		String amount1=loanAmount.getAttribute("value");
  		act.dragAndDropBy(loanAmountSlider, 10, 0).build().perform();
  		String amount2 = loanAmount.getAttribute("value");
  		boolean amount = amount1.equals(amount2);
  		Assert.assertEquals(false, amount);
  		System.out.println("Loan Interest slider working........... ");
	}
	
	public void loanInterestRateText(){
		boolean flag = interestRate.isDisplayed();
		Assert.assertTrue(flag);
		Assert.assertEquals(flag, true,"Text Box is not working");
	}
	
	public void verifyInterestRateSlider() {
		String amount1=interestRate.getAttribute("value");
  		act.dragAndDropBy(interestRateSlider, 10, 0).build().perform();
  		String amount2 = interestRate.getAttribute("value");
  		boolean amount = amount1.equals(amount2);
  		Assert.assertEquals(false, amount);
  		System.out.println("Interest rate slider working........... ");
	}
	
	public void loanTenureText(){
		boolean flag = loanTenure.isDisplayed();
		Assert.assertTrue(flag);
		Assert.assertEquals(flag, true,"Text Box is not working");
	}
	
	public void verifyLoanTenureSlider() {
		String amount1=loanTenure.getAttribute("value");
  		act.dragAndDropBy(loanTenureSlider, 10, 0).build().perform();
  		String amount2 = loanTenure.getAttribute("value");
  		boolean amount = amount1.equals(amount2);
  		Assert.assertEquals(false, amount);
  		System.out.println("Interest rate slider working........... ");
	}
	
	public void feeChargeText(){
		boolean flag = loanFees.isDisplayed();
		Assert.assertTrue(flag);
		Assert.assertEquals(flag, true,"Text Box is not working");
	}
	
	public void verifyFeeChargeSlider() {
		String amount1=loanFees.getAttribute("value");
  		act.dragAndDropBy(loanfeeSlider, 10, 0).build().perform();
  		String amount2 = loanFees.getAttribute("value");
  		boolean amount = amount1.equals(amount2);
  		Assert.assertEquals(false, amount);
  		System.out.println("Interest rate slider working........... ");
	}
	
	//UI Check for LOANAMOUNT CALCULATOR
	
	
	public void clickOnLoanAmountCalculator() {
			loanAmountCalculator.click();
	}	
	
	public void EMIText(){
		boolean flag = loanemi.isDisplayed();
		Assert.assertEquals(flag, true,"Text Box is not working");
	}
	
	public void verifyEMISlider() {
		String amount1=loanemi.getAttribute("value");
  		act.dragAndDropBy(emiSlider, 10, 0).build().perform();
  		String amount2 = loanemi.getAttribute("value");
  		boolean amount = amount1.equals(amount2);
  		Assert.assertEquals(false, amount);
  		System.out.println("Loan Interest slider working........... ");
	}
	
	public void EMIInterestRateText(){
		boolean flag = interestRate.isDisplayed();
		Assert.assertTrue(flag);
		Assert.assertEquals(flag, true,"Text Box is not working");
	}
	
	public void verifyEMIInterestRateSlider() {
		String amount1=interestRate.getAttribute("value");
  		act.dragAndDropBy(interestRateSlider, 10, 0).build().perform();
  		String amount2 = interestRate.getAttribute("value");
  		boolean amount = amount1.equals(amount2);
  		Assert.assertEquals(false, amount);
  		System.out.println("Interest rate slider working........... ");
	}
	
	public void EmiTenureText(){
		boolean flag = loanTenure.isEnabled();
		Assert.assertTrue(flag);
		Assert.assertEquals(flag, true,"Text Box is not working");
	}
	
	public void verifyEMILoanTenureSlider() {

	
		String amount1=loanTenure.getAttribute("value");
  		act.dragAndDropBy(loanTenureSlider, 10, 0).build().perform();
  		String amount2 = loanTenure.getAttribute("value");
  		boolean amount = amount1.equals(amount2);
  		Assert.assertEquals(false, amount);
  		System.out.println("Interest rate slider working........... ");
	}
	
	public void emifeeChargeText(){
		boolean flag = loanFees.isDisplayed();
		Assert.assertTrue(flag);
		Assert.assertEquals(flag, true,"Text Box is not working");
	}
	
	public void verifyEMIFeeChargeSlider() {
		String amount1=loanFees.getAttribute("value");
  		act.dragAndDropBy(loanfeeSlider, 10, 0).build().perform();
  		String amount2 = loanFees.getAttribute("value");
  		boolean amount = amount1.equals(amount2);
  		Assert.assertEquals(false, amount);
  		System.out.println("Interest rate slider working........... ");
	}
		
	//UI CHECK FOR LOAN TENURE CALCULATOR	
	public void clickOnLoanTenureCalculator() {
		loanTenureCalculator.click();
	}
	
	public void loanAmountTenureText(){
		boolean flag = loanAmount.isDisplayed();
		Assert.assertTrue(flag);
		Assert.assertEquals(flag, true,"Text Box is not working");
	}
	
	public void verifyLoanAmountTenureSlider() {
		String amount1=loanAmount.getAttribute("value");
  		act.dragAndDropBy(loanAmountSlider, 10, 0).build().perform();
  		String amount2 = loanAmount.getAttribute("value");
  		boolean amount = amount1.equals(amount2);
  		Assert.assertEquals(false, amount);
  		System.out.println("Loan Interest slider working........... ");
	}
	
	public void tenureEmiAmountText(){
		boolean flag = loanemi.isDisplayed();
		Assert.assertEquals(flag, true,"Text Box is not working");
	}
	
	public void verifyTenureEMISlider() {
		String amount1=loanemi.getAttribute("value");
  		act.dragAndDropBy(emiSlider, 10, 0).build().perform();
  		String amount2 = loanemi.getAttribute("value");
  		boolean amount = amount1.equals(amount2);
  		Assert.assertEquals(false, amount);
  		System.out.println("Interest rate slider working........... ");
	}
	
	public void tenureInterestRateText(){
		boolean flag = interestRate.isDisplayed();
		Assert.assertTrue(flag);
		Assert.assertEquals(flag, true,"Text Box is not working");
	}
	
	public void verifyTenureInterestRateSlider() {
		String amount1=interestRate.getAttribute("value");
  		act.dragAndDropBy(interestRateSlider, 10, 0).build().perform();
  		String amount2 = interestRate.getAttribute("value");
  		boolean amount = amount1.equals(amount2);
  		Assert.assertEquals(false, amount);
  		System.out.println("Interest rate slider working........... ");
	}
	
	public void tenurefeeChargeText(){
		boolean flag = loanFees.isDisplayed();
		Assert.assertTrue(flag);
		Assert.assertEquals(flag, true,"Text Box is not working");
	}
	
	public void verifytenureFeeChargeSlider() {
		String amount1=loanFees.getAttribute("value");
  		act.dragAndDropBy(loanfeeSlider, 10, 0).build().perform();
  		String amount2 = loanFees.getAttribute("value");
  		boolean amount = amount1.equals(amount2);
  		Assert.assertEquals(false, amount);
  		System.out.println("Interest rate slider working........... ");
	}	
	
}