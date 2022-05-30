package Com.TRSConsultancyServices.TRSskillfill;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HeaderLinks extends HomeSection {
	
	@Test
	public void checknavigation() {
		
		WebElement logo = driver.findElement(By.xpath("(//span[text()='TRS Consultancy'])[1]"));
		boolean logoclick = logo.isEnabled();
		System.out.println("Logo is clicked :"+ logoclick);
		
		WebElement home = driver.findElement(By.xpath("//a[text()='Home']"));
		boolean homeclick = home.isEnabled();
		System.out.println("Home is clicked :"+ homeclick);
		
		
		boolean homepagecontains = driver.getPageSource().contains("At SkillFill");
		System.out.println("Home Page Content is available :" + homepagecontains);
		
		boolean homepageimgdisplayed = driver.findElement(By.xpath("//img[@alt='Hero Image']")).isDisplayed();
		System.out.println("Home page Image displayed :" + homepageimgdisplayed);
		
		WebElement about = driver.findElement(By.xpath("//a[text()='About ']"));
		boolean aboutclick = about.isEnabled();
		System.out.println("About is clicked :"+ aboutclick);
		
		WebElement services = driver.findElement(By.xpath("//a[text()='Services']"));
		boolean servicesclick = services.isEnabled();
		System.out.println("Services is clicked :"+ servicesclick);
		
		WebElement contact = driver.findElement(By.xpath("//a[text()='Contact']"));
		boolean contactclick = contact.isEnabled();
		System.out.println("Contact is clicked :"+ contactclick);
		
		WebElement product = driver.findElement(By.xpath("//a[text()='Products']"));
		boolean productclick = product.isEnabled();
		System.out.println("Products is clicked :"+ productclick);
	}


}
