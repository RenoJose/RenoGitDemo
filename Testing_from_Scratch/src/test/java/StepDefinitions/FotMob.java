package StepDefinitions;

import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

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
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "/test-output/screenshot.png";
		System.out.println(path);
		File destination = new File(path);
		Files.copy(screenshot, destination);
		System.out.println("Screenshot captured successfuly");
		
////		Match Results
//		MatchResults MatRes = new MatchResults(driver);
//		MatRes.Match();
	}

}
