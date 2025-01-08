package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends BasePage{

	public RegisterPage(WebDriver driver) {

		super(driver);
	}

	@FindBy(xpath = "//h2[text()=\"New User Signup!\"]")
	private WebElement verifynewsignup;

	@FindBy(xpath = "//input[@name=\"name\"]")
	private WebElement entername;

	@FindBy(xpath = "(//input[@name=\"email\"])[2]")
	private WebElement enteremail;

	@FindBy(xpath = "//button[text()=\"Signup\"]")
	private WebElement clickSignup;

	@FindBy(xpath = "//b[text()=\"Enter Account Information\"]")
	private WebElement verifyaccountinformation;

	@FindBy(xpath = "//input[@value=\"Mr\"]")
	private WebElement mrtitle;

	@FindBy(xpath = "//input[@id=\"password\"]")
	private WebElement password;

	@FindBy(xpath = "//select[@id=\"days\"]")
	private WebElement days;

	@FindBy(xpath = "//select[@id=\"months\"]")
	private WebElement months;

	@FindBy(xpath = "//select[@id=\"years\"]")
	private WebElement years;

	@FindBy(xpath = "//input[@id=\"newsletter\"]")
	private WebElement newslettercheckbox;

	@FindBy(xpath = "//input[@id=\"optin\"]")
	private WebElement specialoffercheckbox;

	@FindBy(xpath = "//input[@id=\"first_name\"]")
	private WebElement first_nameagain;

	@FindBy(xpath = "//input[@id=\"last_name\"]")
	private WebElement last_nameagain;

	@FindBy(xpath = "//input[@id=\"company\"]")
	private WebElement company;

	@FindBy(xpath = "//input[@id=\"address1\"]")
	private WebElement address1;

	@FindBy(xpath = "//input[@id=\"address2\"]")
	private WebElement address2;

	@FindBy(xpath = "//select[@id=\"country\"]")
	private WebElement country;

	@FindBy(xpath = "//input[@id=\"state\"]")
	private WebElement state;

	@FindBy(xpath = "//input[@id=\"city\"]")
	private WebElement city;

	@FindBy(xpath = "//input[@id=\"zipcode\"]")
	private WebElement zipcode;

	@FindBy(xpath = "//input[@id=\"mobile_number\"]")
	private WebElement mobile_number;

	@FindBy(xpath = "//button[text()=\"Create Account\"]")
	private WebElement createaccountbutton;

	@FindBy(xpath = "//b[text()=\"Account Created!\"]")
	private WebElement verifyaccountcreated;

	@FindBy(xpath = "//a[text()=\"Continue\"]")
	private WebElement continuesecond;

	@FindBy(xpath = "//a[text()=\" Logged in as \"]")
	private WebElement loginedas;

	@FindBy(xpath = "//a[text()=\" Delete Account\"]")
	private WebElement deleteaccount;

	@FindBy(xpath = "//b[text()=\"Account Deleted!\"]")
	private WebElement verifydeletedaccount;

	public String verifyUserSignUp() {

		String value = verifynewsignup.getText();
		return value;

	}

	public void firstName(String value) {

		entername.sendKeys(value);
	}

	public void firstemail(String value) {

		enteremail.sendKeys(value);

	}

	public void clickSignUpButton() {

		clickSignup.click();
	}

	public String verifyAccountInformation() {

		String value = verifyaccountinformation.getText();

		return value;

	}

	public void mrTitle() {

		mrtitle.click();
	}

	public void password(String value) {

		password.sendKeys(value);

	}

	public void days(String value) {

		Select select = new Select(days);
		select.selectByValue(value);

	}

	public void months(String value) {

		Select select = new Select(months);
		select.selectByValue(value);

	}

	public void years(String value) {

		Select select = new Select(years);
		select.selectByValue(value);

	}

	public void newsLetterCheckbox() {

		newslettercheckbox.click();

	}

	public void specialOfferCheckbox() {

		specialoffercheckbox.click();

	}

	public void first_NameAgain(String value) {

		first_nameagain.sendKeys(value);

	}

	public void last_NameAgain(String value) {

		last_nameagain.sendKeys(value);

	}

	public void company(String value) {

		company.sendKeys(value);

	}

	public void address1(String value) {

		address1.sendKeys(value);

	}

	public void address2(String value) {

		address2.sendKeys(value);

	}

	public void country(String value) {

		Select select = new Select(country);
		select.selectByValue(value);

	}

	public void state(String value) {

		state.sendKeys(value);

	}

	public void city(String value) {

		city.sendKeys(value);

	}

	public void zipCode(String value) {

		zipcode.sendKeys(value);

	}

	public void mobile_Number(String value) {

		mobile_number.sendKeys(value);

	}

	public void createAccountButton() {

		createaccountbutton.click();

	}

	public String verifyAccountCreated() {

		String value = verifyaccountcreated.getText();
		return value;

	}

	public void continueSecondButton() {

		continuesecond.click();
	}

	public String verifyLoginedas() {

		String value = loginedas.getText();
		return value;
	}

	public void deleteAccountButton() {

		deleteaccount.click();

	}

	public String verifyDeltedAccount() {

		String value = verifydeletedaccount.getText();
		return value;

	}
}
