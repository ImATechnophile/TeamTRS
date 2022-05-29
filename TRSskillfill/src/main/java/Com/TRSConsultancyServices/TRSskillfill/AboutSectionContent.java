package Com.TRSConsultancyServices.TRSskillfill;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AboutSectionContent extends TRSaboutsection {
	
SoftAssert soft = new SoftAssert();
	
	@Test
	public void About() {
		
		WebElement welcome = driver.findElement(By.xpath("//h6[@class='welcome']"));
		String text = welcome.getText();
		System.out.println("ActualResult"+text);
		
//		boolean status = driver.getPageSource().contains(text);
//		System.out.println(status);
		
		soft.assertEquals("WELCOME","WELCOME");
		soft.assertAll();
	}

}
