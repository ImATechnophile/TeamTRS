package Com.TRSConsultancyServices.TRSskillfill;

import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TRSaboutsection extends HeaderLinks {
	//4
	@Test
	public void validateAbouturl() {
		
		WebElement Aboutlink = driver.findElement(By.xpath("(//a[@href='#about'])[1]"));
		String url = Aboutlink.getAttribute("href");
		
		try {
			HttpsURLConnection link = (HttpsURLConnection) new URL(url).openConnection();
			link.connect();
			if (link.getResponseCode() <= 400) {
				Aboutlink.click();
				System.out.println(url + " --is unbroken");
			} else {
				System.out.println(url + " --is broken");
			}

		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
