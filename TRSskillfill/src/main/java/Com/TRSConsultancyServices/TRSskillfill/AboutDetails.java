package Com.TRSConsultancyServices.TRSskillfill;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AboutDetails extends AboutSectionContent {
	
	SoftAssert soft = new SoftAssert();

	@Test
	public void content() {
		WebElement details = driver.findElement(By.xpath("//h3[@class='title']"));
		String sentence = details.getText();
		System.out.println("ActualResult" + sentence);

		soft.assertEquals("We not only build better products. People who build better products too 😎",
				"We not only build better products. People who build better products too 😎");
		soft.assertAll();
	}

}
