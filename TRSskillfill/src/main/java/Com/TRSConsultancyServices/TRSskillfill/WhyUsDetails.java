package Com.TRSConsultancyServices.TRSskillfill;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WhyUsDetails extends ProductDetails {
// 8
	
	
	
	@Test
	public void WhyUs() throws Exception {
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Why us']")).click();
		Thread.sleep(5000);
		Assert.assertEquals(driver.findElement(By.xpath("//h6[text()='Why Us']")).getText(), "WHY US", "why us is not displayed");
		System.out.println("Whu Us redirected");
		Assert.assertTrue(driver.findElement(By.xpath("(//h4[@class='title'])[3]")).isDisplayed());
		
		Assert.assertTrue(driver.findElement(By.xpath("(//div[@class='service-icon'])[1]")).isDisplayed(), "Fisrst img is not displayed");
		System.out.println("first img displayed");
		Assert.assertTrue(driver.findElement(By.xpath("//h4[text()='Highly Experienced']")).isDisplayed(), "Highly Experienced is not displayed");
		Assert.assertTrue(driver.findElement(By.xpath("(//p[@class='text'])[7]")).isDisplayed(), "Highly Experienced text is not displayed");
		
		Assert.assertTrue(driver.findElement(By.xpath("(//div[@class='service-icon'])[2]")).isDisplayed(), "second img is not displayed");
		System.out.println("second img displayed");
		Assert.assertTrue(driver.findElement(By.xpath("//h4[text()='Bunch of Services']")).isDisplayed(), "Bunch of Services is not displayed");
		Assert.assertTrue(driver.findElement(By.xpath("(//p[@class='text'])[8]")).isDisplayed(), "Bunch of Services text is not displayed");
		
		Assert.assertTrue(driver.findElement(By.xpath("(//div[@class='service-icon'])[3]")).isDisplayed(), "third img is not displayed");
		System.out.println("third img displayed");
		Assert.assertTrue(driver.findElement(By.xpath("//h4[text()='Quality Support']")).isDisplayed(), "Quality Support is not displayed");
		Assert.assertTrue(driver.findElement(By.xpath("(//p[@class='text'])[9]")).isDisplayed(), "Quality Support text is not displayed");
		
		driver.findElement(By.xpath("//a[@class='main-btn main-btn-2']")).click();
		
		
	
		
		
		
	}

	

}
