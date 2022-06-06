package Com.TRSConsultancyServices.TRSskillfill;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ContactUs extends WhyUsDetails {
	//9
	@Test
	void Contact() {
		WebElement contactdetails = driver.findElement(By.xpath("//a[@href='#contact']"));
		contactdetails.click();
		boolean contactclick = contactdetails.isEnabled();
		System.out.println("Contact is Clickable :" + contactclick);
		WebElement addressdetails = driver.findElement(By.xpath("(//div[@class='col-lg-4 col-md-6'])[1]"));
		Assert.assertTrue(addressdetails.isDisplayed());
	    System.out.println("Address is Displayed:"+addressdetails.isDisplayed());
		WebElement emailiddetails = driver.findElement(By.xpath("(//div[@class='col-lg-4 col-md-6'])[2]"));
		Assert.assertTrue(emailiddetails.isDisplayed());
		System.out.println("EmailID is Displayed:" + emailiddetails.isDisplayed());
		WebElement contactnumber = driver.findElement(By.xpath("(//div[@class='col-lg-4 col-md-6'])[3]"));
		Assert.assertTrue(contactnumber.isDisplayed());
		System.out.println("Contact Number is Displayed:" + contactnumber.isDisplayed());
	}
}


