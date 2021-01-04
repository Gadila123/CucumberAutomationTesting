package stepdefinations;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MakeMytripHomePageTest {
	public static WebDriver driver;

	@Given("user navigate to MakeMyTrip Site")
	public void user_navigate_to_make_my_trip_site() {
		System.setProperty("webdriver.chrome.driver",
				"G:\\All Softwares\\ChromeDriver's\\chromedriver_87\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		String page_title=driver.getTitle();
		assertEquals("MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday", page_title);
		
	}

	@When("user on homepage and get all the travelling types")
	public void user_on_homepage_and_get_all_the_travelling_types() {
		List<WebElement> Travelling_Types=driver.findElements(By.xpath("//ul[@class='makeFlex font12']//li"));
		for(WebElement Travelling_type:Travelling_Types) {
			System.out.println(Travelling_type.getText());
		}
	}

	@Then("validate all travelling types")
	public void validate_all_travelling_types() {
		driver.quit();
	}

}
