package Com.TRSConsultancyServices.TRSskillfill;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Footer_part extends AboutDetails  {

	@Test
	void Homepage() {

		driver.findElement(By.xpath("(//*[text()='TRS Consultancy'])[2]")).click();
		String urltitle1 = driver.getCurrentUrl();
		System.out.println("Title 1:" + urltitle1);
		System.out.println(driver.getTitle());
		JavascriptExecutor scrolldown = (JavascriptExecutor) driver;
		scrolldown.executeScript("window.scrollBy(0,6000)");

	}

	@Test
	void services() {

		driver.findElement(By.xpath("//*[text()='Business Consultancy']")).click();
		String urltitle2 = driver.getCurrentUrl();
		System.out.println("Title 2:" + urltitle2);

		driver.navigate().back();

		driver.findElement(By.xpath("//*[text()='Job Consulting']")).click();
		String urltitle3 = driver.getCurrentUrl();
		System.out.println("Title 3:" + urltitle3);

		driver.navigate().back();

		driver.findElement(By.xpath("//*[text()='IT Consulting']")).click();
		String urltitle4 = driver.getCurrentUrl();
		System.out.println("Title 4:" + urltitle4);

		driver.navigate().back();

	}

	@Test
	void aboutus() {
		driver.findElement(By.xpath("//*[text()='Overview']")).click();
		String urltitle5 = driver.getCurrentUrl();
		System.out.println("Title 5:" + urltitle5);

		driver.navigate().back();

		driver.findElement(By.xpath("//*[text()='Why us']")).click();
		String urltitle6 = driver.getCurrentUrl();
		System.out.println("Title 6:" + urltitle6);

		driver.navigate().back();

		driver.findElement(By.xpath("//*[text()='Portfolio']")).click();
		String urltitle7 = driver.getCurrentUrl();
		System.out.println("Title 7:" + urltitle7);

		driver.navigate().back();
		
	}


	@Test
	public void uparrow() {
		
		WebElement arrowbtn = driver.findElement(By.xpath("//*[@class='lni-chevron-up']"));
		boolean upbutton = arrowbtn.isEnabled();
		System.out.println(upbutton);
		if(upbutton == true) 
			arrowbtn.click();
	}
	
}
