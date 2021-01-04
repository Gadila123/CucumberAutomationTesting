package stepdefinations;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class MainHooks {
	public class Hooks{
		public WebDriver driver;


		  @Before
		  public void openBrowser() {
			  System.setProperty("webdriver.chrome.driver",
						"G:\\All Softwares\\ChromeDriver's\\chromedriver_87\\chromedriver.exe");
		  
		    driver = new ChromeDriver();
		    driver.manage().deleteAllCookies();
		    driver.manage().window().maximize();
		  }

		  @After
		  public void embedScreenshot(Scenario scenario) {

//		    if(scenario.isFailed()) {
//		      try {
//		        byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//		        scenario.embed(screenshot, "image/png");
//		      } catch (WebDriverException somePlatformsDontSupportScreenshots) {
//		        System.err.println(somePlatformsDontSupportScreenshots.getMessage());
//		      }

//		    }
		    driver.quit();
		  }}

	public static final WebDriver driver = null;}


