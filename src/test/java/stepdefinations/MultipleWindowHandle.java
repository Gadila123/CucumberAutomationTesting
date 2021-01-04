package stepdefinations;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\All Softwares\\ChromeDriver's\\chromedriver_87\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String parent_window=driver.getWindowHandle();
		System.out.println("Parent window id :"+parent_window);
		System.out.println("Parent window title :"+driver.getTitle());
		
		Set<String> windows=driver.getWindowHandles();
		
		for(String window:windows) {
			if(!(parent_window==window)) {
				
				driver.switchTo().window(window);
				System.out.println("window id :"+window);
				System.out.println(driver.getTitle());
				
				driver.close();
				//driver.switchTo().window(parent_window);
			}
		}

	}

}
