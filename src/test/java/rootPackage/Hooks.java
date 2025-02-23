package rootPackage;

import java.io.IOException;

import io.cucumber.java.After;

public class Hooks {
	TestInitialezer test_initializer;
	public Hooks(TestInitialezer test_initializer) throws IOException {

	      
	      
		this.test_initializer=test_initializer;
		
}
	
	@After()
	public void closeBrowser() {
		test_initializer.driver.quit();
	}
}
