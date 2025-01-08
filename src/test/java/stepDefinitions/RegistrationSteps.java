package stepDefinitions;

import java.util.Map;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.RegisterPage;

public class RegistrationSteps {

	HomePage hp;
	RegisterPage rp;

	@Given("verify user navigate to homepage")
	public void verify_user_navigate_to_homepage() {

		hp = new HomePage(BaseClass.getDriver());
		boolean value = hp.verrifyHomePage();
		Assert.assertTrue(value);

	}

	@When("user clicks on signup\\/login button")
	public void user_clicks_on_signup_login_button() {

		hp.signUpLogin();
	}

	@Then("verify {string} is visible")
	public void verify_is_visible(String value) {

		rp = new RegisterPage(BaseClass.getDriver());

		String val = rp.verifyUserSignUp();
		Assert.assertEquals(val, value);
	}

	@When("user enter name {string} and email {string}")
	public void user_enter_name_and_email(String string, String string2) {

		rp.firstName("sarang");
		rp.firstemail(BaseClass.getNumericValues() + "@gmail.com");

	}

	@When("user clicks on signup button")
	public void user_clicks_on_signup_button() {

		rp.clickSignUpButton();
	}

	@Then("verify that {string} is visible")
	public void verify_that_is_visible(String value) {

		String val = rp.verifyAccountInformation();
		Assert.assertEquals(val, value);

	}

	@When("user click as the title")
	public void user_click_as_the_title() {

		rp.mrTitle();
	}

	@When("user  enter the following details:")
	public void user_enter_the_following_details(DataTable dataTable) {

		Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
		rp.password(dataMap.get("Password"));

	}

	@When("user select the date of birth:")
	public void user_select_the_date_of_birth() {

		rp.days("12");
		rp.months("7");
		rp.years("1992");
	}

	@When("user check the Sign up for newsletter option")
	public void user_check_the_sign_up_for_newsletter_option() {

		rp.newsLetterCheckbox();
	}

	@When("user check the Receive special offers option")
	public void user_check_the_receive_special_offers_option() {

		rp.specialOfferCheckbox();
	}

	@When("user enter the following address details:")
	public void user_enter_the_following_address_details(DataTable dataTable) {

		Map<String, String> dataMap = dataTable.asMap(String.class, String.class);

		rp.first_NameAgain(dataMap.get("First Name"));
		rp.last_NameAgain(dataMap.get("Last Name"));
		rp.company(dataMap.get("Company"));
		rp.address1(dataMap.get("Address"));
		rp.address2(dataMap.get("Address 2"));
		rp.country(dataMap.get("Country"));
		rp.state(dataMap.get("State"));
		rp.city(dataMap.get("City"));
		rp.zipCode(dataMap.get("Zipcode"));
		rp.mobile_Number(dataMap.get("Mobile"));
	}

	@When("user clicks on create account")
	public void user_clicks_on_create_account() {

		rp.createAccountButton();
	}

	@Then("Account should ber created and message like {string} should display")
	public void account_should_ber_created_and_message_like_should_display(String value) {

		String val = rp.verifyAccountCreated();
		Assert.assertEquals(val, value);
	}

	@When("click on continue button")
	public void click_on_continue_button() {

		rp.continueSecondButton();
	}

	@Then("user shoud see {string}")
	public void user_shoud_see(String val) {

		String value = rp.verifyLoginedas();
		String valuess = val + "sarang";
		Assert.assertEquals(valuess.trim(), value.trim());
	}

	@When("user click on delete account button")
	public void user_click_on_delete_account_button() {

		rp.deleteAccountButton();
	}

	@Then("user should logout sucessfully and should see {string} message")
	public void user_should_logout_sucessfully_and_should_see_message(String values) {

		String value = rp.verifyDeltedAccount();
		Assert.assertEquals(values, value);

	}

}
