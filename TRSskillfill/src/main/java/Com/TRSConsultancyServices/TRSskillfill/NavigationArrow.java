package Com.TRSConsultancyServices.TRSskillfill;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NavigationArrow extends AboutDetails {
	
	@Test
	public void uparrow() {
		
		WebElement arrowbtn = driver.findElement(By.xpath("//*[@class='lni-chevron-up']"));
		boolean upbutton = arrowbtn.isEnabled();
		System.out.println(upbutton);
		if(upbutton == true) 
			arrowbtn.click();
	}

}
