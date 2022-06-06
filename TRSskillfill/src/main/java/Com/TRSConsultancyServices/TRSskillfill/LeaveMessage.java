package Com.TRSConsultancyServices.TRSskillfill;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LeaveMessage extends  ContactUs {
	//9
	@Test
	void PerDetails() {
		WebElement detailsname = driver.findElement(By.xpath("//input[@name='name']"));
		detailsname.sendKeys("Kuppuraju");
		detailsname.sendKeys(Keys.TAB);
		WebElement detailsemail = driver.findElement(By.xpath("//input[@type='email']"));
		detailsemail.sendKeys("rajurbk12@gmail.com");
		detailsemail.sendKeys(Keys.TAB);
		WebElement detailsmsg = driver.findElement(By.xpath("//textarea[@name='message']"));
		detailsmsg.sendKeys("I am Interested");
		detailsmsg.sendKeys(Keys.ENTER);
		WebElement detailssubmit = driver.findElement(By.xpath("//button[@class='main-btn']"));
		detailssubmit.click();
		System.out.println("All Required Details Submited Successfully in Leave a Message Section");
	}
}
