package hooks;


import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import driverfactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ConfigReader;

public class MyHooks {
	WebDriver driver;
	ConfigReader configReader;
	DriverFactory driverFactory;
	
	@Before
	public void setup() {
		
		configReader = new ConfigReader();
		Properties prop = configReader.intializeProperties();
		driverFactory = new DriverFactory();
		driver = driverFactory.intializeBrowser(prop.getProperty("browserName"));
		driver.get(prop.getProperty("url"));
		
		
	}
	
	@After
	public void tearDown(Scenario scenario) {
		
		String scenarioName = scenario.getName().replace(" ", "_");
		if(scenario.isFailed())
		{
			byte[] srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(srcScreenshot, "image/png", scenarioName);
		}
		driver.quit();	
		
	}

}
