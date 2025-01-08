package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath="//img[@alt=\"Website for automation practice\"]")
	private WebElement verifyhomepage;
	
	@FindBy(xpath="//a[text()=\" Signup / Login\"]")
	private WebElement clicksignuplogin;
	
 
	public boolean verrifyHomePage() {
		
		boolean value =  verifyhomepage.isDisplayed();
		return value;
	}
	
	public void signUpLogin() {

		clicksignuplogin.click();

	}
}
