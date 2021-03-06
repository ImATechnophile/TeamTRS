package Com.TRSConsultancyServices.TRSskillfill;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Footer_part extends LeaveMessage {
//11
	@Test
	void Homepage_logo() {

		driver.findElement(By.xpath("(//*[text()='TRS Consultancy'])[2]")).click();
		String urltitle1 = driver.getCurrentUrl();
		System.out.println("Title 1:" + urltitle1);
		System.out.println(driver.getTitle());
		driver.navigate().refresh();

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
	void Contactinfo() {
   
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//*[@class='lni-facebook']")).click();
		String fblink = driver.getCurrentUrl();
		System.out.println("fb link is :" + fblink);
		driver.navigate().refresh();

		driver.findElement(By.xpath("//*[@class='lni-twitter']")).click();
		String twitterlink = driver.getCurrentUrl();
		System.out.println("twitter link is:" + twitterlink);
		driver.navigate().refresh();

		driver.findElement(By.xpath("//*[@class='lni-instagram']")).click();
		String instagramlink = driver.getCurrentUrl();
		System.out.println("instagram link is:" + instagramlink);
		driver.navigate().refresh();

		driver.findElement(By.xpath("//*[@class='lni-linkedin']")).click();
		String linkedinlink = driver.getCurrentUrl();
		System.out.println("linkedin link is :" + linkedinlink);
		driver.navigate().refresh();
	}

	@Test
	public void uparrow() {

		WebElement arrowbtn = driver.findElement(By.xpath("//*[@class='lni-chevron-up']"));
		boolean upbutton = arrowbtn.isEnabled();
		System.out.println(upbutton);
		if (upbutton == true)
			arrowbtn.click();
	}

}
