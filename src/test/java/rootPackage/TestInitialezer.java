package rootPackage;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
public class TestInitialezer {
	public InvokeDriver invoke;
	public WebDriver driver;

	public TestInitialezer() throws IOException {
		invoke = new InvokeDriver();
		
	}
	
	 public void launch_browser() throws IOException {
		 driver=invoke.InitializeDriver();
	 }


}
