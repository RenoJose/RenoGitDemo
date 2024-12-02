package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
public class FotMob {
	@Test
	@SuppressWarnings("deprecation")
	@Given ("^User is able to launch URL$")
	public void LaunchURL() throws Throwable {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		WebDriver driver = new ChromeDriver(options); 
		driver.get("https://www.fotmob.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
////		Match Results
//		MatchResults MatRes = new MatchResults(driver);
//		MatRes.Match();
	}

}