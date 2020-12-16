package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBrowserLunchTest {
	
	public static void main(String Args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "G:\\All Softwares\\ChromeDriver's\\chromedriver_87\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goinglobal.com/demo-registration-form");
		Thread.sleep(3000);
		driver.findElement(By.id("edit-submitted-name")).sendKeys("Venkkatesh Gadila");
		driver.findElement(By.id("edit-submitted-phone")).sendKeys("92363633636");
		driver.findElement(By.id("edit-submitted-organization-university")).sendKeys("CMR College of Engineering");
		driver.findElement(By.id("edit-submitted-department")).sendKeys("Electrical and Electroics");
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
