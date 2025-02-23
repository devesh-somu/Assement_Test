package base_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class Root_Elements {
	WebDriver driver;

	public Root_Elements(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(css="div[class='panel header'] li:nth-child(3)")
	WebElement create_Account_navigation;
	
	@FindBy(id="firstname")
	WebElement first_name;
	
	@FindBy(id="lastname")
	WebElement last_name;
	
	
	@FindBy(id="email_address")
	WebElement email_field;
	
	
	@FindBy(id="password")
	WebElement password_field;
	
	@FindBy(id="password-confirmation")
	WebElement password_confirmation;
	
	
	@FindBy(css="button[class*='action submit")
	WebElement submit_created_account;
	
	
	@FindBy(xpath="//div[@class='panel header']//button")
	WebElement drop_Down_Click;
	
	
	@FindBy(xpath="//div[@data-target='dropdown']/ul/li[3]")
	WebElement  signOut;
	
	
	
	@FindBy(css="div[class='panel header'] li:nth-child(2)")
	WebElement login_navigation;
	
	
	@FindBy(id="email")
	WebElement login_email;
	
	
	@FindBy(id="pass")
	WebElement login_pass;
	
	
	@FindBy(css="button[class*='action login']")
	WebElement login_click;
	
	
	public void signUp_Navigation() {
		create_Account_navigation.click();
		
	}
	
	public void name_details(String firstname, String lastname) {
		first_name.sendKeys(firstname);
		last_name.sendKeys(lastname);
	}
	
	
	
	public void credentials_details(String email, String pass, String confirmPass) {
		email_field.sendKeys(email);
		password_field.sendKeys(pass);
		password_confirmation.sendKeys(confirmPass);
		submit_created_account.click();
	}
	
	
	public void signout_Action() {
		drop_Down_Click.click();
		signOut.click();
	}
	
	
	public void login_Action(String email, String pass) {
		login_navigation.click();
		login_email.sendKeys(email);
		login_pass.sendKeys(pass);
		login_click.click();
	}
	
	
	
	
	
}
