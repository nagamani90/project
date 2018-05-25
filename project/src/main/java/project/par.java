package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.WebResponseData;

public class par {
	@Test
	public void sai() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arte241_nagamani\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
				driver.get("https://www.facebook.com/");
				
				driver.close();
	
	}
	

}
//mvn clean install       