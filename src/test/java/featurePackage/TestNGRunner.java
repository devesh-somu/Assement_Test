package featurePackage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/featurePackage", glue = "rootPackage", monochrome = true)
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
