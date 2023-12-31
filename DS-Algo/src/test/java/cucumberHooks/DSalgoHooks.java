package cucumberHooks;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import stepDefinition.BaseClass;

public class DSalgoHooks extends BaseClass {
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}