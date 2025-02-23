package rootPackage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import base_package.Root_Elements;
import java.io.IOException;

public class RunClass {

	// TODO Auto-generated method stub

	TestInitialezer test_initializer;
	Root_Elements root;

	public RunClass(TestInitialezer text_context) {
		// TODO Auto-generated constructor stub
		this.test_initializer = text_context;
	}

	@Given("Launch Browser")
	public void launch_browser() throws IOException {
		test_initializer.launch_browser();
		test_initializer.driver.get("https://magento.softwaretestingboard.com/");
	}

	@When("Navigate to the signup page")
	public void navigate_to_the_signup_page() {
		root = new Root_Elements(test_initializer.driver);
		root.signUp_Navigation();
	}

	@Then("^Fill user details with email (.+) , password (.+), confirmPassowrd (.+), firstName (.+) and LastName (.+)$")
	public void fill_user_details(String email, String password, String confirmPassowrd, String firstName,
			String LastName) {

		root.name_details(firstName, LastName);
		root.credentials_details(email, password, confirmPassowrd);
	}

	@And("Perform logout action")
	public void perform_logout_action() {

		root.signout_Action();
	}

	@Then("^Perorm login action with email (.+) and password (.+)$")
	public void perorm_login_action_with_recent_signup_account(String email, String password) {

		root.login_Action(email, password);
	}

}
