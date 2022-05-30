package Com.TRSConsultancyServices.TRSskillfill;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Services extends Footer_part {
	@Test
	
	public void ser() {

	WebElement item = driver.findElement(By.xpath("//li[@class='nav-item'][2 ]"));
	item.click();
	
	WebElement people = driver.findElement(By.id("business-tab"));
	people.click();
	
	WebElement product = driver.findElement(By.id("digital-tab"));
	product.click();
	
	
	WebElement alsrve = driver.findElement(By.xpath("//a[@class='main-btn main-btn-2']"));
	alsrve.click();
	
	WebElement scrl = driver.findElement(By.className("back-to-top"));
	scrl.click();
	

}
	
}
