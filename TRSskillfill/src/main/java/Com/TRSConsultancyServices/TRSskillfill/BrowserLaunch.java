package Com.TRSConsultancyServices.TRSskillfill;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {

	WebDriver driver;

	@BeforeSuite
	public void BrowserOpen() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://trsskillfill.com/");
		driver.manage().window().maximize();

	}

	@AfterSuite
	public void closeBrowser() {

		driver.quit();
	}

}
