package Com.TRSConsultancyServices.TRSskillfill;

import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.apache.commons.lang3.ArrayUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HomeSection extends BrowserLaunch  {
	//2
	String[] broken;
	String[] unbroken;
	
	@Test
	public void findBrokenLinkes() {
		
		List<WebElement> findElements = driver.findElements(By.tagName("a"));
		int elementsize = findElements.size();
		System.out.println("Total Numbers of Links :" + elementsize );
		
		for (int i = 0; i < findElements.size(); i++) {
			
			WebElement webElement = findElements.get(i);
			String url = webElement.getAttribute("href");
			
			if(url==null ||url.isEmpty()) {
				System.out.println(url + "URL is Empty");
				continue;
			}

			try {
				HttpsURLConnection link = (HttpsURLConnection) new URL(url).openConnection();
				link.connect();
				if (link.getResponseCode() >= 400) {
					broken = (String[]) ArrayUtils.add(broken, url);
					System.out.println(url + " --is broken");
				} else {
					unbroken = (String[]) ArrayUtils.add(unbroken, url);
					System.out.println(url + " --is valid");
				}

			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
}
